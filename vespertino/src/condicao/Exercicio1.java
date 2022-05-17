package condicao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	 public static void main(String[] args) {
		Integer ParOuImpar = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite um numero: "));
		if(ParOuImpar % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O numero que você digitou é par");
		}
		else if(ParOuImpar % 2 != 0){
			JOptionPane.showMessageDialog(null, "O numero que você digitou é impar");
		}
	}
}