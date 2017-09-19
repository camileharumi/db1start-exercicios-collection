package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ExemploAula20 {
	List<Integer> numerosList = new ArrayList<>();

	public void adicionarNumerosList(Integer numero) {
		numerosList.add(numero);
	}
	
	public Set<Character> getConsoantes(String palavra) {		
		Set<Character> consoantes = new HashSet<Character>();
		for(char c : palavra.toCharArray()) {
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
			   consoantes.add(c);
			}
		}		
		System.out.println(consoantes);
		return consoantes;
	}
	
	public Set<Character> getVogais(String palavra) {		
		Set<Character> vogais = new HashSet<Character>();
		for(char c : palavra.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			   vogais.add(c);
			}
		}		
		System.out.println(vogais);
		return vogais;
	}
	
	public List<Integer> getNumerosList() {
		return numerosList;
	}
	
	public List<Integer> removerTerceiroNumero(Integer index) {
		Integer tmp = 0;
		Integer numero = 0;
		Iterator<Integer> lista = numerosList.iterator();
		while(lista.hasNext()) {
			if (tmp == index-1) {
				numero = lista.next();
				break;
			}
			//System.out.println(lista.next());
			tmp++;
		}
		numerosList.remove(numero);
		return numerosList;
	}
	
	/*public List<Integer> apresentarMultiplosTres() {
		List<Integer> multiplos = new ArrayList<>();
		Iterator<Integer> it = numerosList.iterator();
		int tmp = 0;
		while(it.hasNext()) {
			int valor = it.next();
			if(valor % 2 == 0) {
				multiplos.add(valor - 1);
				tmp++;
			}
		}
		System.out.println(multiplos);
		return multiplos;
	}*/
	
	public List<Integer> apresentarMultiplosDois() {
		List<Integer> multiplos = new ArrayList<>();
		Iterator<Integer> it = numerosList.iterator();
		int tmp = 0;
		while(it.hasNext()) {
			int valor = it.next();
			if(valor % 2 == 0) {
				multiplos.add(valor);
				tmp++;
			}
		}
		System.out.println(multiplos);
		return multiplos;
	}
	
	public List<String> copiarTextos() {
		
	}
	
	public List<Integer> compararLists() {
		
	}
	
	public Set<Integer> compararSets() {
		
	}
	
	public List<Produtos> exibirProdutosPorDescricao() {
		
	}
	
	public List<Produtos> exibirProdutosPorPreco() {
		
	}
}
