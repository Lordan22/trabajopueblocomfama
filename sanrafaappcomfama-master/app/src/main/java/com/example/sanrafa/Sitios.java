package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sitios extends AppCompatActivity {

    Button botonVerSitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);

        botonVerSitios = findViewById(R.id.botonsitios);
        botonVerSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sitios.this, ListaSitios.class);
                startActivity(intent);

            }
        });
    }
}