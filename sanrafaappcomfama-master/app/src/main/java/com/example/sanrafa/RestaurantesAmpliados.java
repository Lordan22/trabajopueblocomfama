package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanrafa.moldes.Hotel;

public class RestaurantesAmpliados extends AppCompatActivity {

    Hotel datosRestaurantes;
    TextView tituloRestaurantes;
    ImageView imagenRestaurantes;
    TextView calificacionRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_ampliados);
        tituloRestaurantes=findViewById(R.id.tituloampliadorestaurantes);
        imagenRestaurantes=findViewById(R.id.fotoampliandorestaurantes);
        calificacionRestaurantes=findViewById(R.id.calificacionaplaindorestaurantes);

        datosRestaurantes=(Hotel)getIntent().getSerializableExtra("datosRestaurante");

        tituloRestaurantes.setText(datosRestaurantes.getNombre());
        imagenRestaurantes.setImageResource(datosRestaurantes.getFoto());
        calificacionRestaurantes.setText(Integer.toString(datosRestaurantes.getCalificacion()));
    }
}