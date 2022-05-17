package modularizacao;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		/**
		 * Pe�a para o usu�rio digitar dois n�meros: a e n. 
		 * A seguir, crie uma fun��o que multiplique um n�mero
		 *  pelo outro e retorne o valor dessa multiplica��o.
		 *   Na fun��o principal, exiba o retorno dessa fun��o
		 *    para o usu�rio. Nesse exerc�cio, voc� n�o pode usar
		 *     o caractere �*� (asterisco) em nenhum lugar do programa
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
