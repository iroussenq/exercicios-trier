package condicao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		Integer numero = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite um numero maior que 10"));
		if(numero > 10) {
			JOptionPane.showMessageDialog(null, "Seu numero multiplicado por 2: " + numero * 2);
		} else if(numero <= 10) {
			JOptionPane.showMessageDialog(null, "Digite um numero maior que 10");
		}
	}
}