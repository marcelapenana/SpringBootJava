package org.aguzman.modelo;

abstract class Producto implements IProducto{
    protected int precio;
    public Producto() {
    }
    public Producto(int precio) {
        this.precio = precio;
    }

    abstract  public String ImprimirProducto();
    abstract  public int precio();
    abstract  public double precioVenta();


    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
