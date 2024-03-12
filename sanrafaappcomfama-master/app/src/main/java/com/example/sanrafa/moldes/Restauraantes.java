package com.example.sanrafa.moldes;

import java.io.Serializable;

public class Restauraantes implements Serializable {

    private String nombre;
    private String telefono;
    private String direccion;

    private Integer calificacion;

    private static Integer foto;

    public Restauraantes() {
    }

    public Restauraantes(String nombre, String telefono, String direccion, String precio, Integer calificacion, Integer foto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;

        this.calificacion = calificacion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public static Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }


    public int getPrecio() {
        return 0;
    }
}