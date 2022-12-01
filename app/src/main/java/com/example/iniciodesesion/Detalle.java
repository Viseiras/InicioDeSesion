package com.example.iniciodesesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent intent = getIntent();
        String algo = intent.getStringExtra("Algo_ID");

        TextView detalleView = findViewById(R.id.detalleView);
        detalleView.setText(algo);
    }
}