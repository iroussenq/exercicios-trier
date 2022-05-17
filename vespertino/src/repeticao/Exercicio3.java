package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Integer pessoas = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite quantas pessoas deseja registrar "));
		Integer idade = 0;
		Integer pessoaMaisVelha = 0;
		for (int i = 1; i <= pessoas; i++) {
			idade = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a idade da pessoa "));
			if(idade > pessoaMaisVelha) {
				pessoaMaisVelha = idade;
			}
		}
		JOptionPane.showMessageDialog(null, "A pessoa mais velha tem: " + pessoaMaisVelha + " anos");
	}
}
