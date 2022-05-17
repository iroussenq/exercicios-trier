package prova;

import javax.swing.JOptionPane;

public class ProvaICMS {
	public static void main(String[] args) {
		Double vBC = Double.valueOf(JOptionPane.showInputDialog(null,"Digite o valor da base de calculo:"));
		Double pICMS = Double.valueOf(JOptionPane.showInputDialog(null,"Digite o valor da aliquota:")) / 100;;
		System.out.println("O valor do ICMS a ser pago é " + calculaICMS(vBC, pICMS));
		
	}
	public static Double calculaICMS(Double vBC,Double pICMS) {
		Double vICMSOp;
		Double pDif = 0.3333;
		Double vICMSDif;
		Double vICMS;
		vICMSOp = vBC * pICMS;
		vICMSDif = vICMSOp * pDif;
		vICMS = vICMSOp - vICMSDif;
		return vICMS;
	}
}
