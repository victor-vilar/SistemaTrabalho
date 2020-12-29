package br.com.landtecengenharia.sistemaInterno.cliente;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		
		//objetos
		//labels
		l1 = new Label("Nome:");
		cnpj = new Label("CNPJ:");
		cpf = new Label("CPF:");
		//botoes
		frame = new JFrame();
		botaoSalvar = new JButton("Salvar");
		botaoFechar = new JButton("Fechar");
		//textfield
		nomeDoCliente = new TextField("", 255);
		cnpjDoCliente = new TextField("", 14);
		cpfDoCliente = new TextField("", 11);
		
		//----------
		//adicionando no formulario
		frame.add(botaoSalvar);
		frame.add(botaoFechar);		
		frame.add(nomeDoCliente);
		frame.add(l1);
		frame.add(cnpj);
		frame.add(cnpjDoCliente);
		frame.add(cpf);
		frame.add(cpfDoCliente);
		//------------------------------------
		
		//adicionando os listeneres nos botoes
		botaoSalvar.addActionListener(new SaveMessengerListener());
		botaoFechar.addActionListener(new TurnOffProgram());
		//------------------------------------
		
		//informaçoes da janela
		frame.setTitle("Cadastro de Clientes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);	
		frame.setLayout(null);
		frame.setResizable(false);
		//------------------------------------
		
		//informações dos objetos
		//botoes
		botaoSalvar.setBounds(5,225,100,30);					
		botaoFechar.setBounds(110,225,100,30);
		//labels
		cpf.setBounds(5,60, 200, 20);
		cnpj.setBounds(200,60, 200, 20);
		l1.setBounds(5,5, 100, 30);
		//textfield
		nomeDoCliente.setBounds(5,30, 475, 20);
		cnpjDoCliente.setBounds(200,80, 150, 20);
		cpfDoCliente.setBounds(5,80, 150, 20);
		//------------------------------------
		
	}
	
	
	class SaveMessengerListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"Cliente " + nomeDoCliente.getText() + " salvo com sucesso !");
		}
	}
	
	class TurnOffProgram implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	
	public static void main(String[] args) {
		FormularioDeCadastroDeClientes form = new FormularioDeCadastroDeClientes();
	}
	
	
 
	
}
