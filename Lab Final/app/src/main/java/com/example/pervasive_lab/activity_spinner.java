package com.example.pervasive_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class activity_spinner extends AppCompatActivity implements AdapterView.OnItemClickListener,
        AdapterView.OnItemSelectedListener {

    String[] team = {"Choose category: ", "Argentina", "Brazil", "Germany", "Spain"};

    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, team);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(ad);

    }

    @Override    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {}

    @Override    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if (adapterView.getItemAtPosition(i).equals("Choose category: ")){}
        if(adapterView.getItemAtPosition(i).equals("Argentina")){
            String a = "Argentina";
            Intent intent = new Intent(activity_spinner.this, MainActivity3.class);
            intent.putExtra("RED", a);
            startActivity(intent);
        }
        if(adapterView.getItemAtPosition(i).equals("Brazil")){
            String a = "Brazil";
            Intent intent = new Intent(activity_spinner.this, MainActivity3.class);
            intent.putExtra("RED", a);
            startActivity(intent);
        }
        if(adapterView.getItemAtPosition(i).equals("Germany")){
            String a = "Germany";
            Intent intent = new Intent(activity_spinner.this, MainActivity3.class);
            intent.putExtra("RED", a);
            startActivity(intent);
        }
        if(adapterView.getItemAtPosition(i).equals("Spain")){
            String a = "Spain";
            Intent intent = new Intent(activity_spinner.this, MainActivity3.class);
            intent.putExtra("RED", a);
            startActivity(intent);
        }
    }

    @Override    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}