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

public class fiqih_menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiqih_menu);

        drawerLayout = findViewById(R.id.drawer_layout4);
        navigationView = findViewById(R.id.nav_view_fiqih);
        toolbar = findViewById(R.id.fiqih_toolbar);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        RelativeLayout relativeLayout = findViewById(R.id.materi_najis);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fiqih_menu.this, najis.class);
                startActivity(intent);
            }
        });

        RelativeLayout relativeLayout1 = findViewById(R.id.materi_wudhu);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(fiqih_menu.this, wudhu.class);
                startActivity(intent1);
            }
        });

        RelativeLayout relativeLayout2 = findViewById(R.id.materi_tayamum);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(fiqih_menu.this, tayamum.class);
                startActivity(intent2);
            }
        });

        RelativeLayout relativeLayout3 = findViewById(R.id.materi_sholat);
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(fiqih_menu.this, shalat.class);
                startActivity(intent3);
            }
        });

        RelativeLayout relativeLayout4 = findViewById(R.id.materi_puasa);
        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(fiqih_menu.this, puasa.class);
                startActivity(intent4);
            }
        });

        RelativeLayout relativeLayout5 = findViewById(R.id.materi_zakat_sedekah);
        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(fiqih_menu.this, zakat_sedekah.class);
                startActivity(intent5);
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
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                Intent intent = new Intent(fiqih_menu.this, Dashboard.class);
                startActivity(intent);
                break;
            case R.id.nav_akidah:
                Intent intent2 = new Intent(fiqih_menu.this, akidah_menu.class);
                startActivity(intent2);
                break;
            case R.id.nav_akhlak:
                Intent intent1 = new Intent(fiqih_menu.this, akhlak_menu.class);
                startActivity(intent1);
                break;
            case R.id.nav_fiqih:
                Toast.makeText(this, "Anda Telah Berada Di Halaman", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_hadis:
                Intent intent3 = new Intent(fiqih_menu.this, hadis_menu.class);
                startActivity(intent3);
                break;
            case R.id.nav_doa:
                Intent intent4 = new Intent(fiqih_menu.this, doa_menu.class);
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