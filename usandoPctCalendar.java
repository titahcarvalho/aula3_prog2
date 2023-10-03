package aula3_prog2;

import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Usando_GUI {
	public static void main (String[]  args) {
		int mes, dia, ano, diaDaSemana, idade;
		Calendar c = Calendar.getInstance(); //data de hoje ATUALLLL
		dia = c.get(Calendar.DAY_OF_MONTH);
		mes = c.get(Calendar.MONTH)+1;
		ano = c.get(Calendar.YEAR);
		diaDaSemana= c.get(Calendar.DAY_OF_WEEK);
		JOptionPane.showMessageDialog(null, dia + "/" + mes +"/"+ano);
		JOptionPane.showMessageDialog(null,"Dia da semana = " + diaDaSemana + "°-feira");
			Calendar aniversario = new GregorianCalendar(1996, Calendar.SEPTEMBER, 30);
		idade = c.get(Calendar.YEAR) - aniversario.get(Calendar.YEAR);
		//if (c.before(aniversario)) {
			//idade--;
		JOptionPane.showMessageDialog(null,"Idade " + idade);
		}
		
	}

//}
