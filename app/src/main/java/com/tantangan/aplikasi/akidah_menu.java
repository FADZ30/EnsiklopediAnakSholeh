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

public class akidah_menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akidah_menu);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view_akidah);
        toolbar = findViewById(R.id.akidah_toolbar);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        RelativeLayout relativeLayout = findViewById(R.id.materi_iman);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(akidah_menu.this, iman.class);
                startActivity(intent);
            }
        });

        RelativeLayout relativeLayout1 = findViewById(R.id.materi_islam);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(akidah_menu.this, islam.class);
                startActivity(intent1);
            }
        });

        RelativeLayout relativeLayout2 = findViewById(R.id.rukun_iman);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(akidah_menu.this, rukun_iman.class);
                startActivity(intent2);
            }
        });

        RelativeLayout relativeLayout3 = findViewById(R.id.kehidupan_kedua);
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(akidah_menu.this, kehidupan_kedua.class);
                startActivity(intent3);
            }
        });
    }

    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menu_item) {
        switch (menu_item.getItemId()){
            case R.id.nav_home:
                Intent intent = new Intent(akidah_menu.this, Dashboard.class);
                startActivity(intent);
                break;
            case R.id.nav_akidah:
                Toast.makeText(this, "Anda Telah Berada Di Halaman", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_akhlak:
                Intent intent1 = new Intent(akidah_menu.this, akhlak_menu.class);
                startActivity(intent1);
                break;
            case R.id.nav_fiqih:
                Intent intent2 = new Intent(akidah_menu.this, fiqih_menu.class);
                startActivity(intent2);
                break;
            case R.id.nav_hadis:
                Intent intent3 = new Intent(akidah_menu.this, hadis_menu.class);
                startActivity(intent3);
                break;
            case R.id.nav_doa:
                Intent intent4 = new Intent(akidah_menu.this, doa_menu.class);
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