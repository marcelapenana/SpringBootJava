package org.aguzman.modelo;

abstract class Electronico extends Producto implements IElectronico{
    protected  String fabricante;
    public Electronico() {
    }
    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }
    abstract public String  ImprimirElectronico();






    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
