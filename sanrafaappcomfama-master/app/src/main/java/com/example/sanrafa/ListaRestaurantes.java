package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.RestaurantesAdaptador;
import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Restauraantes;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<Restauraantes> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerViewRestaurantes;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerViewRestaurantes = findViewById(R.id.listadinamicarestaurantes);
        recyclerViewRestaurantes.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearListaRestaurantes();
        RestaurantesAdaptador adaptador = new RestaurantesAdaptador(listaRestaurantes);
        recyclerViewRestaurantes.setAdapter(adaptador);

    }

    public void crearListaRestaurantes() {
        listaRestaurantes.add(new Restauraantes("Restaurante la pelada","3225962363","calle 100","500 usd",4,R.drawable.imagenhotel1));
        listaRestaurantes.add(new Restauraantes("Restaurante la arepa negra","2548898","calle 234 ","250 usd",4,R.drawable.imagenhotel2));
        listaRestaurantes.add(new Restauraantes("Restaurante comete esto","3225962363","calle 152","750 usd",4,R.drawable.imagenhotel3));
        listaRestaurantes.add(new Restauraantes("Restaurante El ojo con el piojo","2548898","calle 263 ","999 usd",4,R.drawable.imagenhotel7));
        listaRestaurantes.add(new Restauraantes("Restaurante hector julian","3225962363","calle 967","260 usd",4,R.drawable.imagenhotel6));
    }
}
