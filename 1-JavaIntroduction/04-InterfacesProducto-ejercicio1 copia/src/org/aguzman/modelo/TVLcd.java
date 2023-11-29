package org.aguzman.modelo;

public class TVLcd extends  Electronico {

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

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }


}
