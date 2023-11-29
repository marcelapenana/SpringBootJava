package org.aguzman.modelo;

abstract class Producto implements IProducto{
    private int precio;

    public Producto() {
    }

    public Producto(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    abstract  public double precioVenta();

    abstract  public int precio();
}
