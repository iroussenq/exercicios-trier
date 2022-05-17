package modularizacao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		Integer n1 = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o primeiro numero "));
		Integer n2 = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a segundo numero"));
		Integer n3 = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite a terceiro numero "));
		System.out.println("A ordem dos numeros foi: " + ordenaCrescente(n1, n2, n3) );
	
		
	}
	public static String ordenaCrescente(Integer n1, Integer n2, Integer n3) {
		Integer valor1 = 1;
		Integer valor2 = 1;
		Integer valor3 = 1;
		String ordem;
		
		if(n1>n2 & n1> n3) {
			valor1 = n1;
			if(n2>n3) {
				valor2 = n2;
				valor3 = n3;
			} else if(n3>n2) {
				valor2 = n3;
				valor3 = n2;
			}
		}
		
		if(n2>n1 & n2> n3) {
			valor1 = n2;
			if(n3>n1) {
				valor2 = n3;
				valor3 = n1;
			} else if(n1>n3) {
				valor2 = n1;
				valor3 = n3;
			}
		}
		
		if(n3>n1 & n3> n2) {
			valor1 = n3;
			if(n2>n1) {
				valor2 = n2;
				valor3 = n1;
			} else if(n1>n2) {
				valor2 = n1;
				valor3 = n2;
			}
		}
		ordem = valor1 + " " + valor2 + " " + valor3;
		return ordem;
	}
}