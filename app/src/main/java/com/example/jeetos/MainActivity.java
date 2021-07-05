package com.example.jeetos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button sum,minus,devide,multiply;
   TextView result;
   int ans=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPersonName2);
        sum=findViewById(R.id.button);
        minus=findViewById(R.id.button2);
        devide=findViewById(R.id.button3);
        multiply=findViewById(R.id.button4);
getSupportActionBar().hide();
        result=findViewById(R.id.textView);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double num1=Double.parseDouble(e1.getText().toString());
                Double num2=Double.parseDouble(e2.getText().toString());
                Double add=num1+num2;
                result.setText(Double.toString(add));





            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double num1=Double.parseDouble(e1.getText().toString());
                Double num2=Double.parseDouble(e2.getText().toString());
                Double mul=num1*num2;
                result.setText(Double.toString(mul));





            }
        });
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double num1=Double.parseDouble(e1.getText().toString());
                Double num2=Double.parseDouble(e2.getText().toString());
                Double dev=num1/num2;
                result.setText(Double.toString(dev));





            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double num1=Double.parseDouble(e1.getText().toString());
                Double num2=Double.parseDouble(e2.getText().toString());
                Double min=num1-num2;
                result.setText(Double.toString(min));





            }
        });
    }
}