package modularizacao;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		/**
		 * Peça para o usuário digitar dois números: a e n. 
		 * A seguir, crie uma função que multiplique um número
		 *  pelo outro e retorne o valor dessa multiplicação.
		 *   Na função principal, exiba o retorno dessa função
		 *    para o usuário. Nesse exercício, você não pode usar
		 *     o caractere ‘*’ (asterisco) em nenhum lugar do programa
*
		 * 
		 */
		Integer a = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o numero 'a' "));
		Integer n = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a numero 'n'"));
		System.out.println(a + " vezes " + n + " = " + multiplicaNumero(a, n));
	}
	static Integer multiplicaNumero(Integer a,Integer n){
		Integer valorAbsoluto = 0;
		for (int i = 0; i < n; i++) {
			valorAbsoluto = n + valorAbsoluto;
		}
		return valorAbsoluto;
	}
	
}
