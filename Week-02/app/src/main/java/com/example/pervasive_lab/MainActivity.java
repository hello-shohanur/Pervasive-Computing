package com.example.pervasive_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mytv = findViewById(R.id.tv1);
        TextView mybutton = findViewById(R.id.btn1);


        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mytv.setText("Welcome to android  world!");
                Toast.makeText(MainActivity.this, "LogIn Success!!", Toast.LENGTH_SHORT).show();
            }
        });




    }
}