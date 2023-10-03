package aula3_prog2;

import javax.swing.JOptionPane;

public class Usando_GUI {
	public static void main (String[]  args) {
		int idade;
		idade = Integer.parseInt( JOptionPane.showInputDialog("Qual é a sua idade?"));
		System.out.println(idade);
		Object [] opcoes = {"sim", "não"};
		Object x = JOptionPane.showInputDialog(null,"É amigo do dono?","Questionário",JOptionPane.QUESTION_MESSAGE, null, opcoes,"não");
		if ( x!= null && idade < 18 && x.toString().equals ("não")) {
			JOptionPane.showMessageDialog(null,"Acesso negado!");
		} else {
			JOptionPane.showInternalMessageDialog(null,"Acesso livre! Seja bem-vindo!");
		}
		JOptionPane.showMessageDialog(null, "Idade = " + idade);
	}

}
