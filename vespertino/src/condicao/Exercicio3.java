package condicao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Integer numero = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite um numero entre 5 e 10 (incluindo 5 e 10)"));
		if(numero >= 5 && numero <= 10) {
			JOptionPane.showMessageDialog(null, "Seu numero multiplicado por 2: " + numero * 2);
		} else if(numero < 5) {
			JOptionPane.showMessageDialog(null, "Seu numero é muito pequeno");
		} else if(numero > 10) {
			JOptionPane.showMessageDialog(null, "Seu numero é muito grande");
		}
	}
}

