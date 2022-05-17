package condicao;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		Integer numero = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite um numero"));
		switch(numero) {
		case 1 : JOptionPane.showMessageDialog(null, "Um");
		break;
		case 2 : JOptionPane.showMessageDialog(null, "Dois");
		break;
		case 3 : JOptionPane.showMessageDialog(null, "Tres");
		break;
		case 4 : JOptionPane.showMessageDialog(null, "Quatro");
		break;
		case 5 : JOptionPane.showMessageDialog(null, "Cinco");
		break;
		default: JOptionPane.showMessageDialog(null,"Digite um numero entre 1 e 5");
		break;

		}
	}
}
