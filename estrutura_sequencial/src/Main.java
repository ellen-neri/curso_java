import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//Saída de dados
		System.out.print("Hello World!");
		System.out.println("Hello World!");
		System.out.println();
		
		
		//Exercício
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $ ", product1, price1);
		System.out.printf("%s, wich price is $ %.2f%n", product2, price2);
		System.out.println();
		//System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		System.out.println();
		
		
		//Casting
		int a, b;
		a = 5;
		b = 2 * a;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		int c;
		double d;
		c = 5;
		d = 2 * a;
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		
		double e, f, g, area;
		e = 6.0;
		f = 8.0;
		g = 5.0;
		area = (e + f) / 2.0 * g;
		System.out.println(area);
		System.out.println();
		
		float h, i, j, area2;
		h = 6f;
		i = 8f;
		j = 5f;
		area2 = (h + i) / 2f * j;
		System.out.println(area2);
		System.out.println();
		
		int k, l;
		double resultado;
		k = 5;
		l = 2;
		resultado = (double) k / l;
		System.out.println(resultado);
		System.out.println();
		
		double m;
		int n;
		m = 5.0;
		n = (int) m;
		System.out.println(n);

	}
}