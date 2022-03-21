package br.com.etechoracio.boa_viagem.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_GASTO")

public class Gasto {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ID_GASTOS")
	private Long id;

	@Column(name = "TX_DESCRICAO")
	private String descricao;

	@Column(name = "TX_LOCAL")
	private String local;

	@Column(name = "TP_CATEGORIA")
	private String categoria;

	@Column(name = "TP_GASTOS")
	private LocalDate gasto;

	@Column(name = "VLR_GASTOS")
	private Double valor;

	@ManyToOne
	@JoinColumn(name = "ID_VIAGEM")
	private Viagem viagem;
}