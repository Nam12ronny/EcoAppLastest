package com.example.ecosense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginOptions extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_options);
        getSupportActionBar().hide();

        Button tosingup = findViewById(R.id.tosingup);
         tosingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nxt = new Intent(getApplicationContext(),MainDashboard.class);
                startActivity(nxt);
            }
        });
        TextView signup = findViewById(R.id.textView7);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nxt = new Intent(getApplicationContext(),signup2.class);
                startActivity(nxt);
            }
        });
    }
}