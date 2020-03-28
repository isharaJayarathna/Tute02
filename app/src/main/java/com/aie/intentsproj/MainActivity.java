package com.aie.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.button);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(mainIntent);

                LayoutInflater li = getLayoutInflater();
                View layout = li.inflate(R.layout.customtoast, (ViewGroup)findViewById(R.id.custom_toast_layout));


                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setView(layout);
                toast.show();
            }
        });

    }
}
