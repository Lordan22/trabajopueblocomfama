package com.example.sanrafa.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.HotelesAmpliados;
import com.example.sanrafa.R;
import com.example.sanrafa.Sitios;
import com.example.sanrafa.moldes.SitiosTuristicos;

import java.util.ArrayList;

public class SitiosAdaptador extends RecyclerView.Adapter<SitiosAdaptador.ViewHolder> {

    private ArrayList<SitiosTuristicos> listaSitios;

    // Constructor vacío
    public SitiosAdaptador() {
    }

    // Constructor con lista de sitios
    public SitiosAdaptador(ArrayList<SitiosTuristicos> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molde, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.pintarMolde(listaSitios.get(position));
    }

    @Override
    public int getItemCount() {
        return listaSitios.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // Asociación de elementos del XML del molde
        ImageView fotoSitioMolde;
        TextView nombreSitioMolde;
        TextView precioSitioMolde;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoSitioMolde = itemView.findViewById(R.id.fotomoldehotel);
            nombreSitioMolde = itemView.findViewById(R.id.nombrehotelmolde);
            precioSitioMolde = itemView.findViewById(R.id.preciomoldehotel);
        }

        public void pintarMolde(SitiosTuristicos sitio) {
            fotoSitioMolde.setImageResource(sitio.getFoto());
            nombreSitioMolde.setText(sitio.getNombre());
            precioSitioMolde.setText(sitio.getPrecio());

            // Escuchar clic en cada elemento de la lista
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), HotelesAmpliados.class);
                    intent.putExtra("datosSitio", sitio);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
