package com.aie.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText no1,no2;
    Button butOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        no1 = findViewById(R.id.editT1);
        no2 = findViewById(R.id.editT2);
        butOK = findViewById(R.id.but1);

        butOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstActivity.this, SecontActivity.class);
                intent.putExtra("number1", no1.getText().toString());
                intent.putExtra("number2", no2.getText().toString());
                startActivity(intent);

                Toast toast = Toast.makeText(getApplicationContext(), "Sending Message", Toast.LENGTH_LONG);
                toast.show();
                toast.setGravity(Gravity.TOP |Gravity.LEFT,0,0);
                Toast.makeText(getApplicationContext(), "Sending Message", Toast.LENGTH_LONG).show();
            }
        });




    }
}
