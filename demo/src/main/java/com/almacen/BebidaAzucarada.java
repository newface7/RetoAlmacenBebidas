package com.almacen;

public class BebidaAzucarada extends Bebida{

    private double propAzucar;
    private boolean oferta;

    public BebidaAzucarada(double cantidad, double precio, String marca, double propAzucar, boolean oferta) {
        super(cantidad, precio, marca);
        this.propAzucar = propAzucar;
        this.oferta = oferta;
    }

    public double getPropAzucar() {
        return propAzucar;
    }

    public void setPropAzucar(double propAzucar) {
        this.propAzucar = propAzucar;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    @Override
    public double getPrecio() {
        if (isOferta()) {
            return super.getPrecio() * 0.9;
        }else {
            return super.getPrecio();
        }

    }

    @Override
    public String toString() {
        return super.toString() + "BebidaAzucarada [oferta=" + oferta + ", propAzucar=" + propAzucar + "]";
    }

}
