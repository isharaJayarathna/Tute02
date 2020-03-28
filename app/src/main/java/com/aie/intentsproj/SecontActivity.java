package com.aie.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecontActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView ans;
    double answer;

    Button plus,sub,multi,div;
    String x,y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secont);

        num1 = findViewById(R.id.editT3);
        num2 = findViewById(R.id.editT4);
        ans = findViewById(R.id.text5);
        plus = findViewById(R.id.but2);
        sub = findViewById(R.id.but3);
        multi = findViewById(R.id.but4);
        div = findViewById(R.id.but5);

        Intent recieveIntent = getIntent();

        x = recieveIntent.getStringExtra("number1");
        y = recieveIntent.getStringExtra("number2");

        num1.setText(x);
        num2.setText(y);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(x) + Double.parseDouble(y);
                ans.setText(Double.toString(answer));


            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(x) - Double.parseDouble(y);
                ans.setText(Double.toString(answer));
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(x) * Double.parseDouble(y);
                ans.setText(Double.toString(answer));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(x) / Double.parseDouble(y);
                ans.setText(Double.toString(answer));
            }
        });


    }
}
