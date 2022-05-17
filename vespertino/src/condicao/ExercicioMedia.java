package condicao;

import javax.swing.JOptionPane;

public class ExercicioMedia {
	public static void main(String[] args) {
		Double nota1 = Double.valueOf(JOptionPane.showInputDialog(null,"Digite a nota 1"));
		Double nota2 = Double.valueOf(JOptionPane.showInputDialog(null,"Digite a nota 2"));
		Double nota3 = Double.valueOf(JOptionPane.showInputDialog(null,"Digite a nota 3"));
		String Conceito = "";
		Double media = ((nota1 + nota2 + nota3)/3);
		if(media>= 9) {
			Conceito = "A";
		}else if (media >= 7) {
			Conceito = "B";
		}else if(media >= 5) {
			Conceito = "C";
		}else if(media >= 3) {
			Conceito = "D";
		}else if(media < 3 ) {
			Conceito = "E";
		}
		JOptionPane.showMessageDialog(null, "Media do aluno: " + media + "\t" + " Conceito do aluno: " + Conceito);
	}
}