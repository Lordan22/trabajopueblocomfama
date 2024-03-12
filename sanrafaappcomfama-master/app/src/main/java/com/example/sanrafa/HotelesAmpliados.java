package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Hotel;

public class HotelesAmpliados extends AppCompatActivity {

    Hotel datoshotel;
    TextView tituloHotel;
    ImageView imagenHotel;
    TextView calificacionHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_ampliados);

        tituloHotel=findViewById(R.id.tituloampliadohoteles);
        imagenHotel=findViewById(R.id.fotoampliandohoteles);
        calificacionHotel=findViewById(R.id.calificacionampliandohoteles);

        datoshotel=(Hotel)getIntent().getSerializableExtra("datoshotel");

        tituloHotel.setText(datoshotel.getNombre());
        imagenHotel.setImageResource(datoshotel.getFoto());
        calificacionHotel.setText(Integer.toString(datoshotel.getCalificacion()));
    }
}