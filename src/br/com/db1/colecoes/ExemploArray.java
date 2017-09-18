package br.com.db1.colecoes;

import java.util.Arrays;

public class ExemploArray {

	public String[] getNomes() {
		String[] alunosTurmaDb1Start = new String[3];
		alunosTurmaDb1Start[0] = "Alexander";
		alunosTurmaDb1Start[1] = "Silas";
		alunosTurmaDb1Start[2] = "Elielson";
		return null;
	}
	
	public Integer[] ordenaNumeros2(Integer[] numeros) {
		Arrays.sort(numeros);
		return numeros;
	}
	
	public Integer[] ordenaNumeros(Integer[] numeros) {
		for(Integer x = 0; x < numeros.length; x++) {
			for (Integer y = x+1; y < numeros.length; y++) {
				if(numeros[x] > numeros[y]) {
					Integer tmp = numeros[x];
					numeros[x] = numeros[y];
					numeros[y] = tmp;
				}
			}
		}
		
		return numeros;
	}

}
