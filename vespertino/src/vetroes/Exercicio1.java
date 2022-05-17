package vetroes;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
	int[] numeros = new int[10];
	for (int i = 0; i < numeros.length; i++) {
		numeros[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite o numero " + (i + 1)  + "/10 " + " da sequencia de numeros"));
	}
	for (int i = numeros.length - 1; i >= 0; i--) {
		System.out.print(numeros[i] + " ");
	}
}
}
