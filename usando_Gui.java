package aula3_prog2;

import javax.swing.JOptionPane;

public class Usando_GUI {
	public static void main (String[]  args) {
		String nome;
		Object [] opcoes = {"alto", "médio", "baixo"};
		Object nivel;
		JOptionPane.showMessageDialog(null, "Olá Mundo");
		nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		JOptionPane.showMessageDialog(null,  "Seja bem-vindo(a) " + nome, "Saudação", JOptionPane.INFORMATION_MESSAGE);
		nivel=JOptionPane.showInputDialog(null, "Qual é o seu conhecimento de programação?", "Questionário",JOptionPane.QUESTION_MESSAGE, null, opcoes,"alto");
		System.out.println(nivel);
		JOptionPane.showMessageDialog(null,"Nível = "+ nivel);	
	
	
	}

}
