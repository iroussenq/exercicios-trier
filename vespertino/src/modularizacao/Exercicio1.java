package modularizacao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		Integer numeroInteiro = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite um numero"));
		Integer fatorial = retornaFatorial(numeroInteiro);
		System.out.println("O valor do fatorial do numero " + numeroInteiro + " é " + fatorial);
		
	}
	public static Integer retornaFatorial(Integer numeroInteiro) {
		Integer soma = 1;
		for (int i = 1; i <= numeroInteiro ; i++) {
			soma = soma * i;
		}
		return soma;
	}
}
