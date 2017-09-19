package br.com.db1.colecoes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploHashSet {
	private Set<String> nomesDb1Start = new HashSet<>();
	
	public void adicionarNomes(String nome) {
		nomesDb1Start.add(nome);
	}
	
	public void removerNomes(String nome) {
		nomesDb1Start.remove(nome);
	}
	
	public Boolean estaNaLista(String nome) {
		return nomesDb1Start.contains(nome);
	}
	
	public void percorrerList(){
		Iterator lista = nomesDb1Start.iterator();
		while (lista.hasNext()){
			System.out.println(lista.next());
		}
	}

	public Integer tamanhoLista(){
		return nomesDb1Start.size();
	}

	public Set<String> getListaOrdenadaTreeSet() {
		Set<String> listaOrdenada = new TreeSet<>();
		listaOrdenada.addAll(nomesDb1Start);
		return listaOrdenada;
	}
}
