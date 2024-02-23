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
		
		
//        Scanner sc1 = new Scanner(System.in);
//
//        int x = sc1.nextInt();
//
//        while (x != 0) {
//             x = sc1.nextInt();
//        }
//
//        sc1.close();


        Scanner sc2 = new Scanner(System.in);

        int x1 = sc2.nextInt();
        int soma = 0;

        while (x1 != 0) {
            soma += x1;
            x1 = sc2.nextInt();
        }

        System.out.println(soma);

        sc2.close();
		
	}

}
