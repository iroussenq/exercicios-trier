package vespertino;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		/**A gasolina est� absurdamente cara! Por causa disso, Juca, o propriet�rio de um ve�culo Uno Mille 1997, 
		 * pediu para que voc� criasse um programa personalizado, 
		 * no qual ele informaria o pre�o atual da gasolina e a dist�ncia que ele pretende percorrer no dia e o 
		 * programa informa quanto ele gastar� para percorrer tal dist�ncia. Considere que, em virtude da a��o do 
		 * tempo e da falta de manuten��o, 
		 * o Uno Mille 1997 de Juca percorre apenas 10 quil�metros com um litro de gasolina.
		 */
		Double precoGasolina = Double.valueOf(JOptionPane.showInputDialog(null,"Informe o pre�o da gasolina:"));
		Double distanciaPercorrida = Double.valueOf(JOptionPane.showInputDialog(null, "Informe a distancia percorrida:"));
		Double dinheiroGasto = (distanciaPercorrida/10 * precoGasolina);
		
		JOptionPane.showMessageDialog(null, "Voc� gastara " + dinheiroGasto + " para percorrer " + distanciaPercorrida );
		
	}
}