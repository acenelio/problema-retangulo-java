package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do retangulo: ");
		double largura = sc.nextDouble();
		
		while (largura <= 0.0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}

		System.out.print("Digite a altura do retangulo: ");
		double altura = sc.nextDouble();
		
		while (altura <= 0.0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
		}		
		
		int opcao;
		
		do {

			System.out.println();
			System.out.println("MENU:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.print("Digite uma opcao: ");
			
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				double area = altura * largura;
				System.out.printf("%nAREA = %.1f%n", area);
			}
			else if (opcao == 2) {
				double perimetro = 2 * (altura + largura);
				System.out.printf("%nPERIMETRO = %.1f%n", perimetro);
			}
			else if (opcao == 3) {
				System.out.printf("%nFIM DO PROGRAMA!%n");
			}
			else {
				System.out.printf("%nOPÇÃO INVALIDA%n");
			}
		} while (opcao != 3);
		
		sc.close();
	}
}
