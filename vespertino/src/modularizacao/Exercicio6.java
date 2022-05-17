package modularizacao;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		Integer segundos = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite uma quantidade de segundos"));
		System.out.println(segundosParaHoras(segundos));
	}
	public static String segundosParaHoras(Integer segundos) {
		String tempo = "";
		Integer novosSegundos;
		//60 segundos
		Integer minutos = 60;
		Integer minutosQntd = 0;
		//3600 segundos
		Integer horas = 3600;
		Integer horasQntd = 0;
		
		horasQntd = (segundos/horas);
		novosSegundos = (segundos % horas);
		
		minutosQntd = (novosSegundos/ minutos);
		novosSegundos = (novosSegundos % minutos);
		
		tempo = "\nHoras:\t" + horasQntd + "\nMinutos:\t" + minutosQntd + "\nSegundos:\t" + novosSegundos;
		return tempo;

	}
}
