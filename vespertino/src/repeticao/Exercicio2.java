package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		Integer condicionador = 1;
		Integer nota;
		Integer total = 0;
		Integer media = 0;
		Integer i = 0;
		while(condicionador != 0) {
			nota = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a nota do aluno "));
			total = total + nota;
			i = i + 1;
			media = total/i;
			condicionador = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite 0 para parar,digite qualquer outra coisa para continuar "));
		}
		JOptionPane.showMessageDialog(null, "A média dos " + i + " alunos da turma foi: " + media);

	}

}
