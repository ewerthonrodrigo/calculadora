package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int valor;
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Digite valor da Tabuada: ");
		valor = teclado.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + " X " + i + " = " + (valor*i) );
			
		}

	}

}
