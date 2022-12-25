package com.example.pervasive_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView tv1 = (TextView) findViewById(R.id.tv1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView tv2 = (TextView) findViewById(R.id.tv2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton rb3 = (RadioButton) findViewById(R.id.rb3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton rb4 = (RadioButton) findViewById(R.id.rb4);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = (Button) findViewById(R.id.btn);

        Intent in = getIntent();
        String p = in.getStringExtra("RED");
        tv1.setText(p);

        button.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View view) {
                if(rb2.isChecked()){
                    tv2.setText("Answer is correct.");
                }else{
                    tv2.setText("Answer is incorrct.");
                }
            }
        });
    }
}