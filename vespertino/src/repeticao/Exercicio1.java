package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		Integer nota1;
		Integer nota2;
		Integer nota3;
		
		for (int i = 1; i <= 5 ; i++) {
			nota1 = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a nota 1 do aluno " + i));
			nota2 = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a nota 2 do aluno " + i));
			nota3 = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a nota 3 do aluno " + i));
			JOptionPane.showMessageDialog(null, "A media do aluno " + i + " é: " + (nota1 + nota2 + nota3)/3);
		}
	}
}
