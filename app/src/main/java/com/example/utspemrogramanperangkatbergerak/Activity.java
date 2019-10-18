package com.example.utspemrogramanperangkatbergerak;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        TextView text = (TextView) findViewById(R.id.link1);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
