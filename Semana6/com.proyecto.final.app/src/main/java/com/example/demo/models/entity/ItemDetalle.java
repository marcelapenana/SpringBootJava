package com.example.demo.models.entity;

import jakarta.persistence.*;


import java.io.Serializable;

@Entity
@Table(name = "detalle_items")
public class ItemDetalle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer cantidad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boletaPago_id")
	private BoletaPago boletaPago;

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

	public BoletaPago getBoletaPago() {
		return boletaPago;
	}

	public void setBoletaPago(BoletaPago boletaPago) {
		this.boletaPago = boletaPago;
	}

	private static final long serialVersionUID = 1L;

}