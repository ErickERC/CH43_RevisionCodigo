import java.util.Scanner;

public class Codigo5 {
	// Crear metodo main
	public static void main(String[] args) {
		// System.in para recivir entradas por consola
		Scanner s = new Scanner(System.in);
		// '' char "" String
		System.out.print("Introduzca un número: ");
		String ni = s.nextLine();
		// Parse ni a entero -> c
		int c = Integer.parseInt(ni);

		int afo = 0;
		int noAfo = 0;

		// Todas las ni por c, ya que c es el parseInt de ni
		while (c > 0) {
			int digito = (c % 10);
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;
				c /= 10;
			}

			if (afo > noAfo) {
				// println -> println
				System.out.println("El " + c + " es un número afortunado.");
			} else {
				System.out.println("El " + c + " no es un número afortunado.");
			}
		}
		// Cerrar el scanner
		s.close();
	}
}