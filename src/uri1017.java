
import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempo, velocidade, distancia;
		double quantidadeLitros;

		tempo = sc.nextInt();
		velocidade = sc.nextInt();

		quantidadeLitros = tempo * velocidade / 12.0;

		System.out.printf("%.3f%n", quantidadeLitros);

		sc.close();

	}

}