package com.example.sergi.airhockey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button botonAzul = (Button) findViewById(R.id.botonAzul);
        final Button botonRojo = (Button) findViewById(R.id.botonRojo);


        botonAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mA = Integer.parseInt(botonAzul.getText().toString());
                mA = mA+1;
                botonAzul.setText(String.valueOf(mA));
            }
        });

        botonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mR = Integer.parseInt(botonRojo.getText().toString());
                mR = mR+1;
                botonRojo.setText(String.valueOf(mR));
            }
        });
    }
}