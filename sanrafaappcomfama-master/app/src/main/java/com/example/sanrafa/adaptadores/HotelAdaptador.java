package com.example.sanrafa.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.R;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class HotelAdaptador extends RecyclerView.Adapter<HotelAdaptador.viewHolder> {

    //atributos de la clase
    public ArrayList<Hotel> listaHoteles;

    //constrcutor vacio

    public HotelAdaptador() {
    }

    //constructor lleno
    public HotelAdaptador(ArrayList<Hotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public HotelAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molde,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdaptador.viewHolder holder, int position) {
        holder.pintarMolde(listaHoteles.get(position));
    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //asocio los elementos del xml del molde
        ImageView fotoHotelMolde;
        TextView nombreHotelMolde;
        TextView precioHotelMolde;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotelMolde=itemView.findViewById(R.id.fotomoldehotel);
            nombreHotelMolde=itemView.findViewById(R.id.nombrehotelmolde);
            precioHotelMolde=itemView.findViewById(R.id.preciomoldehotel);
        }

        public void pintarMolde(Hotel hotel) {
            fotoHotelMolde.setImageResource(hotel.getFoto());
            nombreHotelMolde.setText(hotel.getNombre());
            precioHotelMolde.setText(hotel.getPrecio());
        }
    }
}
