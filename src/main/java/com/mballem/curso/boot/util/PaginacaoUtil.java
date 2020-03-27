package com.mballem.curso.boot.util;

import java.util.List;

public class PaginacaoUtil<T> {

	private int tamanho;
	private int pagina;
	private long totalDePaginas;
	private List<T> registro;
	
	public PaginacaoUtil(int tamanho, int pagina, long totalDePaginas, List<T> registro) {
		super();
		this.tamanho = tamanho;
		this.pagina = pagina;
		this.totalDePaginas = totalDePaginas;
		this.registro = registro;
	}

	public int getTamanho() {
		return tamanho;
	}

	public int getPagina() {
		return pagina;
	}

	public long getTotalDePaginas() {
		return totalDePaginas;
	}

	public List<T> getRegistro() {
		return registro;
	}
}
