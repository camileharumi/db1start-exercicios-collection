package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import br.com.db1.colecoes.model.Produto;

public class ExemploAula20 {
	Set<String> vogais = new HashSet<>();
	List<Integer> numerosList = new ArrayList<>();
	List<Integer> multiplos = new ArrayList<>();
	List<StringBuffer> textos = new ArrayList<>();

	public void adicionarNumerosList(Integer numero) {
		numerosList.add(numero);
	}
	
	public Set<Character> getConsoantes(String palavra) {		
		Set<Character> consoantes = new HashSet<Character>();
		for(char c : palavra.toCharArray()) { //podia ter usado substring ao invés de char
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') { //se o usuário inserir números o sistema vai detectar como consoantes, sugiro usar uma colecao e adicionar a ela as consoantes
			   consoantes.add(c);// e depois usar .contents para testar se é consoante. OBS: a principio eu tinha feito igual vc fez :D e o fusca sugeriu essas mmudanças
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
	
	public Set<String> getVogais2(String nomeParametro) {
		
		vogais.add("a");
		vogais.add("e");
		vogais.add("i");
		vogais.add("o");
		vogais.add("u");
		
		nomeParametro = nomeParametro.toLowerCase();
		Set<String> vogaisEncontradas = new HashSet<>();

		for (Integer x =0 ; x < nomeParametro.length(); x++){
			String letra = nomeParametro.substring(x, x+1);
			if (vogais.contains(letra)){
				vogaisEncontradas.add(letra);
			}
		}

		return vogaisEncontradas;
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
	
	public List<Integer> apresentarMultiplosTres() {
		Integer posicao = 2;
		Integer tmp = 0;
		Iterator<Integer> it = numerosList.iterator();
		while(it.hasNext()) {
			Integer numero = it.next();
			if(tmp == posicao) {
				multiplos.add(numero);
				posicao = posicao + 3;
			}
			tmp++;
		}
		System.out.println(multiplos);
		return multiplos;
	}
	
	public List<Integer> apresentarMultiplosDois() {
		Iterator<Integer> it = numerosList.iterator();
		while(it.hasNext()) {
			int valor = it.next();
			if(valor % 2 == 0) {
				multiplos.add(valor);
			}
		}
		System.out.println(multiplos);
		return multiplos;
	}
	
	public List<StringBuffer> copiarTextos(ArrayList<StringBuffer> velhosTextos) {
		List<StringBuffer> novosTextos = new ArrayList<StringBuffer>();
		novosTextos.addAll(velhosTextos);
		System.out.println(novosTextos);
		return novosTextos;
	}
	
	public Boolean compararLists(List<Integer> lista1, List<Integer> lista2) {
		if(lista1.containsAll(lista2)) {
			return true;
		} else return false;
	}
	//Mano, esses exercícios de comparação de listas eu comparei elemento por elemento hahahaha
	//genial seu código, parabéns!
	public Boolean compararSets(Set<Integer> set1, Set<Integer> set2) {
		if(set1.containsAll(set2)) {
			return true;
		} else return false;
	}
}
