package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		try {
		System.out.println("Digite os elementos do vetor: ");
		String[] vect = teclado.nextLine().split(" ");
		System.out.println("Digitar a posição: ");
		int posicao = teclado.nextInt();
		System.out.println(vect[posicao]);
		}
		
		catch(InputMismatchException e) {
			System.out.println("Posicao é composta por numeros do tipo inteiro");
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("Esta posição nao existe no vetor!!");
		}
		
		
		
		
		System.out.println("Fim do Programa ");
		
		teclado.close();
		
		

	}

}
