package calculadora;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite um n�mero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite outro n�mero: ");
		numero2 = entrada.nextInt();
		
		soma = numero1+numero2;
		
		System.out.printf("Resultado foi %d\n ", soma);

	}

}
