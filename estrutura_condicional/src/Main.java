import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double conta = 50.00;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
		
		
		//IF-ELSE
		Scanner sc1 = new Scanner(System.in);
		
		int entrada = sc1.nextInt();
		String dia;
		
		if (entrada == 1) {
			dia = "domingo";
		}
		else if (entrada == 2) {
			dia = "segunda-feira";
		}
		else if (entrada == 3) {
			dia = "terça-feira";
		}
		else if (entrada == 4) {
			dia = "quarta-feira";
		}
		else if (entrada == 5) {
			dia = "quinta-feira";
		}
		else if (entrada == 6) {
			dia = "sexta-feira";
		}
		else if (entrada == 7) {
			dia = "sábado";
		}
		else {
			dia = "valor inválido";
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc1.close();
		
		
		//SWITCH
		Scanner sc2 = new Scanner(System.in);
		
		int entrada1 = sc2.nextInt();
		String dia1;
		
		switch (entrada1) {
			case 1:
				dia1 = "domingo";
				break;
			case 2:
				dia1 = "segunda-feira";
				break;
			case 3:
				dia1 = "terça-feira";
				break;
			case 4:
				dia1 = "quarta-feira";
				break;
			case 5:
				dia1 = "quinta-feira";
				break;
			case 6:
				dia1 = "sexta-feira";
				break;
			case 7:
				dia1 = "sábado";
				break;
			default:
				dia1 = "valor inválido";
				break;
			}
		
		System.out.println("Dia da semana: " + dia1);
		sc2.close();
		
		
		//EXERCÍCIO01
		Scanner sc3 = new Scanner(System.in);
		
		int entrada2 = sc3.nextInt();
		String numero = null;
		
		if (entrada2 >= 0) {
			numero = "POSITIVO";
		}
		else if (entrada2 < 0) {
			numero = "NEGATIVO";
		}
		
		System.out.println(numero);
		
		sc3.close();
		
		
		//EXERCÍCIO02
		Scanner sc4 = new Scanner(System.in);
		
		int entrada3 = sc4.nextInt();
		
		if (entrada3 % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		
		sc4.close();
		
		
		//EXERCÍCIO03
		Scanner sc5 = new Scanner(System.in);
		
		int A = sc5.nextInt();
		int B = sc5.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}
		
		sc5.close();
		
		
		//EXERCÍCIO04
		Scanner sc6 = new Scanner(System.in);
		
		int horaInicial = sc6.nextInt();
		int horaFinal = sc6.nextInt();
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc6.close();
		
		
		//EXERCÍCIO05
		Locale.setDefault(Locale.US);
		Scanner sc7 = new Scanner(System.in);
		
		int codigo = sc7.nextInt();
		int quantidade = sc7.nextInt();
		double pagamento = 0;
		
		if (codigo == 1) {
			pagamento = quantidade * 4.00;
		}
		else if (codigo == 2) {
			pagamento = quantidade * 4.50;
		}
		else if (codigo == 3) {
			pagamento = quantidade * 5.00;
		}
		else if (codigo == 4) {
			pagamento = quantidade * 2.00;
		}
		else if (codigo == 5) {
			pagamento = quantidade * 1.50;
		}
		
		System.out.printf("TOTAL = R$ %.2f%n", pagamento);
		
		sc7.close();
		
		
		//EXERCÍCIO06
		Locale.setDefault(Locale.US);
		Scanner sc8 = new Scanner(System.in);
		
		double numero1 = sc8.nextDouble();
		
		if (numero1 < 0.00 || numero1 > 100.00) {
			System.out.println("FORA DE INTERVALO");
		}
		else if (numero1 <= 25.00) {
			System.out.println("INTERVALO [0,25]");
		}
		else if (numero1 <= 50.00) {
			System.out.println("INTERVALO (25,50]");
		}
		else if (numero1 <= 75.00) {
			System.out.println("INTERVALO (50,75]");
		}
		else if (numero1 <= 100.00) {
			System.out.println("INTERVALO (75,100]");
		}
		
		sc8.close();
		
		
		//EXERCÍCIO07
		Locale.setDefault(Locale.US);
		Scanner sc9 = new Scanner(System.in);
		
		double x = sc9.nextDouble();
		double y = sc9.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("ORIGEM");	
		}
		else if (x == 0.0) {
			System.out.println("EIXO Y");
		}
		else if (y == 0.0) {
			System.out.println("EIXO X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}
		
		sc9.close();
		
		
		//EXERCÍCIO08
		Locale.setDefault(Locale.US);
		Scanner sc10 = new Scanner(System.in);
		
		double salario = sc10.nextDouble();
		double imposto = 0;
		
		if (salario <= 2000.00) {
			imposto = 0.0;
		}
		else if (salario > 2000.00 || salario <= 3000.00) {
			imposto = salario * 0.08;
		}
		else if (salario >= 3000.01 || salario <= 4500.00) {
			imposto = salario * 0.18;
		}
		else if (salario > 4500.00) {
			imposto = salario * 0.28;
		}
		
		System.out.printf("IMPOSTO = R$ %.2f%n", imposto);
		
		sc10.close();

	}
}