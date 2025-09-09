
import java.util.Locale;
import java.util.Scanner;

public class uri1002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n = 3.14159;
		double raio, area, elevadoQuadrado;

		raio = sc.nextDouble();
		elevadoQuadrado = Math.pow(raio, 2);
		area = n * elevadoQuadrado;

		System.out.printf("A=%.4f%n", area);

	}

}