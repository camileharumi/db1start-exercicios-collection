package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.db1.colecoes.model.Produto;

public class ExemploProduto {
	
	List<Produto> produtos = new ArrayList<Produto>();
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
}
