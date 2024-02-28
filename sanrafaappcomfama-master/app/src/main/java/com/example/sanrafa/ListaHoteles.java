package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
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
        listaHoteles.add(new Hotel("hoteles el mocho","3225962363","calle 100","500 usd",4,R.drawable.IMG_9928));
        listaHoteles.add(new Hotel("hoteles donde alicia","2548898","calle ","500 usd",4,R.drawable.IMG_0017));

    }
}
