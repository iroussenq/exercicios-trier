package modularizacao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Integer n1 = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o primeiro numero "));
		System.out.println("O numero " + n1 + " é " + isPositivo(n1));
	}
	public static String isPositivo(Integer n1) {
		@SuppressWarnings("unused")
		String positivoNegativo;
		if(n1>=0) {
			return positivoNegativo = "positivo";
		} else {
			return positivoNegativo = "negativo";
		}
	}
}