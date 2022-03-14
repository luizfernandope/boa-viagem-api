package br.com.etechoracio.boa_viagem.entity;
@Getter
@Setter
public class Viagem {
	private Long id;
	private String destino;
	private String tipo;
	private LocalDate chegada;
	private LocalDate saida;
	private Double orcamento;
	private Integer pessoas;
}