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
		exColString.adicionarNumerosList(15);
		exColString.adicionarNumerosList(22);
		exColString.adicionarNumerosList(36);
		exColString.adicionarNumerosList(44);
		exColString.adicionarNumerosList(58);
		exColString.adicionarNumerosList(64);
		exColString.adicionarNumerosList(73);
		exColString.adicionarNumerosList(88);
		exColString.adicionarNumerosList(94);
		exColString.adicionarNumerosList(15);
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
		//Assert.assertTrue(exColString.getNumerosList().size() == 9);
		System.out.println(numeros);
	}
	
	/*@Test
	public void apresentarMultiplosTresTest() {
		
		List<Integer> multiplosTres = exColString.apresentarMultiplosTres();
		Assert.assertTrue(multiplosTres.contains(3));
		Assert.assertTrue(multiplosTres.contains(6));
		Assert.assertTrue(multiplosTres.contains(9));
	}*/
}
