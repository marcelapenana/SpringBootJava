package org.aguzman.modelo;

public class TVLcd extends Producto implements IElectronico {

    private  int pulgada;

    public TVLcd() {
    }

    public TVLcd(int precio, int pulgada) {
        super(precio);
        this.pulgada = pulgada;
    }

    @Override
    public String  ImprimirElectronico() {
        return "Electronico: "+("\n")+
                "Precio: "+getPrecio()+("\n")+
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
