package br.com.landtecengenharia.sistemaInterno.cliente;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FormularioDeCadastroDeClientes implements ActionListener {
	
	JFrame frame;
	JButton botaoSalvar;
	JButton botaoFechar;
	Label l1;
	TextField nomeDoCliente;
	
	public FormularioDeCadastroDeClientes(){
		
		frame = new JFrame();
		botaoSalvar = new JButton("Salvar");
		botaoFechar = new JButton("Fechar");
		l1 = new Label("Nome:");
		nomeDoCliente = new TextField("",255);
		
		botaoSalvar.addActionListener(this);
		botaoFechar.addActionListener(this);
		frame.setTitle("Cadastro de Clientes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);	
		frame.add(botaoSalvar);
		frame.add(botaoFechar);
		frame.setLayout(null);
		frame.setResizable(false);
		botaoSalvar.setBounds(5,225,100,30);					
		botaoFechar.setBounds(110,225,100,30);
		frame.add(nomeDoCliente);
		frame.add(l1);
		l1.setBounds(5,5, 100, 30);
		nomeDoCliente.setBounds(5,30, 250, 20);
		//nomeDoCliente.
		
			
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	public static void main(String[] args) {
		FormularioDeCadastroDeClientes form = new FormularioDeCadastroDeClientes();
	}
	
	
 
	
}
