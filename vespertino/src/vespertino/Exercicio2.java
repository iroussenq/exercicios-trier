package vespertino;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		/**Você foi contratado pelo dono do Restaurante Prato Cheio para fazer o programa que calculará o 
		 * valor que cada cliente deve pagar. Para isso, você deve pedir ao atendente que digite o peso 
		 * informado pela balança, informando ao atendente, em seguida, o valor que deve ser pago. O preço do 
		 * quilo no Restaurante Prato Cheio é fixo há 5 anos e é um dos motivos de orgulho do dono: 
		 * apenas R$ 17,90! A tara (peso do prato) é de 800 gramas.
		 */
		Double pesoBalanca = Double.valueOf(JOptionPane.showInputDialog(null,"Informe o preço da balanca:"));
		Double valorPago = ((pesoBalanca - 0.8) * 17.9);
		
		JOptionPane.showMessageDialog(null, "Total: " + valorPago);

	}
}