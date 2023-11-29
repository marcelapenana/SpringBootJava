package com.example.demo.models.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "boletaPagos")
public class BoletaPago implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String concepto;

	private String NPE;

	private Double valor;

	private Double ValorRecargo;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_final")
	private Date createAt;

	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getNPE() {
		return NPE;
	}

	public void setNPE(String NPE) {
		this.NPE = NPE;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getValorRecargo() {
		return ValorRecargo;
	}

	public void setValorRecargo(Double valorRecargo) {
		ValorRecargo = valorRecargo;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	private static final long serialVersionUID = 1L;

}
