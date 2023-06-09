package com.tantangan.aplikasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class akhlak_menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhlak_menu);

        drawerLayout = findViewById(R.id.drawer_layout1);
        navigationView = findViewById(R.id.nav_view_akhlak);
        toolbar = findViewById(R.id.akhlak_toolbar);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        RelativeLayout relativeLayout = findViewById(R.id.materi_arti_akhlak);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(akhlak_menu.this, arti_akhlak.class);
                startActivity(intent);
            }
        });

        RelativeLayout relativeLayout1 = findViewById(R.id.macam_akhlak);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(akhlak_menu.this, macam_akhlak.class);
                startActivity(intent1);
            }
        });

        RelativeLayout relativeLayout2 = findViewById(R.id.praktik_akhlak);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(akhlak_menu.this, "Sedang Dibuat", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                Intent intent = new Intent(akhlak_menu.this, Dashboard.class);
                startActivity(intent);
                break;
            case R.id.nav_akidah:
                Intent intent1 = new Intent(akhlak_menu.this, akidah_menu.class);
                break;
            case R.id.nav_akhlak:
                Toast.makeText(this, "Anda Telah Berada Di Halaman", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_fiqih:
                Intent intent2 = new Intent(akhlak_menu.this, fiqih_menu.class);
                startActivity(intent2);
                break;
            case R.id.nav_hadis:
                Intent intent3 = new Intent(akhlak_menu.this, hadis_menu.class);
                startActivity(intent3);
                break;
            case R.id.nav_doa:
                Intent intent4 = new Intent(akhlak_menu.this, doa_menu.class);
                startActivity(intent4);
                break;
            case R.id.nav_kisahnabi:
                Toast.makeText(this, "Sementara Dibuat", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_share:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_rate:
                Toast.makeText(this, "Rate", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_setting:
                Toast.makeText(this, "Pengaturan", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_feedback:
                Toast.makeText(this, "Sedang Menunggu Dibuat", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_panduan:
                Toast.makeText(this, "Tunggu Update", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START );
        return true;
    }
}