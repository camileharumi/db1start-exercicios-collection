package br.com.db1.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.colecoes.ExemploProduto;
import br.com.db1.colecoes.model.Produto;
import br.com.db1.colecoes.model.ProdutoComparator;

public class ExemploProdutoTest {
	
	private ExemploProduto exProduto = new ExemploProduto(); 
	List<Produto> listaProdutos = exProduto.getProdutos();
	
	@Before
	public void popularProdutos() {
		Produto produto1 = new Produto(98, "CELULAR", 1000.00);
		exProduto.addProduto(produto1);
		Produto produto2 = new Produto(50, "MONITOR", 200.00);
		exProduto.addProduto(produto2);
		Produto produto3 = new Produto(55, "CANECA", 50.00);
		exProduto.addProduto(produto3);
	}
	
	@Test
	public void exibirProdutosPorDescricaoTest() {		
		Assert.assertTrue(3 == listaProdutos.size());
		Collections.sort(listaProdutos);
		Assert.assertTrue(listaProdutos.get(0).getValor() == 50.00);
		Assert.assertTrue(listaProdutos.get(1).getValor() == 200.00);
		Assert.assertTrue(listaProdutos.get(2).getValor() == 1000.00);
	}
	
	@Test
	public void exibirProdutosPorPrecoTest() {
		Collections.sort(listaProdutos, new ProdutoComparator());
		Assert.assertEquals("CANECA", listaProdutos.get(0).getDescricao());
		Assert.assertEquals("CELULAR", listaProdutos.get(1).getDescricao());
		Assert.assertEquals("MONITOR", listaProdutos.get(2).getDescricao());
	}
}
