import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double largura = sc.nextDouble();
//		double comprimento = sc.nextDouble();
//		double metroQuadrado = sc.nextDouble();
//	
//		double area = largura * comprimento;
//		double preco = area * metroQuadrado;
//	
//		System.out  .printf("ÁREA = %.2f%n", area);
//		System.out.printf("PREÇO = %.2f%n", preco);
//	
//		sc.close();
//		
//		
//		Scanner sc1 = new Scanner(System.in);
//
//		int x = sc1.nextInt();
//
//		while (x != 0) {
//			x = sc1.nextInt();
//		}
//
//		sc1.close();
//
//
//		Scanner sc2 = new Scanner(System.in);
//
//		int x1 = sc2.nextInt();
//		int soma = 0;
//
//		while (x1 != 0) {
//			soma += x1;
//			x1 = sc2.nextInt();
//		}
//
//		System.out.println(soma);
//
//		sc2.close();
//		
//		
//		//TESTE DE MESA COM WHILE
//		Scanner sc3 = new Scanner(System.in);
//		
//		int x2 = sc3.nextInt();
//		int y = sc3.nextInt();
//		
//		while (x2 > 2) {
//			System.out.print(x2);
//			y = y + x2;
//			x2 = x2 - 1;
//		}
//		
//		sc3.close();
//		
//		
//		Scanner sc4 = new Scanner(System.in);
//		
//		int x3 = sc4.nextInt();
//		int y1 = sc4.nextInt();
//		
//		while (x3 <60) {
//			System.out.println(x3);
//			x3 = x3 * 2;
//			y1 = y1 + 10;
//		}
//		
//		sc4.close();
//		
//		
//		Scanner sc5 = new Scanner(System.in);
//		
//		double x4 = sc5.nextDouble();
//		double y2 = sc5.nextDouble();
//		
//		while (x4 != y2) {
//			System.out.print("olha");
//			x4 = Math.sqrt(y2);
//		}
//		
//		sc5.close();
//		
//		
//		Scanner sc6 = new Scanner(System.in);
//		
//		int x5 = sc6.nextInt();
//		int y3;
//		
//		while (x5 < 5) {
//			y3 = x5 * 3;
//			System.out.print(y3);
//			x5 = x5 + 1;
//		}
//		
//		System.out.println("Fim");
//		
//		sc6.close();
//		
//		
//		Scanner sc7 = new Scanner(System.in);
//		
//		int x6 = sc7.nextInt();
//		int y4 = sc7.nextInt();
//		
//		System.out.println("Olá");
//		
//		while (x6 < y4) {
//			System.out.println(x6 + "-" + y4);
//			x6 = x6 * 2;
//			y4 = y4 + 1;
//		}
//		
//		sc7.close();
//		
//		
//		Scanner sc8 = new Scanner(System.in);
//		
//		int x7 = sc8.nextInt();
//		int y5 = sc8.nextInt();
//		int i = sc8.nextInt();
//		
//		while (i < x7) {
//			i = i + 1;
//			y5 = y5 + i;
//			System.out.print(i);
//			System.out.println(y5);
//		}
//		
//		sc8.close();
//		
//		
//		//EXERCÍCIO01
//		Scanner sc9 = new Scanner(System.in);
//		
//		int senha = sc9.nextInt();
//		
//		while (senha != 2002) {
//			System.out.println("Senha inválida");
//			senha = sc9.nextInt();
//		}
//		
//		System.out.println("Acesso permitido");
//		
//		sc9.close();
//		
//		
//		//EXERCÍCIO02 
//		Scanner sc10 = new Scanner(System.in);
//
//		int x8 = sc10.nextInt();
//		int y6 = sc10.nextInt();
//				
//		while (x8 != 0 && y6 != 0) {
//			if (x8 > 0 && y6 > 0) {
//				System.out.println("Primeiro quadrante");
//			}
//			else if (x8 < 0 && y6 > 0) {
//				System.out.println("Segundo quadrante");
//			}
//			else if (x8 < 0 && y6 < 0) {
//				System.out.println("Terceiro quadrante");
//			}
//			else {
//				System.out.println("Quarto quadrante");
//			}
//			x8 = sc10.nextInt();
//			y6 = sc10.nextInt();
//		}
//				
//		sc10.close();
//		
//		//EXERCÍCIO03
//		Scanner sc11 = new Scanner (System.in);
//		
//		int alcool = 0;
//		int gasolina = 0;
//		int diesel = 0;
//		int combustivel = sc11.nextInt();
//		
//		while (combustivel != 4) {
//			if (combustivel == 1) {
//				alcool += 1;
//			}
//			else if (combustivel == 2) {
//				gasolina += 1;
//			}
//			else if (combustivel == 3) {
//				diesel += 1;
//			}
//			combustivel = sc11.nextInt();
//		}
//		
//		System.out.println("MUITO OBRIGADO");
//		System.out.println("Álcool: " + alcool);
//		System.out.println("Gasolina: " + gasolina);
//		System.out.println("Diesel: " + diesel);
//		
//		sc11.close();
		
		
		//EXERCÍCIO01 (FOR)
		
		Scanner sc12 = new Scanner (System.in);
		
		int x = sc12.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc12.nextInt();
	}
}
