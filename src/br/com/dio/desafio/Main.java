package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso c = new Curso();
		
		c.setTitulo("Curso Java");
		c.setDescricao("Curso de conceitos básicos de java");
		c.setCargaHoraria(12);
		
		Curso c2 = new Curso();
		
		c2.setTitulo("Curso Angular");
		c2.setDescricao("Curso de conceitos básicos de Angular");
		c2.setCargaHoraria(8);
		
		Mentoria m = new Mentoria();
		
		m.setTitulo("Mentoria em Java");
		m.setDescricao("Tira dúvidas Java");
		m.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Fullstack developer");
		bootcamp.setDescricao("Descricao do bootcamp");
		bootcamp.getConteudos().add(c);
		bootcamp.getConteudos().add(m);
		bootcamp.getConteudos().add(c2);
		
		Dev dev1 = new Dev();
		dev1.setNome("Caio");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Caio: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Caio: " + dev1.getConteudosConcluidos());
		dev1.progredir();
		System.out.println("Conteudos Inscritos Caio: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Caio: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		Dev dev2 = new Dev();
		dev2.setNome("Clau");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Clau: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Clau: " + dev2.getConteudosConcluidos());
		
	}

}
