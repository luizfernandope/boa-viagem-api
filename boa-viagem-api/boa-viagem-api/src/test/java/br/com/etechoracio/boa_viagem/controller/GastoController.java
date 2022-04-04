package br.com.etechoracio.boa_viagem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.boa_viagem.entity.Gasto;
import br.com.etechoracio.boa_viagem.repository.GastoRepository;
import java.util.List;

@RestController
@RequestMapping("/gastos")
public class GastoController {

	private GastoRepository repository;
	public List<Gasto> listarTodos(){
		return repository.findAll();
		
	}
}
