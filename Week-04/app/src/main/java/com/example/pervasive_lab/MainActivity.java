package com.example.pervasive_lab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText firstnum,secondnum;
    TextView r;
    Button bt;
    double a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnum=(EditText) findViewById(R.id.first);
        secondnum=(EditText) findViewById(R.id.second);
        bt=(Button) findViewById(R.id.buttonadd);
        r=(TextView) findViewById(R.id.result);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(firstnum.getText().toString());
                b=Double.parseDouble(secondnum.getText().toString());
                c=a+b;
                r.setText("Sum="+c);
            }
        });
    }
}