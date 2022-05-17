package repeticao;

import javax.swing.JOptionPane;

public class Artilheiro {
	public static void main(String[] args) {
		Integer partidasJogadas = Integer.valueOf(JOptionPane.showInputDialog(null, "Quantidade de partidas jogadas: "));
		Integer chutesAGol = 0;
		Double mediaChutes = 0.00;
		Integer somaChutes = 0;
		Integer gols = 0;
		Integer somaGols = 0;
		Double mediaGols = 0.00;
		Integer streak = 0;
		Integer streakReal = 0;

		for (int i = 1; i <= partidasJogadas; i++) {
			chutesAGol = Integer.valueOf(JOptionPane.showInputDialog(null, "Quantidade de chutes a gol na partida: " + i));
			somaChutes = chutesAGol + somaChutes;
			gols = Integer.valueOf(JOptionPane.showInputDialog(null, "Quantidade de gols na partida: " + i));
			somaGols = gols + somaGols;
			
			mediaChutes = Double.valueOf(somaChutes / partidasJogadas);
			mediaGols = Double.valueOf(somaGols / partidasJogadas);

			if(gols == 0) {
				streak = streak + 1;
			}
			if(gols > 0) {
				streak = 0;
			}
			if(streak > streakReal) {
				streakReal = streak;
			}
			
		}
		JOptionPane.showMessageDialog(null, "Deyvinho: " + "\nJogou: " + partidasJogadas + " jogos" +
				"\nMarcou: " + somaGols + " gols" + 
				"\nFez: " + somaChutes + " chutes a gol." +
				"\nMedia de chutes a gol: " + mediaChutes + " chutes a gol por jogo" +
				"\nMedia de gols: " + mediaGols + " gols por jogo " +
				"\nMaior sequencia de jogos sem gols: " + streakReal + " jogos sem gols");
	}
}