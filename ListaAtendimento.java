package com.filipe.AtendimentoMedico;

import java.util.List;

public class ListaAtendimento extends Atendimento {

	public void addLista(){
	}
	
	public List<Atendimento> mostrarLista() {
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaAtendimento []");
		return builder.toString();
	}


	
	
}
