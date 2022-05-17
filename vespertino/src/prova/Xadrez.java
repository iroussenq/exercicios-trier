package prova;

public class Xadrez {
	public static void main(String[] args) {
		Integer n = 1;
		String caracterImpresso = "";

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print(" ");
				if(n % 2 == 0) {
				caracterImpresso = "X";
			} else{
				caracterImpresso = "O";
			}
			System.out.print(caracterImpresso);
			n += 1;	
		}
			n += 1;
			System.out.print("\n");
	} 
 }
}