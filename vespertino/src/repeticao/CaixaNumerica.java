package repeticao;

import javax.swing.JOptionPane;

public class CaixaNumerica {
	public static void main(String[] args) {
		Integer n = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite um numero"));

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" ");
				if(j == i) {
					System.out.print(j);
				} else if(i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else if(j != i){
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}	
	} 
} 