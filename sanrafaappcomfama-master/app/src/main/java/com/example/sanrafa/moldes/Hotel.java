package com.example.sanrafa.moldes;

public class Hotel {

    private String nombre;
    private String telefono;
    private String direccion;
    private String precio;
    private Integer calificacion;

    private Integer foto;

    public Hotel() {
    }

    public Hotel(String nombre, String telefono, String direccion, String precio, Integer calificacion, Integer foto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.precio = precio;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }



}
