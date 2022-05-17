package modularizacao;

import javax.swing.JOptionPane;

public class Exercicio5 {
	/**
	 * Peça para o usuário digitar dois números: a e n. 
	 * A seguir, crie uma função que receba esses números,
	 *  multiplique a por ele mesmo n vezes e retorne o valor
	 *   dessa multiplicação. Na função principal, exiba o 
	 *   retorno dessa função para o usuário. Nesse exercício,
	 *    você não pode usar o caractere ‘*’ (asterisco) em nenhum lugar do programa
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
