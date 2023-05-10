package com.example.ecosense;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    protected ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listOfItems);
        getSupportActionBar().hide();

        ArrayList<String> delivered = new ArrayList();
        ArrayList<String> cleared = new ArrayList();
        ArrayList<String> location = new ArrayList();

        delivered.add("delivered 1");
        delivered.add("delivered 2");
        delivered.add("delivered 3");
        delivered.add("delivered 4");
        delivered.add("delivered 5");

        cleared.add("Cleared 1");
        cleared.add("Cleared 2");
        cleared.add("Cleared 3");
        cleared.add("Cleared 4");
        cleared.add("Cleared 5");

        location.add("2 min");
        location.add("4 min");
        location.add("6 min");
        location.add("8 min");
        location.add("10 min");

        TransasctionAdapter myadapter = new TransasctionAdapter(getApplicationContext(),delivered,cleared,location);
        ListView listView = findViewById(R.id.listOfItems);
        listView.setAdapter(myadapter);
    }
}