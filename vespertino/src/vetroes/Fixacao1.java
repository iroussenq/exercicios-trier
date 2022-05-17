package vetroes;

import java.util.Random;

public class Fixacao1 {
	public static void main(String[] args) {
		Integer[][] matriz = new Integer[9][9];
		Integer[] diagonalPrincipal = new Integer[9];

		geraMatriz(matriz);
		System.out.println("Sua matriz:\n");
		imprimeMatriz(matriz);
		armazenaDiagonalPrincipal(matriz, diagonalPrincipal);
		System.out.println("Sua diagonal principal:\n");
		mostraDiagonalPrincipal(diagonalPrincipal);



	}
	static void mostraDiagonalPrincipal(Integer[] diagonalPrincipal) {
		for (int i = 0; i < diagonalPrincipal.length; i++) {
			if(i < diagonalPrincipal.length - 1) {
				System.out.print(diagonalPrincipal[i] + ", ");
			}else if(i ==diagonalPrincipal.length - 1 ){
				System.out.print("e " + diagonalPrincipal[i] + ". ");
			}
		}
	}
	public static Integer[][] geraMatriz(Integer matriz[][]) {
		for (int coluna = 0; coluna < matriz.length; coluna++) {
			for (int linha = 0; linha < matriz.length; linha++) {
				Random random = new Random();
				int upperbound = 9;
				int int_random = random.nextInt(upperbound);
				matriz[coluna][linha] = int_random;
			}
		}
		return matriz;
	}
	public static void imprimeMatriz(Integer matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	public static Integer[] armazenaDiagonalPrincipal(Integer[][] matriz,Integer[] diagonalPrincipal) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == j) {
					diagonalPrincipal[i] = matriz[i][j]; 
				}
			}
		}
		return diagonalPrincipal;
	}
}
