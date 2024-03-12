package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.SitiosAdaptador;
import com.example.sanrafa.moldes.SitiosTuristicos;
import com.example.sanrafa.moldes.SitiosTuristicos;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    ArrayList<SitiosTuristicos> listaSitios = new ArrayList<>();
    RecyclerView recyclerViewSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);

        recyclerViewSitios = findViewById(R.id.listadinamicasitios);
        recyclerViewSitios.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearListaSitios();
        SitiosAdaptador adaptador = new SitiosAdaptador(listaSitios);
        recyclerViewSitios.setAdapter(adaptador);
    }

    public void crearListaSitios() {
        listaSitios.add(new SitiosTuristicos("Laguna la profunda", "1232151221", "Gratuito", R.drawable.sitios1));
        listaSitios.add(new SitiosTuristicos("piscinas mojadas", "625436326", "5 USD", R.drawable.sitios2));
        listaSitios.add(new SitiosTuristicos("Lago el ahogado", "2545435", "Gratuito", R.drawable.sitios3));
        listaSitios.add(new SitiosTuristicos("Lago laguna seca", "235435326", "10 USD", R.drawable.sitios4));
        listaSitios.add(new SitiosTuristicos("Capilla Capillosa", "2132153", "Gratuito", R.drawable.sitios5));
    }
}
