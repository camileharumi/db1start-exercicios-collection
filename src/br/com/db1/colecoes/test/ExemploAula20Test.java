package br.com.db1.colecoes.test;

import java.util.ArrayList;
import java.util.HashSet;
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
		Set<String> consoantes = exColString.getConsoantes("Camile");
		Assert.assertTrue(consoantes.size() == 3);
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("a"));
		Assert.assertTrue(consoantes.contains("m"));
		Assert.assertFalse(consoantes.contains("i"));
		Assert.assertTrue(consoantes.contains("l"));
		Assert.assertFalse(consoantes.contains("e"));
	}
	
	@Test
	public void getVogaisTest(){
		Set<String> vogais = exColString.getVogais("Fusca");
		Assert.assertTrue(vogais.size() == 2);
		Assert.assertFalse(vogais.contains("F"));
		Assert.assertTrue(vogais.contains("u"));
		Assert.assertFalse(vogais.contains("s"));
		Assert.assertFalse(vogais.contains("c"));
		Assert.assertTrue(vogais.contains("a"));
	}
	
	@Test
	public void removerTerceiroNumeroTest() {		
		List<Integer> numeros = exColString.removerTerceiroNumero(3);
		Assert.assertTrue(exColString.getNumerosList().size() == 9);
		System.out.println(numeros);
	}
	
	@Test
	public void apresentarMultiplosTresTest() {
		List<Integer> multiplosTres = exColString.apresentarMultiplosTres();
		Assert.assertTrue(multiplosTres.contains(3));
		Assert.assertTrue(multiplosTres.contains(6));
		Assert.assertTrue(multiplosTres.contains(9));
	}
	
	@Test
	public void apresentarMultiplosDoisTest() {		
		List<Integer> multiplosDois = exColString.apresentarMultiplosDois();
		Assert.assertTrue(multiplosDois.contains(2));
		Assert.assertTrue(multiplosDois.contains(4));
		Assert.assertTrue(multiplosDois.contains(6));
		Assert.assertTrue(multiplosDois.contains(8));
		Assert.assertTrue(multiplosDois.contains(10));
	}
	
	@Test
	public void copiarTextosTest() {
		List<StringBuffer> textos = new ArrayList<StringBuffer>();
		textos.add(new StringBuffer("Texto 1 "));
		textos.add(new StringBuffer("Texto 2 "));
		textos.add(new StringBuffer("Texto 3 "));
		textos.add(new StringBuffer("Texto 4 "));
		textos.add(new StringBuffer("Texto 5 "));
		textos.add(new StringBuffer("Texto 6 "));
		textos.add(new StringBuffer("Texto 7 "));
		textos.add(new StringBuffer("Texto 8 "));
		textos.add(new StringBuffer("Texto 9 "));
		textos.add(new StringBuffer("Texto 10 "));

		List<StringBuffer> textoCopia = exColString.copiarTextos((ArrayList<StringBuffer>) textos);
		Assert.assertEquals(textos, textoCopia);
	}
	
	@Test
	public void compararListsTest() {
		List<Integer> lista1 = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		for(int x = 0; x < 11; x++) {
			lista1.add(x);
			lista2.add(x);
		}
		Assert.assertTrue(exColString.compararLists(lista1, lista2));
	}
	
	@Test
	public void compararSetsTest() {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for(int x = 0; x < 11; x++) {
			set1.add(x);
			set2.add(x);
		}
		Assert.assertTrue(exColString.compararSets(set1, set2));
	}
		
}
