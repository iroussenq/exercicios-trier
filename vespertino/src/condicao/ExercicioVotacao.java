package condicao;

import javax.swing.JOptionPane;

public class ExercicioVotacao {
	public static void main(String[] args) {
		Integer DeputadosPresentes = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite os deputados presentes"));
		Integer VotosFavoraveis = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite a quantidade de votos favoraveis"));
		Integer Maioria = Integer.valueOf(JOptionPane.showInputDialog(null,"Sessão Simples(1) ou Qualificada(2)?"));

		if(DeputadosPresentes < 100) {
			JOptionPane.showMessageDialog(null, "Sem deputados suficientes");	
		} else if(Maioria == 1){
			if(VotosFavoraveis > DeputadosPresentes / 2 ) {
				JOptionPane.showMessageDialog(null, "A lei foi aprovada");
			} else {
				JOptionPane.showMessageDialog(null, "A lei não foi aprovada");
			}
		} else if(Maioria == 2) {
			if(VotosFavoraveis > (DeputadosPresentes / 3 * 2) ) {
				JOptionPane.showMessageDialog(null, "A lei foi aprovada");
			} else {
				JOptionPane.showMessageDialog(null, "A lei não foi aprovada");
			}
		}
	}
}