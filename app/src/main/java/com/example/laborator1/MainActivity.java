package com.example.laborator1;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adăugăm un listener pentru click pe buton
        Button click = findViewById(R.id.button);
        click.setBackgroundColor(Color.BLUE);  // Culoarea inițială

        click.setOnClickListener(v -> {
            // Schimbăm culoarea butonului la verde când este apăsat
            click.setBackgroundColor(Color.GREEN);
        });
    }
}
