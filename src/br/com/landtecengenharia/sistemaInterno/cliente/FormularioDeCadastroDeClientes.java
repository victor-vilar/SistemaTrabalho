package br.com.landtecengenharia.sistemaInterno.cliente;

import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class FormularioDeCadastroDeClientes {
	
	JFrame frame;
	JButton botaoSalvar;
	JButton botaoFechar;
	Label l1;
	TextField nomeDoCliente;
	Label cnpj;
	TextField cnpjDoCliente;
	Label cpf;
	TextField cpfDoCliente;
	
	public FormularioDeCadastroDeClientes(){
		
	
		//labels
		
		l1 = new Label("Nome:");
		l1.setBounds(5,5, 100, 30);
		
		cnpj = new Label("CNPJ:");
		cnpj.setBounds(200,60, 200, 20);
		
		cpf = new Label("CPF:");
		cpf.setBounds(5,60, 200, 20);
		
		//botoes
		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(5,225,100,30);	
		
		botaoFechar = new JButton("Fechar");
		botaoFechar.setBounds(110,225,100,30);
		
		
		//textfield
		nomeDoCliente = new TextField("", 255);
		nomeDoCliente.setBounds(5,30, 475, 20);
		
		cnpjDoCliente = new TextField("", 14);
		cnpjDoCliente.setBounds(200,80, 150, 20);
		
		cpfDoCliente = new TextField("", 11);
		cpfDoCliente.setBounds(5,80, 150, 20);

		
		//jPanel
		JPanel panel = new JPanel();
		panel.setBackground(Color.black);
		panel.setBounds(0,0,500,500);
		panel.add(botaoSalvar);
		panel.add(botaoFechar);
		panel.add(nomeDoCliente);
		panel.add(l1);
		panel.add(cnpj);
		panel.add(cpf);
		panel.add(cpfDoCliente);

		//----------
		//adicionando no formulario
		frame = new JFrame();
		frame.add(panel);
		//------------------------------------
		
		//adicionando os listeneres nos botoes
		botaoSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Cliente " + nomeDoCliente.getText() + " salvo com sucesso !");
			}
		});
		
		botaoFechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		//------------------------------------
		
		//informaçoes da janela
		frame.setTitle("Cadastro de Clientes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);	
		frame.setLayout(null);
		frame.setResizable(false);
		//------------------------------------
		
	}
	

	
	
	public static void main(String[] args) {
		FormularioDeCadastroDeClientes form = new FormularioDeCadastroDeClientes();
	}
	
	
 
	
}
