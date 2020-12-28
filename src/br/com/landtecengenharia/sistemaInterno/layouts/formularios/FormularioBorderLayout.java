package br.com.landtecengenharia.sistemaInterno.layouts.formularios;
import javax.swing.JFrame;

public class FormularioBorderLayout {
	JFrame form = new JFrame();
	
	
	public FormularioBorderLayout() {
		form.setTitle("Título da Janela");
		form.setSize(700,600);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLocationRelativeTo(null);
		form.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FormularioBorderLayout();
	}
	

}
