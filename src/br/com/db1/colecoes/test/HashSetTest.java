package br.com.db1.colecoes.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.colecoes.ExemploArray;
import br.com.db1.colecoes.ExemploColecao;
import br.com.db1.colecoes.ExemploHashSet;

public class HashSetTest {
	private ExemploHashSet colecao = new ExemploHashSet();
	
	@Before
	public void popularLista() {
		colecao.adicionarNomes("Leonardo");
		colecao.adicionarNomes("Patrick");
		colecao.adicionarNomes("Maycon");
		colecao.adicionarNomes("Camile");
		colecao.adicionarNomes("Mateus");
		colecao.adicionarNomes("Matheus");
		colecao.adicionarNomes("Luiz");
		colecao.adicionarNomes("Isadora");
		colecao.adicionarNomes("Brenda");
		colecao.adicionarNomes("Daniel");
		colecao.adicionarNomes("André");
	}
	
	@Test
	public void arrayTest() {
		ExemploArray exArray = new ExemploArray();
		String[] nomes = exArray.getNomes();
	}
	
	@Test
	public void exercicioArray() {
		ExemploArray exArray = new ExemploArray();
		Integer[] numeros = new Integer[3];
		numeros[0] = 10;
		numeros[1] = 5;
		numeros[2] = 6;
		
		Integer[] numerosOrdenados = exArray.ordenaNumeros(numeros);
		Assert.assertTrue(5 == numerosOrdenados[0]);
		Assert.assertTrue(6 == numerosOrdenados[1]);
		Assert.assertTrue(10 == numerosOrdenados[2]);
	}
	
	@Test
	public void exercicio1Test(){
		Assert.assertTrue(11 == colecao.tamanhoLista());
	}

	@Test
	public void exercicio2Test(){
		colecao.removerNomes("Leonardo");
		colecao.removerNomes("Patrick");
		colecao.removerNomes("Maycon");
		Assert.assertTrue(8 == colecao.tamanhoLista());
	}

	@Test
	public void exercicio4Test(){
		Assert.assertFalse(colecao.estaNaLista("FUSCA"));
	}

	@Test
	public void exercicio5Test(){
		Assert.assertTrue(colecao.estaNaLista("Leonardo"));
	}

	@Test
	public void exercicioTreeSetTest() {
		Set<String> ordenados = colecao.getListaOrdenadaTreeSet();
		Iterator it = ordenados.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
