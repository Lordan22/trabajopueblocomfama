package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restaurantes extends AppCompatActivity {
    Button botonVerRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);
        botonVerRestaurantes = findViewById(R.id.botonrestaurantes);
        botonVerRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurantes.this, ListaRestaurantes.class);
                startActivity(intent);
            }
        });
    }
}