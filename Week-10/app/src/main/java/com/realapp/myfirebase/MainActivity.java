package com.realapp.myfirebase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3;
    Button b1;
    DatabaseReference my;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.et1);
        e2= (EditText) findViewById(R.id.et2);
        e3= (EditText) findViewById(R.id.et3);
        b1= (Button) findViewById(R.id.btn1);

        my = FirebaseDatabase.getInstance().getReference("key");

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                save();
            }
        });




    }

    private void save() {
        String name= e1.getText().toString().trim();
        String age = e2.getText().toString().trim();
        String email = e3.getText().toString().trim();

        String key = my.push().getKey();

        student m = new student(name, age,email);
  

         my.child(key).setValue(m);

        Toast.makeText(getApplicationContext(),"Succesfully saved",Toast.LENGTH_LONG).show();
    }
}
