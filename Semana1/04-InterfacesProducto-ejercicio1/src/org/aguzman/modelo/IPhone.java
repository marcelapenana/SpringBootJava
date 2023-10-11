package org.aguzman.modelo;

public class IPhone extends Electronico {
    private String modelo;

    private String color;

    public IPhone() {
    }

    public IPhone(String fabricante, String modelo, String color) {
        super(fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String ImprimirElectronico() {
        return "PRODUCTO ELECTRONICO: "+("\n")+
                "Fabricante: "+fabricante+("\n")+
                "Modelo: "+modelo+("\n")+
                "Color: "+color+("\n")+
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
