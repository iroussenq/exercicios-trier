package vespertino;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		String nomeDoProduto = JOptionPane.showInputDialog(null,"Informe o nome do produto.");
		Double baseDeCalculo = Double.valueOf(JOptionPane.showInputDialog(null,"Informe a base de calculo."));
		Double aliquota = Double.valueOf(JOptionPane.showInputDialog(null,"Informe a aliquota."));
		
		JOptionPane.showMessageDialog(null,"******************" + "\nO produto que você comprou: " + nomeDoProduto + ", possui " + ((baseDeCalculo/100) * aliquota) + " de ICMS." + "\n******************");
		
	}
}