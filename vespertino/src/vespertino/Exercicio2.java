package vespertino;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		/**Voc� foi contratado pelo dono do Restaurante Prato Cheio para fazer o programa que calcular� o 
		 * valor que cada cliente deve pagar. Para isso, voc� deve pedir ao atendente que digite o peso 
		 * informado pela balan�a, informando ao atendente, em seguida, o valor que deve ser pago. O pre�o do 
		 * quilo no Restaurante Prato Cheio � fixo h� 5 anos e � um dos motivos de orgulho do dono: 
		 * apenas R$ 17,90! A tara (peso do prato) � de 800 gramas.
		 */
		Double pesoBalanca = Double.valueOf(JOptionPane.showInputDialog(null,"Informe o pre�o da balanca:"));
		Double valorPago = ((pesoBalanca - 0.8) * 17.9);
		
		JOptionPane.showMessageDialog(null, "Total: " + valorPago);

	}
}