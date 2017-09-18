package br.com.db1.colecoes.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.colecoes.ExemploArray;

public class ColecoesTest {
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
}
