package br.com.etechoracio.boa_viagem.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Viagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VIAGEM")
	private Long id;
	
	@Column(name = "TXT_DESTINO")
	private String destino;
	
	@Column(name = "TP_VIAGEM")
	private String tipo;
	
	@Column(name = "DT_CHEGADA")
	private LocalDate chegada;

	@Column(name = "DT_SAIDA")
	private LocalDate saida;
	
	@Column(name = "VLR_ORCAMENTO")
	private Double orcamento;
	
	@Column(name = "QTD_PESSOAS")
	private Integer pessoas;
}
