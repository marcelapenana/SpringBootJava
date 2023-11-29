package com.practicoDos.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "items_carritos")
public class ItemFactura  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cantidad;
    private static final long serialVersionUID=1L;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id")
    private Producto producto;

    //calculo de importe
    public Double calcularImporte(){

        return cantidad.doubleValue()*producto.getPrecio();
    }

    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
