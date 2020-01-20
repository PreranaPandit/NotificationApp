package com.example.prerana.notificationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnnotification_one, btnnotification_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnotification_one = findViewById(R.id.notification_one);
        btnnotification_two = findViewById(R.id.notification_two);



    }
}
