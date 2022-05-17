package condicao;

import javax.swing.JOptionPane;

public class ExerciciosHard {
	public static void main(String[] args) {
		Integer ovos = Integer.valueOf(JOptionPane.showInputDialog(null, "Quantos ovos?"));
		Integer novosOvos;
		//12 ovos
		Double duzia = 10.00;
		//6 ovos
		Double meiaDuzia = 6.00;
		//30 ovos
		Double bandeija = 21.00;
		Double valorAbsoluto = 0.00;
		
		valorAbsoluto = (ovos/30 * bandeija);
		novosOvos = (ovos % 30);
		valorAbsoluto = valorAbsoluto + (novosOvos/12 * duzia);
		novosOvos = (novosOvos % 12);
		valorAbsoluto = valorAbsoluto + (novosOvos/6 * meiaDuzia);
		novosOvos = (novosOvos % 6);
		valorAbsoluto = valorAbsoluto + (novosOvos * 1.50);

		JOptionPane.showMessageDialog(null, "Preço a se pagar: " + valorAbsoluto);
	}
}