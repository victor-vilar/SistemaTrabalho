package br.com.landtecengenharia.sistemaInterno.layouts.formularios;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FormularioBorderLayout {
	JFrame form = new JFrame();
	JButton botao = new JButton("Teste");
	JButton botao2 = new JButton("Teste");
	JButton botao3 = new JButton("Teste");
	public FormularioBorderLayout() {
		//layout padra, n�o � necessario
		form.setLayout(new BorderLayout());
		form.setTitle("T�tulo da Janela");
		form.setSize(700,600);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLocationRelativeTo(null);
		form.setVisible(true);
		
		//incluindo objetos com o borer layout
		form.add(BorderLayout.NORTH,botao);
		form.add(BorderLayout.EAST,botao2);
		form.add(BorderLayout.CENTER,botao3);
	}
	
	public static void main(String[] args) {
		new FormularioBorderLayout();
	}
	

}
