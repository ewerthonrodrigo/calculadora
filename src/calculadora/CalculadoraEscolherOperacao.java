package calculadora;

import java.util.Scanner;

public class CalculadoraEscolherOperacao {
	
	public int som(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	
	public int mult(int num1, int num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {
		
		CalculadoraEscolherOperacao c = new CalculadoraEscolherOperacao();
		
		int opcao = 5;
		int num1;
		int num2;
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha uma Opera��o: ");
		System.out.println();
		System.out.println("1 - Soma ");
		System.out.println("2 - Subtra��o ");
		System.out.println("3 - Divis�o ");
		System.out.println("4 - Multiplica��o ");
		System.out.println("0 - Sair ");
		System.out.println();
		System.out.print("Opera��o: ");
		
		opcao = input.nextInt();
		
		while (opcao != 0 ) {
			Scanner input1 = new Scanner(System.in);
			
			System.out.println("Qual primeiro n�mero: ");
			num1 = input1.nextInt();
			System.out.println("Qual segundo n�mero: ");
			num2 = input1.nextInt();
			
			if (opcao == 1) {
				int operacao = c.som(num1, num2);
				System.out.printf("Resultado da soma �: %d\n", operacao );
				break;
			}
			
			else if (opcao == 2) {
				int operacao = c.sub(num1, num2);
				System.out.printf("Resultado da subtra��o �: %d\n", operacao);
				break;
			}
			
			else if (opcao == 3) {
				int operacao = c.div(num1, num2);
				System.out.printf("Resultado da divis�o �: %d\n", operacao);
				break;
			}
			
			else if (opcao == 4) {
				int operacao = c.mult(num1, num2);
				System.out.printf("Resultado da multiplica��o �: %d\n", operacao);
				break;
			}
			
			else {
				System.out.println();
				System.out.println("Escolha alguma opera��o do menu acima:");
				break;
			}
		}

	}

}
