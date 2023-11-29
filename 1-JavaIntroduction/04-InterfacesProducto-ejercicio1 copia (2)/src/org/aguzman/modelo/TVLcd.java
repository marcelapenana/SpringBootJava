package org.aguzman.modelo;

public class TVLcd extends Electronico {

    private  int pulgada;

    public TVLcd() {
    }

    public TVLcd(String fabricante, int pulgada) {
        super(fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public String  ImprimirElectronico() {
        return "Electronico: "+("\n")+
                "Fabricante: "+fabricante+("\n")+
                "Pulgada: "+pulgada+("\n")+
                "***************************";
    }

    @Override
    public String ImprimirProducto() {
        return null;
    }

    @Override
    public int precio() {
        return 0;
    }

    @Override
    public double precioVenta() {
        return 0;
    }


    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }


}
