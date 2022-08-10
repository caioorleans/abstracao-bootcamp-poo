package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso c = new Curso();
		
		c.setTitulo("Curso Java");
		c.setDescricao("Curso de conceitos básicos de java");
		c.setCargaHoraria(12);
		
		System.out.println(c);
		
		Mentoria m = new Mentoria();
		
		m.setTitulo("Mentoria em Java");
		m.setDescricao("Tira dúvidas data");
		m.setData(LocalDate.now());
		
		System.out.println(m);
	}

}
