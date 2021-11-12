package com.almacen;

public class AguaMineral extends Bebida {
    
    private static int idVigente = 1;
    
    private String manantial;

    public AguaMineral(double cantidad, double precio, String marca, String manantial) {
        super(cantidad, precio, marca);
        this.manantial = manantial;
    }

    public String getmanantial() {
        return manantial;
    }

    public void setmanantial(String manantial) {
        this.manantial = manantial;
    }

    @Override
    public String toString() {
        return super.toString() + "AguaMineral [manantial=" + manantial + "]";
    }    
}
