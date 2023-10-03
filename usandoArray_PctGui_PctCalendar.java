package aula3_prog2;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Usando_GUI {
    public static void main(String[] args) {
        int mes, dia, ano, diaDaSemana, idade;
        Calendar c = Calendar.getInstance(); // data de hoje ATUAL
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH) + 1;
        ano = c.get(Calendar.YEAR);
        diaDaSemana = c.get(Calendar.DAY_OF_WEEK);

        JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano + " Dia da Semana = " + diaDaSemana + "°-feira");

        Object[] meses = {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};
        Object[] dias = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        Object[] anos = {"1996", "2000", "2023"}; //há possibilidade de colocar um pacote que já possui todas as data, ou solicitar o usuário para digitar
        
        Object selecioneMes = JOptionPane.showInputDialog(null, "Selecione o mês de nascimento: ", "DATA DE NASCIMENTO", JOptionPane.QUESTION_MESSAGE, null, meses, meses[0]);
        Object selecioneDia = JOptionPane.showInputDialog(null, "Selecione o dia de nascimento: ", "DATA DE NASCIMENTO", JOptionPane.QUESTION_MESSAGE, null, dias, dias[0]);
        Object selecioneAno = JOptionPane.showInputDialog(null, "Selecione o ano de nascimento: ", "DATA DE NASCIMENTO", JOptionPane.QUESTION_MESSAGE, null, anos, anos[0]);
        
        int selecioneMesIndex = java.util.Arrays.asList(meses).indexOf(selecioneMes); //não entendi essa parte do Index
        int selecioneDiaIndex = java.util.Arrays.asList(dias).indexOf(selecioneDia);
        int selecioneAnoIndex = java.util.Arrays.asList(anos).indexOf(selecioneAno);

        Calendar aniversario = new GregorianCalendar(selecioneAnoIndex, selecioneMesIndex, selecioneDiaIndex + 1); // Adiciona 1 ao dia, pois os dias começam de 1
        idade = ano - aniversario.get(Calendar.YEAR);

       if (c.before(aniversario)) { //não entendi essa parte 
            idade--;
        }

        JOptionPane.showMessageDialog(null, "Idade: " + idade);
    }
}

