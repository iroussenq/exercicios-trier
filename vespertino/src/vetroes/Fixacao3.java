package vetroes;

import javax.swing.JOptionPane;

public class Fixacao3 {
	public static Integer[] criaVetor(Integer[] vetor) { //Este metodo vai criar um vetor com [10] posições,todas null
		vetor = new Integer[10];
		return vetor;
	}
	public static Boolean isVazio(Integer[] vetor) { //Este metodo vai determinar se existe pelo menos UM null no vetor
		Boolean vazio = false;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == null) {
				vazio = true;
			}
		}
		return vazio;
	}
	
	public static void mostraVetoresVazios(Integer[] vetor) { //O metodo mais importante é esse,é como se fosse o "main"
		while(isVazio(vetor) == true) { 					 //Aqui é chamada a função que verifica se existem "nulos" no vetor
			System.out.print("Vetores vazios:\n");
			for (int i = 0; i < vetor.length; i++) {
				if(vetor[i] == null) {
				System.out.print(i + ": " + vetor[i] + "\n");
				}
				
			}
			requisitaPreenchimento(vetor);
			isVazio(vetor);
		}
		System.out.println("Vetor completo: "); //Se a condição do while for falsa,o programa acaba e encerra  com essa mensagem
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(i + " ");
		}
	}
	public static Integer[] requisitaPreenchimento(Integer[] vetor) { //Procedimento basico que solicita o preenchimento do vetor
		Integer preenchimento = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual posição deseja preencher?(De 0 a 9)")); //Nota:* o vetor tem [10] posições,mas o indice sempre começa no 0,então a posição final é 9.
		Integer novoValor = Integer.valueOf(JOptionPane.showInputDialog(null, "Insira um valor:"));
		vetor[preenchimento] = novoValor;
		return vetor;
		
	}
	
	public static void main(String[] args) { // Note como a main possui apenas 3 linhas,é importante ter em  
		Integer[] vetor = new Integer[10];  //mente que é possivel separar sempre os prodecimentos em blocos,
		criaVetor(vetor);					//isso ajuda na organização e no entendimento do codigo.
		mostraVetoresVazios(vetor);
		
	}

}