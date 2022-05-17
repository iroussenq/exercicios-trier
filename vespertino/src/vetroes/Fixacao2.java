package vetroes;

import javax.swing.JOptionPane;

public class Fixacao2 {
	public static void main(String[] args) {
		Double[] notas = new Double[10];
		preencheVetor(notas);
		checkMedia(notas);
	}
	public static Double[] preencheVetor(Double[] notas) {
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Double.valueOf(JOptionPane.showInputDialog(null, "Digite a nota do aluno " + i));
		}
		return notas;
	}
	public static Double fazMedia(Double[] notas) {
		Double soma = 0.00;
		Double media = 0.00;
		for (int i = 0; i < notas.length; i++) {
			soma = notas[i] + soma; 
		}
		media = soma / 10;
		return media;
	}
	public static void checkMedia(Double[] notas) {
		System.out.print("Notas acima da media: ");
		for (int j = 0; j < notas.length; j++) {
			if(notas[j] > fazMedia(notas)) {
				System.out.print(notas[j] + " ");
			}
		} 
	}		
}
