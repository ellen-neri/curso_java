import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//SCANNER
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		sc.close();
		
		
		Scanner sc1 = new Scanner(System.in);
		int y;
		y = sc1.nextInt();
		System.out.println("Você digitou: " + y);
		sc1.close();
		
		
		Locale.setDefault(Locale.US);
		Scanner sc2 = new Scanner(System.in);
		double z;
		z = sc2.nextDouble();
		System.out.printf("Você digitou: " + z);
		sc2.close();
		
		
		Scanner sc3 = new Scanner(System.in);
		char x1;
		x1 = sc3.next().charAt(0);
		System.out.println("Você digitou: " + x1);
		sc3.close();
		
		
		Scanner sc4 = new Scanner(System.in);
		int x2;
		String s1, s2, s3;
		x2 = sc4.nextInt();
		sc4.nextLine();
		s1 = sc4.nextLine();
		s2 = sc4.nextLine();
		s3 = sc4.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc4.close();
		
		
		//FUNÇÕES MATEMÁTICAS
		double x3 = 3.0;
		double y1 = 4.0;
		double z1 = -5.0;
		double A, B, C;
		A = Math.sqrt(x3);
		B = Math.sqrt(y1);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x3 + " = " + A);
		System.out.println("Raiz quadrada de " + y1 + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		A = Math.pow(x3, y1);
		B = Math.pow(x3, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x3 + " elevado a " + y1 + " = " + A);
		System.out.println(x3 + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y1);
		B = Math.abs(z1);
		System.out.println("Valor absoluto de " + y1 + " = " + A);
		System.out.println("Valor absoluto de " + z1 + " = " + B);
		
		
		//EXERCÍCIO1
		Locale.setDefault(Locale.US);
		Scanner sc5 = new Scanner(System.in);
		
		double largura = sc5.nextDouble();
		double comprimento = sc5.nextDouble();
		double metroQuadrado = sc5.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("ÁREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", preco);
		
		sc5.close();
		
		
		//EXERCÍCIO2
		Scanner sc6 = new Scanner(System.in);
		
		int entrada1 = sc6.nextInt();
		int entrada2 = sc6.nextInt();
		int soma = entrada1 + entrada2;
		
		System.out.println("SOMA = " + soma);
		
		sc6.close();
		
		
		//EXERCÍCIO3
		Locale.setDefault(Locale.US);
		Scanner sc7 = new Scanner(System.in);
		
		double raio = sc7.nextDouble();
		double pi = 3.14159;
		double area1 = pi * raio * raio;
		
		System.out.printf("A = %.4f%n", area1);
		
		sc7.close();
		
		
		//EXERCÍCIO04
		Scanner sc8 = new Scanner(System.in);
		
		int A1 = sc8.nextInt();
		int B1 = sc8.nextInt();
		int C1 = sc8.nextInt();
		int D = sc8.nextInt();
		int diferenca = A1 * B1 - C1 * D;
		
		System.out.println("DIFERENÇA = " + diferenca);
		
		sc8.close();
		
		
		//EXERCÍCIO05
		Locale.setDefault(Locale.US);
		Scanner sc9 = new Scanner(System.in);
		
		int numeroFuncionario = sc9.nextInt();
		double horasTrabalhadas = sc9.nextDouble();
		double salarioHora = sc9.nextDouble();
		double salario = horasTrabalhadas * salarioHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc9.close();
		
		
		//EXERCÍCIO06
		Locale.setDefault(Locale.US);
		Scanner sc10 = new Scanner(System.in);
		
		int codigoPeca1 = sc10.nextInt();
		int numeroPeca1 = sc10.nextInt();
		double valorPeca1 = sc10.nextDouble();
		int codigoPeca2 = sc10.nextInt();
		int numeroPeca2 = sc10.nextInt();
		double valorPeca2 = sc10.nextDouble();
		double pagar = numeroPeca1 * valorPeca1 + numeroPeca2 * valorPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagar);
		
		sc10.close();
		
		
		//EXERCÍCIO07
		Locale.setDefault(Locale.US);
		Scanner sc11 = new Scanner(System.in);
		
		double A2 = sc11.nextDouble();
		double B2 = sc11.nextDouble();
		double C2 = sc11.nextDouble();
		double pi1 = 3.14159;
		double areaTriangulo = A2 * C2 / 2.0;
		double areaCirculo = pi1 * C2 * C2;
		double areaTrapezio = (A2 + B2) * C2 / 2.0;
		double areaQuadrado = B2 * B2;
		double areaRetangulo = A2 * B2;
		
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CÍRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPÉZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETÂNGULO: %.3f%n", areaRetangulo);
		
		sc11.close();
		
	}

}
