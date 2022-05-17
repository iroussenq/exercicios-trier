package vespertino;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		/**A gasolina está absurdamente cara! Por causa disso, Juca, o proprietário de um veículo Uno Mille 1997, 
		 * pediu para que você criasse um programa personalizado, 
		 * no qual ele informaria o preço atual da gasolina e a distância que ele pretende percorrer no dia e o 
		 * programa informa quanto ele gastará para percorrer tal distância. Considere que, em virtude da ação do 
		 * tempo e da falta de manutenção, 
		 * o Uno Mille 1997 de Juca percorre apenas 10 quilômetros com um litro de gasolina.
		 */
		Double precoGasolina = Double.valueOf(JOptionPane.showInputDialog(null,"Informe o preço da gasolina:"));
		Double distanciaPercorrida = Double.valueOf(JOptionPane.showInputDialog(null, "Informe a distancia percorrida:"));
		Double dinheiroGasto = (distanciaPercorrida/10 * precoGasolina);
		
		JOptionPane.showMessageDialog(null, "Você gastara " + dinheiroGasto + " para percorrer " + distanciaPercorrida );
		
	}
}