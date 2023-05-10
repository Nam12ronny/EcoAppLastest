package com.example.ecosense;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainDashboard extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);
        getSupportActionBar().hide();
        bottomNavigationView = findViewById(R.id.bottomnavigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();
                        return true;
                    case R.id.updates:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new NewsUpdates()).commit();
                        return true;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new UserProfile()).commit();
                        return true;
                    case R.id.pickup:
                        new RequestPick();
                        return true;
                }

                return false;
            }
        });




//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent nxt = new Intent(getApplicationContext(),RequestPick.class);
//                startActivity(nxt);
//            }
//        },10000);
    }
}