package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.HotelAdaptador;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<Hotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerViewHoteles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerViewHoteles=findViewById(R.id.listadinamicahoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        HotelAdaptador adaptador= new HotelAdaptador(listaHoteles);
        recyclerViewHoteles.setAdapter(adaptador);


    }

    public void crearListaHoteles(){
        listaHoteles.add(new Hotel("hoteles el mocho","3225962363","calle 100","500 usd",69 ,R.drawable.imagenhotel1));
        listaHoteles.add(new Hotel("hoteles donde alicia","2548898","calle 234 ","250 usd",5,R.drawable.imagenhotel2));
        listaHoteles.add(new Hotel("hoteles aguapanelicos","3225962363","calle 152","750 usd",0,R.drawable.imagenhotel3));
        listaHoteles.add(new Hotel("hoteles la damon","2548898","calle 263 ","999 usd",2,R.drawable.imagenhotel7));
        listaHoteles.add(new Hotel("hoteles el cojo","3225962363","calle 967","260 usd",5,R.drawable.imagenhotel6));
    }
}