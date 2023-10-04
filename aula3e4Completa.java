package aula3_prog2;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Usando_GUI {
    public static void main(String[] args) {
    	String nome;
    	int nivel;
    	//Object [] opcoes= {"alto","medio","baixo"};
    	//Object nivel;
    	nome = JOptionPane.showInputDialog(null, "Digite o seu nome:", "Apresentação", JOptionPane.INFORMATION_MESSAGE);
    	JOptionPane.showMessageDialog(null,"Seja bem-vinda(a) "+ nome, "Saudação",JOptionPane.INFORMATION_MESSAGE);
    	nivel = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o seu nível em programação com a linguagem Java 0 a 10:", "Questionário", JOptionPane.QUESTION_MESSAGE));
    	if (nivel < 5) { 
    	JOptionPane.showMessageDialog(null,"Nível: " + nivel + " Você precisa estudar mais!", "Mensagem importante!", JOptionPane.INFORMATION_MESSAGE);
    	} else { 
    		JOptionPane.showMessageDialog(null,"Nível: " + nivel + " Parabéns! Dedicação rima com programação", "Mensagem especial!", JOptionPane.INFORMATION_MESSAGE);
    	}	
        int mes, dia, ano, diaDaSemana, idade;
        
        idade = Integer.parseInt( JOptionPane.showInputDialog(null,"Digite a sua idade: ", "Coleta de dados", JOptionPane.INFORMATION_MESSAGE));
        Object [] opcoes = {"sim","não"};
        Object x = JOptionPane.showInputDialog(null, "É amigo do Neymar? - sim/não?", "Pode falar!", JOptionPane.QUESTION_MESSAGE, null, opcoes, "não");
        if ((idade < 18) && (x != null) && (x.toString().equals("não"))) {
        	JOptionPane.showMessageDialog(null,"Acesso negado!", "Volte logo!", JOptionPane.INFORMATION_MESSAGE);
        } else {
        	JOptionPane.showMessageDialog(null, "Acesso livre!", "Seja bem-vindo!", JOptionPane.INFORMATION_MESSAGE);        	
        }
        JOptionPane.showMessageDialog(null,"Idade: " + idade, "É a sua idade mesmo?", JOptionPane.INFORMATION_MESSAGE );
        
                
        Calendar c = Calendar.getInstance(); // data de hoje ATUAL
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH) + 1;
        ano = c.get(Calendar.YEAR);
        diaDaSemana = c.get(Calendar.DAY_OF_WEEK);

        JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano, "Essa é a data atual?", JOptionPane.INFORMATION_MESSAGE );
        JOptionPane.showMessageDialog(null," Dia da Semana = " + diaDaSemana + "°-feira", "Lembra hoje é:", JOptionPane.INFORMATION_MESSAGE);

        Object[] meses = {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};
        Object[] dias = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        Object[] anos = {"1996", "2000", "2023"};
                   
        Object selecioneMes = JOptionPane.showInputDialog(null, "Selecione o mês de nascimento: ", "DATA DE NASCIMENTO", JOptionPane.QUESTION_MESSAGE, null, meses, meses[0]);
        Object selecioneDia = JOptionPane.showInputDialog(null, "Selecione o dia de nascimento: ", "DATA DE NASCIMENTO", JOptionPane.QUESTION_MESSAGE, null, dias, dias[0]);
        Object selecioneAno = JOptionPane.showInputDialog(null, "Selecione o ano de nascimento: ", "DATA DE NASCIMENTO", JOptionPane.QUESTION_MESSAGE, null, anos, anos[0]);
        
        int selecioneMesIndex = java.util.Arrays.asList(meses).indexOf(selecioneMes); //não entendi essa parte do Index
        int selecioneDiaIndex = java.util.Arrays.asList(dias).indexOf(selecioneDia);
        int selecioneAnoIndex = java.util.Arrays.asList(anos).indexOf(selecioneAno);

        Calendar aniversario = new GregorianCalendar(Integer.parseInt(selecioneAno.toString()), selecioneMesIndex, selecioneDiaIndex + 1); // Adiciona 1 ao dia, pois os dias começam de 1 //correção do selecioneAno+toString()
        idade = ano - aniversario.get(Calendar.YEAR);
        aniversario.add(Calendar.YEAR, idade);
       if (c.before(aniversario)) { //não entendi essa parte 
            idade--;
        }

        JOptionPane.showMessageDialog(null, "Idade: " + idade);
    }
}

