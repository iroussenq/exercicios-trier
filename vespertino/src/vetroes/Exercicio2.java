package vetroes;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		Integer[] numeros = new Integer[10];
		preencheVetor(numeros);
		System.out.println(parImpar(numeros));
		
	}
	public static Integer[] preencheVetor(Integer[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite o numero " + (i + 1)  + "/10 " + " da sequencia de numeros"));
		}
		return numeros;
	}
	
	public static String parImpar(Integer[] numeros) {
		Integer par = 0;
		Integer impar = 0;
		String resultado = " ";
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				par = par + 1;
			}
			else if(numeros[i] % 2 != 0){
				impar = impar + 1;
			}
			resultado = "Numeros pares: " + par + "\nNumeros impares: " + impar;
		}
		return resultado;
	}
}
