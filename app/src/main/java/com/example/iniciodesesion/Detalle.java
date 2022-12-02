package com.example.iniciodesesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent intent = getIntent();
        String ID = intent.getStringExtra("ID");
        String content = intent.getStringExtra("CONTENT");
        String detalle = intent.getStringExtra("DETALLE");
        TextView contentView = findViewById(R.id.nameText);
        TextView detalleView = findViewById(R.id.detalleView);
        ImageView imagen = findViewById(R.id.imagen);
        Switch swit = findViewById(R.id.switch1);

        contentView.setText(ID + ".- " + content);
        detalleView.setText(detalle);
        switch (ID)
        {
            case "1":
                imagen.setImageDrawable(getDrawable(R.drawable.goliath4));
            break;
            case "2":
                imagen.setImageDrawable(getDrawable(R.drawable.mariposamonarca));
            break;
            case "3":
                imagen.setImageDrawable(getDrawable(R.drawable.escorpion));
            break;
            case "4":
                imagen.setImageDrawable(getDrawable(R.drawable.kabuto));
            break;
        }


        swit.set


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.nombres, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


    }
}