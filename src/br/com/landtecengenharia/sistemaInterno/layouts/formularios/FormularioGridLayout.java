package br.com.landtecengenharia.sistemaInterno.layouts.formularios;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FormularioGridLayout {
	JFrame form = new JFrame();
	JButton botao = new JButton("Teste1");
	JButton botao2 = new JButton("Teste2");
	JButton botao3 = new JButton("Teste3");
	JButton botao4 = new JButton("Teste4");
	public FormularioGridLayout() {
		//passando o numero de linhas e colunas para o grid layout
		form.setLayout(new GridLayout(1,5));
		form.setTitle("Título da Janela");
		form.setSize(700,600);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLocationRelativeTo(null);
		form.setVisible(true);
	
		//incluindo objetos com o borer layout
		form.add(botao);
		form.add(botao2);
		form.add(botao3);
		form.add(botao4);
		
	}
	
	public static void main(String[] args) {
		new FormularioGridLayout();
	}
	

}
