package com.example.utspemrogramanperangkatbergerak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    private Button activity,service,broadcast,intent,provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Button button = (Button) findViewById(R.id.activity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }

            public void openActivity() {
                Intent intent = new Intent(Home.this, Activity.class);
                startActivity(intent);
            }
        });

        button  = (Button) findViewById(R.id.service);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openService();
            }

            public void openService() {
                Intent intent = new Intent(Home.this, Service.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.broadcast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBroadcast();
            }

            public void openBroadcast() {
                Intent intent = new Intent(Home.this, Broadcast.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.intent);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIntent();
            }

            public void openIntent() {
                Intent intent = new Intent(Home.this, com.example.utspemrogramanperangkatbergerak.Intent.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.provider);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProvider();
            }

            public void openProvider() {
                Intent intent = new Intent(Home.this, Content.class);
                startActivity(intent);
            }
        });

    }}