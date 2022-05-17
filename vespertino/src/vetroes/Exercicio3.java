package vetroes;

public class Exercicio3 {
	public static void main(String[] args) {
		Integer[][] matriz = new Integer[5][5];

		for (int coluna = 0; coluna < matriz.length; coluna++) {
			for (int linha = 0; linha < matriz.length; linha++) {
				matriz[coluna][linha] = coluna + 1;
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == j) {
					System.out.print(matriz[i][j]);
				}  else if((i + j) == (matriz.length - 1)){ //??????? 
					System.out.print(matriz[i][j]);
				} else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
