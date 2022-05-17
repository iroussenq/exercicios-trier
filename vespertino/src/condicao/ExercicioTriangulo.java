package condicao;

import javax.swing.JOptionPane;

public class ExercicioTriangulo {
	public static void main(String[] args) {
		Integer A = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite o lado A"));
		Integer B = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite o lado B"));
		Integer C = Integer.valueOf(JOptionPane.showInputDialog(null,"Sessão o lado C"));
		if((A != 0 && B != 0 && C != 0) && (A < B + C && B < A + C && C < B + A)) {
			if((A - B < C << A + B)) {
				if(A == B && B == C) {
					JOptionPane.showMessageDialog(null, "Equilatero");
				} else if(A == B || B == C || C == A) {
					JOptionPane.showMessageDialog(null, "Isoceles");
				} else {
					JOptionPane.showMessageDialog(null, "Escaleno");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Digite um triangulo valido");
		}
	}
}