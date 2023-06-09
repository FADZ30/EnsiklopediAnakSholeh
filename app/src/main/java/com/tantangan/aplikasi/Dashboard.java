package com.tantangan.aplikasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        RelativeLayout relativeLayout1 = findViewById(R.id.akhlak);
        RelativeLayout relativeLayout2 = findViewById(R.id.akidah);
        RelativeLayout relativeLayout3 = findViewById(R.id.fiqih);
        RelativeLayout relativeLayout4 = findViewById(R.id.hadis);
        RelativeLayout relativeLayout5 = findViewById(R.id.doa);
        RelativeLayout relativeLayout6 = findViewById(R.id.nabi);

        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent akhlak = new Intent(Dashboard.this, akhlak_menu.class);
                startActivity(akhlak);
            }
        });

        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent akidah = new Intent(Dashboard.this, akidah_menu.class);
                startActivity(akidah);
            }
        });

        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fiqih = new Intent(Dashboard.this, fiqih_menu.class);
                startActivity(fiqih);
            }
        });

        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hadis = new Intent(Dashboard.this, hadis_menu.class);
                startActivity(hadis);
            }
        });

        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent doa = new Intent(Dashboard.this, doa_menu.class);
                startActivity(doa);
            }
        });

        relativeLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Dashboard.this, "Sementara Dibuat", Toast.LENGTH_SHORT).show();
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


    //Bagian Navigation Drawer
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.nav_akidah:
                Intent intent = new Intent(Dashboard.this, akidah_menu.class);
                startActivity(intent);
                break;
            case R.id.nav_akhlak:
                Intent intent1 = new Intent(Dashboard.this, akhlak_menu.class);
                startActivity(intent1);
                break;
            case R.id.nav_fiqih:
                Intent intent2 = new Intent(Dashboard.this, fiqih_menu.class);
                startActivity(intent2);
                break;
            case R.id.nav_hadis:
                Intent intent3 = new Intent(Dashboard.this, hadis_menu.class);
                startActivity(intent3);
                break;
            case R.id.nav_doa:
                Intent intent4 = new Intent(Dashboard.this, doa_menu.class);
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
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}