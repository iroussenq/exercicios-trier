package modularizacao;

import javax.swing.JOptionPane;

public class Exercicio5 {
	/**
	 * Pe�a para o usu�rio digitar dois n�meros: a e n. 
	 * A seguir, crie uma fun��o que receba esses n�meros,
	 *  multiplique a por ele mesmo n vezes e retorne o valor
	 *   dessa multiplica��o. Na fun��o principal, exiba o 
	 *   retorno dessa fun��o para o usu�rio. Nesse exerc�cio,
	 *    voc� n�o pode usar o caractere �*� (asterisco) em nenhum lugar do programa
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o numero 'a' "));
		Integer n = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a numero 'n'"));
		System.out.println(a + " vezes " + n + " = " + multiplicaNumeroPorEleMesmo(a, n));
	
	}
	static Integer multiplicaNumeroPorEleMesmo(Integer a,Integer n){
		Integer valorReal = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a; j++) {
				valorReal = a + valorReal;
			}
		}
		return valorReal;
	}
}
