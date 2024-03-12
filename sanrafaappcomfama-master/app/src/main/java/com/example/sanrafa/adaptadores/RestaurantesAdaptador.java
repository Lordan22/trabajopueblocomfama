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
import com.example.sanrafa.ListaRestaurantes;
import com.example.sanrafa.R;
import com.example.sanrafa.Restaurantes;
import com.example.sanrafa.moldes.Restauraantes;
import com.example.sanrafa.moldes.Restauraantes;

import java.util.ArrayList;
import java.util.List;

public class RestaurantesAdaptador extends RecyclerView.Adapter<RestaurantesAdaptador.ViewHolder> {

    private ArrayList<Restauraantes> listaRestaurantes;

    // Constructor vacío
    public RestaurantesAdaptador() {
    }

    // Constructor con lista de restaurantes
    public RestaurantesAdaptador(ArrayList<Restauraantes> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molde, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.pintarMolde(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // Asociación de elementos del XML del molde
        ImageView fotoResMolde;
        TextView nombreResMolde;
        TextView precioResMolde;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoResMolde = itemView.findViewById(R.id.fotomoldehotel);
            nombreResMolde = itemView.findViewById(R.id.nombrehotelmolde);
            precioResMolde = itemView.findViewById(R.id.preciomoldehotel);
        }

        public void pintarMolde(Restauraantes restaurante) {
            fotoResMolde.setImageResource(Restauraantes.getFoto());
            nombreResMolde.setText(restaurante.getNombre());
            precioResMolde.setText(restaurante.getPrecio());

            // Escuchar clic en cada elemento de la lista
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), HotelesAmpliados.class);
                    intent.putExtra("datosRestaurante", restaurante);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
