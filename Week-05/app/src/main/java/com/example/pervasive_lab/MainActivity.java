package com.example.pervasive_lab;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,
            button7,button8, button9,buttonPoint, buttonMul,buttonDiv,
            buttonSub,buttonAdd,buttonC,buttonEqu,buttonPercent;
    TextView textView;
    boolean addition,subtraction,multiplication,
            division,percent;float value1,value2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0= (Button)findViewById(R.id.button0);
        button1= (Button)findViewById(R.id.button1);
        button2= (Button)findViewById(R.id.button2);
        button3= (Button)findViewById(R.id.button3);
        button4= (Button)findViewById(R.id.button4);
        button5= (Button)findViewById(R.id.button5);
        button6= (Button)findViewById(R.id.button6);
        button7= (Button)findViewById(R.id.button7);
        button8= (Button)findViewById(R.id.button8);
        button9= (Button)findViewById(R.id.button9);
        buttonPoint= (Button)findViewById(R.id.buttonPoint);
        buttonMul= (Button)findViewById(R.id.buttonMul);
        buttonDiv= (Button)findViewById(R.id.buttonDiv);
        buttonSub= (Button)findViewById(R.id.buttonSub);
        buttonAdd= (Button)findViewById(R.id.buttonAdd);
        buttonC= (Button)findViewById(R.id.buttonC);
        buttonEqu= (Button)findViewById(R.id.buttonEqu);
        buttonPercent= (Button)findViewById(R.id.ButtonPercent);
        textView= (TextView)findViewById(R.id.textView);



        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"9");
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+".");
            }});




        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView == null)
                {
                    textView.setText("");
                }else
                {value1= Float.parseFloat(textView.getText() + "");
                    addition=true;
                    textView.setText(null);
                }}
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView == null)
                {textView.setText("");
                }else
                {value1= Float.parseFloat(textView.getText() + "");
                    subtraction=true;
                    textView.setText(null);
                }}
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView == null)
                {
                    textView.setText("");
                }else
                {   value1= Float.parseFloat(textView.getText() + "");
                    multiplication=true;
                    textView.setText(null);
                }}});

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView == null)
                {
                    textView.setText("");
                }else
                {
                    value1= Float.parseFloat(textView.getText() + "");
                    division=true;
                    textView.setText(null);}}});
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView == null)
                {
                    textView.setText("");
                }else
                {value1= Float.parseFloat(textView.getText() + "");
                    textView.setText(null);}}});

        buttonEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2= Float.parseFloat(textView.getText()+ "");
                if (addition==true)
                {textView.setText(value1 + value2 + "");
                    addition=false;
                }
                if (subtraction==true)
                {textView.setText(value1 - value2 + "");
                    subtraction=false;
                }
                if (multiplication==true)
                {textView.setText(value1 * value2 + "");
                    multiplication=false;
                }
                if (division==true)
                    try
                    {textView.setText(value1 / value2 + "");
                        division=false;
                    } catch (Exception e)
                    {Log.d("Calc", e.getMessage());
                    }}});
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });}}
