package com.almacen;

public class Almacen {

    private Bebida [] [] estanteria; 

    public Almacen (int filas, int columnas) {

        estanteria = new Bebida [filas] [columnas];

    }

    public Almacen () {

        estanteria = new Bebida [5] [5];

    }

    public void agregarBebida (Bebida b) {

        boolean hallado = false;

        for(int x=0; x<estanteria.length && !hallado; x++) {
            for (int y=0; y<estanteria[0].length && !hallado; y++) {
                if (estanteria [x][y]==null) {
                    estanteria [x][y] = b;
                    hallado = true;
                }
            }
        }

        if(hallado) {
            System.out.println("Bebida agregada");
        }else {
            System.out.println("La bebida no se ha podido agregar");
        }

    }

    public void eliminarBebida (int id) {

        boolean hallado = false;

        for(int x=0; x<estanteria.length && !hallado; x++) {
            for (int y=0; y<estanteria[0].length && !hallado; y++) {
                if (estanteria [x][y]!=null) {
                    if(estanteria [x][y].getId()==id) {
                        estanteria [x][y] = null;    
                        hallado = true;
                        
                    }
                    
                }
            }
        }

        if(hallado) {
            System.out.println("Bebida eliminada");
        }else {
            System.out.println("La bebida no existe");
        }

    }

    public void mostrarBebida () {

        for(int x=0; x<estanteria.length; x++) {
            for (int y=0; y<estanteria[0].length; y++) {
                if (estanteria [x][y]!=null) {
                    System.out.println("Fila: " + x +", Columna: " + y + " Bebida: " + estanteria [x][y].toString());
                }
            }
        }

    }

    public double calcularPrecioBebida () {

        double precioTotal = 0;
        for(int x=0; x<estanteria.length; x++) {
            for (int y=0; y<estanteria[0].length; y++) {
                if (estanteria [x][y] != null) {
                    precioTotal = estanteria [x][y].getPrecio();
                }
                
            }
        }
        return precioTotal;

    }
    public double calcularPrecioBebidaMarca (String marca) {

        double precioTotal = 0;
        for(int x=0; x<estanteria.length; x++) {
            for (int y=0; y<estanteria[0].length; y++) {
                if (estanteria [x][y] != null) {
                    if (estanteria [x][y].getMarca().equalsIgnoreCase(marca)) {
                        precioTotal = estanteria [x][y].getPrecio();
                    }
                }
                                
            }
        }
        return precioTotal;

    }
    public double calcularPrecioEstanteria (int columna) {

        double precioTotal = 0;

        if (columna>=0 && columna<=estanteria[0].length) {
            for (int x=0; x <estanteria.length; x++) {
                if (estanteria [x][columna] != null) {
                    precioTotal = estanteria [x][columna].getPrecio();
                }
            }
            
        }else {
            System.out.println("La columna debe estar entre 0 y " + estanteria[0].length);
        }
        
        return precioTotal;

    }
    
}
