package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanrafa.moldes.Hotel;

public class SitiosAmpliados extends AppCompatActivity {

    Hotel datosSitios;
    TextView tituloSitios;
    ImageView imagenSitios;
    TextView calificacionSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_ampliados);
        tituloSitios=findViewById(R.id.tituloampliadositios);
        imagenSitios=findViewById(R.id.fotoampliandositios);
        calificacionSitios=findViewById(R.id.calificacionaplaindositios);

        datosSitios=(Hotel)getIntent().getSerializableExtra("datoshotel");

        tituloSitios.setText(datosSitios.getNombre());
        imagenSitios.setImageResource(datosSitios.getFoto());
        calificacionSitios.setText(Integer.toString(datosSitios.getCalificacion()));
    }
}