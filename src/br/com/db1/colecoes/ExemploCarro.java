package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.db1.colecoes.model.Carro;

public class ExemploCarro {
	
	List<Carro> carros = new ArrayList<Carro>();
	
	public void addProduto(Carro carro) {
		carros.add(carro);
	}
}
