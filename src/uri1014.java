
import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;
		double y, total;

		x = sc.nextInt();
		y = sc.nextDouble();

		total = x / y;

		System.out.printf("%.3f km/l%n", total);

		sc.close();

	}

}