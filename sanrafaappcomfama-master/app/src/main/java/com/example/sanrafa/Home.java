package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class Home extends AppCompatActivity {

    //ATRIBUTOS PARA REFERENCIAS ELEMENTOS GRAFICOS
    //QUE TENGO YO EN EL XML QUE QUIERO CONTROLAR EN JAVA
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //asociar las variables creadas con los ID de los
        //elementos que vienen desde XML
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitios=findViewById(R.id.botonsitios);

        //Escuchar eventos (clic en los botones)
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aca escribo lo que quiera hacer cuando presionen el boton
                //Toast.makeText(Home.this, "hizo clic en hoteles", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this,Hoteles.class);
                startActivity(intent);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Restaurantes.class);
                startActivity(intent);;
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Sitios.class);
                startActivity(intent);
            }
        });



    }

    //cargar el menu de opcion deseado
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Que hago en cada opcion del menu
    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();

        if(itemSeleccionado==R.id.opcion1){
            this.cambiarIdioma("en");
            Intent intentIngles=new Intent(Home.this,Home.class);
            startActivity(intentIngles);
        }else if(itemSeleccionado==R.id.opcion2){
            this.cambiarIdioma("es");
            Intent intentIngles=new Intent(Home.this,Home.class);
            startActivity(intentIngles);
        }else if(itemSeleccionado==R.id.opcion3){
            this.cambiarIdioma("it");
            Intent intentIngles=new Intent(Home.this,Home.class);
            startActivity(intentIngles);
        }else if(itemSeleccionado==R.id.opcion4){
            Intent intentResena = new Intent(Home.this, Resena.class);
            startActivity(intentResena);
        }else if(itemSeleccionado==R.id.opcion5){
            Intent intentAcercade = new Intent(Home.this, Acercade.class);
            startActivity(intentAcercade);
        }
        return super.onOptionsItemSelected(item);
    }






    public void cambiarIdioma (String idioma){

        Locale lenguaje=new Locale (idioma);
        Locale.setDefault(lenguaje);
        Configuration configuracionTelefono = getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;
        //Ejecuto la configuracion establecida
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());
    }

}