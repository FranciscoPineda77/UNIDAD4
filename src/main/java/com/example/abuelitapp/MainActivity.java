package com.example.abueli;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText("Es hora de tomar tu remedio");
    }
}
