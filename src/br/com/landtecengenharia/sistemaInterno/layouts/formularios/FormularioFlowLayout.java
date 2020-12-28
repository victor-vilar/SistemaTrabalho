package br.com.landtecengenharia.sistemaInterno.layouts.formularios;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FormularioFlowLayout {
	JFrame form = new JFrame();
	JButton botao = new JButton("Teste");
	JButton botao2 = new JButton("Teste");
	JButton botao3 = new JButton("Teste");
	public FormularioFlowLayout() {
		// os componentes vao ocupando a linhas em quanto tiver espaço
		// passando a constante eles irao alinhados 
		form.setLayout(new FlowLayout(FlowLayout.RIGHT));
		form.setTitle("Título da Janela");
		form.setSize(700,600);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLocationRelativeTo(null);
		form.setVisible(true);
	
		//incluindo objetos com o borer layout
		form.add(botao);
		form.add(botao2);
		form.add(botao3);
		
	}
	
	public static void main(String[] args) {
		new FormularioFlowLayout();
	}
	

}
