package condicao;

import javax.swing.JOptionPane;

public class ExercicioOvos {
	public static void main(String[] args) {
		Integer ovos = Integer.valueOf(JOptionPane.showInputDialog(null, "Quantos ovos?"));
		Integer novosOvos = 0;
		//12 ovos
		Double duzia = 10.00;
		//30 ovos
		Double bandeija = 21.00;
		Double valorAbsoluto = 0.00;

		if(ovos < 12) {

			valorAbsoluto = ovos * 1.50;

		} else if(ovos == 12) {

			valorAbsoluto = duzia;

		} else if(ovos > 12 && ovos < 30){

			valorAbsoluto = ovos/12 * duzia;
			novosOvos = ovos % 12;
			valorAbsoluto = valorAbsoluto + (novosOvos * 1.50);

		} else if(ovos == 30) {

			valorAbsoluto = bandeija;

		} else if(ovos > 30) {

			valorAbsoluto = (ovos/30 * bandeija);
			novosOvos = (ovos % 30);
			valorAbsoluto = valorAbsoluto + (novosOvos/12 * duzia);
			novosOvos = (novosOvos % 12);
			valorAbsoluto = valorAbsoluto + (novosOvos * 1.50);

		} 
		JOptionPane.showMessageDialog(null, "Preço a se pagar: " + valorAbsoluto);
	}
}