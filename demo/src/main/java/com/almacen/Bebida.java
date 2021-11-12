package com.almacen;

public class Bebida {
    
    private static int idVigente = 1;
    
    private int id;
    private double cantidad;
    private double precio;
    private String marca;

    public Bebida (double cantidad, double precio, String marca) {

        this.id = idVigente++;
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;

    }

    

    
    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }




    public double getCantidad() {
        return cantidad;
    }




    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }




    public double getPrecio() {
        return precio;
    }




    public void setPrecio(double precio) {
        this.precio = precio;
    }




    public String getMarca() {
        return marca;
    }




    public void setMarca(String marca) {
        this.marca = marca;
    }




    @Override
    public String toString() {
        return "Bebida [id=" + id + ", cantidad=" + cantidad + ", marca=" + marca + ", precio=" + precio + "]";
    }

    
    
}
