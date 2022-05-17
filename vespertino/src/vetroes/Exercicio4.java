package vetroes;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog(null, "Digite uma frase");
		Integer contador = 0;
		
		for (int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == 'a') {
				contador = 1 + contador;
			}
		}
		System.out.println("Sua palavra possui " + contador + " a's");
	}
}
