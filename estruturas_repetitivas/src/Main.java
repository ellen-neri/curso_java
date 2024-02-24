import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
	
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
	
		System.out  .printf("ÁREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", preco);
	
		sc.close();
		
		
      Scanner sc1 = new Scanner(System.in);

      int x = sc1.nextInt();

      while (x != 0) {
          x = sc1.nextInt();
      }

      sc1.close();


      Scanner sc2 = new Scanner(System.in);

      int x1 = sc2.nextInt();
      int soma = 0;

      while (x1 != 0) {
          soma += x1;
          x1 = sc2.nextInt();
      }

      System.out.println(soma);

      sc2.close();
		
		
		//TESTE DE MESA COM WHILE
		Scanner sc3 = new Scanner(System.in);
		
		int x2 = sc3.nextInt();
		int y = sc3.nextInt();
		
		while (x2 > 2) {
			System.out.print(x2);
			y = y + x2;
			x2 = x2 - 1;
		}
		
		sc3.close();
		
		
		Scanner sc4 = new Scanner(System.in);
		
		int x3 = sc4.nextInt();
		int y1 = sc4.nextInt();
		
		while (x3 <60) {
			System.out.println(x3);
			x3 = x3 * 2;
			y1 = y1 + 10;
		}
		
		sc4.close();
		
		
		Scanner sc5 = new Scanner(System.in);
		
		double x4 = sc5.nextDouble();
		double y2 = sc5.nextDouble();
		
		while (x4 != y2) {
			System.out.print("olha");
			x4 = Math.sqrt(y2);
		}
		
		sc5.close();
		
		
		Scanner sc6 = new Scanner(System.in);
		
		int x5 = sc6.nextInt();
		int y3;
		
		while (x5 < 5) {
			y3 = x5 * 3;
			System.out.print(y3);
			x5 = x5 + 1;
		}
		
		System.out.println("Fim");
		
		sc6.close();
		
		
		Scanner sc7 = new Scanner(System.in);
		
		int x6 = sc7.nextInt();
		int y4 = sc7.nextInt();
		
		System.out.println("Olá");
		
		while (x6 < y4) {
			System.out.println(x6 + "-" + y4);
			x6 = x6 * 2;
			y4 = y4 + 1;
		}
		
		sc7.close();
		
		
		Scanner sc8 = new Scanner(System.in);
		
		int x7 = sc8.nextInt();
		int y5 = sc8.nextInt();
		int i = sc8.nextInt();
		
		while (i < x7) {
			i = i + 1;
			y5 = y5 + i;
			System.out.print(i);
			System.out.println(y5);
		}
		
		sc8.close();
		
		
		//EXERCÍCIO01
		Scanner sc9 = new Scanner(System.in);
		
		int senha = sc9.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			senha = sc9.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc9.close();
		
		
		//EXERCÍCIO02
		import java.util.Scanner;

		public class uri1115 {

			public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int x = sc.nextInt();
				int y = sc.nextInt();
				
				while (x != 0 && y != 0) {
					if (x > 0 && y > 0) {
						System.out.println("primeiro");
					}
					else if (x < 0 && y > 0) {
						System.out.println("segundo");
					}
					else if (x < 0 && y < 0) {
						System.out.println("terceiro");
					}
					else {
						System.out.println("quarto");
					}
					x = sc.nextInt();
					y = sc.nextInt();
				}
				
				sc.close();
			}
		}
	}
}
