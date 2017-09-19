package br.com.db1.colecoes.test;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.colecoes.ExemploAula20;

public class ExemploAula20Test {
	
	private ExemploAula20 exColString = new ExemploAula20();
	
	@Before
	public void popularNumeros() {
		exColString.adicionarNumerosList(1);
		exColString.adicionarNumerosList(2);
		exColString.adicionarNumerosList(3);
		exColString.adicionarNumerosList(4);
		exColString.adicionarNumerosList(5);
		exColString.adicionarNumerosList(6);
		exColString.adicionarNumerosList(7);
		exColString.adicionarNumerosList(8);
		exColString.adicionarNumerosList(9);
		exColString.adicionarNumerosList(10);
	}
	
	@Test
	public void getConsoantesTest() {
		Set<Character> consoantes = exColString.getConsoantes("Camile");
		Assert.assertTrue(consoantes.size() == 3);
		Assert.assertTrue(consoantes.contains('C'));
		Assert.assertFalse(consoantes.contains('a'));
		Assert.assertTrue(consoantes.contains('m'));
		Assert.assertFalse(consoantes.contains('i'));
		Assert.assertTrue(consoantes.contains('l'));
		Assert.assertFalse(consoantes.contains('e'));
	}
	
	@Test
	public void getVogaisTest() {
		Set<Character> consoantes = exColString.getVogais("Camile");
		Assert.assertTrue(consoantes.size() == 3);
		Assert.assertFalse(consoantes.contains('C'));
		Assert.assertTrue(consoantes.contains('a'));
		Assert.assertFalse(consoantes.contains('m'));
		Assert.assertTrue(consoantes.contains('i'));
		Assert.assertFalse(consoantes.contains('l'));
		Assert.assertTrue(consoantes.contains('e'));
	}
	
	@Test
	public void removerTerceiroNumeroTest() {		
		List<Integer> numeros = exColString.removerTerceiroNumero(3);
		Assert.assertTrue(exColString.getNumerosList().size() == 9);
		System.out.println(numeros);
	}
	
	@Test
	public void apresentarMultiplosTresTest() {
		
	}
	
	@Test
	public void apresentarMultiplosDoisTest() {		
		List<Integer> multiplosTres = exColString.apresentarMultiplosDois();
		Assert.assertTrue(multiplosTres.contains(2));
		Assert.assertTrue(multiplosTres.contains(4));
		Assert.assertTrue(multiplosTres.contains(6));
		Assert.assertTrue(multiplosTres.contains(8));
		Assert.assertTrue(multiplosTres.contains(10));
	}
	
	@Test
	public void copiarTextosTest() {
		
	}
	
	@Test
	public void compararListsTest() {
		
	}
	
	@Test
	public void compararSetsTest() {
		
	}
	
	@Test
	public void exibirProdutosPorDescricaoTest() {
		
	}
	
	@Test
	public void exibirProdutosPorPrecoTest() {
		
	}
	
	
}
