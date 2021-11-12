package com.almacen;

public class App 
{
    public static void main( String[] args )
    {
        Almacen a = new Almacen();
        Bebida b;
        for (int i=0;i<10;i++) {
            switch (i%2) {
                case 0:
                    b=new AguaMineral(1.5, 5, "Postobon", "Brisa1");
                    a.agregarBebida(b);
                    break;
                case 1:
                    b= new BebidaAzucarada(1.5, 10, "Coca-Cola", 0.2, true);
                    a.agregarBebida(b);
                    break;
            
            }

        } 
        
        a.eliminarBebida(4);
        a.mostrarBebida();
        System.out.println(a.calcularPrecioBebida());
        System.out.println(a.calcularPrecioBebidaMarca("Coca-Cola"));
        System.out.println(a.calcularPrecioEstanteria(0));
    }
}
