import java.util.Scanner;

// codigo6 -> Codigo6 asi se llama el archivo
public class Codigo6 {
	//Cración de un método main 
	  public static void main(String[] args) {
		// new int[] creacion de arreglo
		int[] n = new int[20];

		// Agrear un scaner
		Scanner scan = new Scanner(System.in);

	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }
	    
		// Agregar ln a pritn para salto de linea
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		// Preferimos usar mejor un Scannner
	    int opcion = scan.nextInt();

		// Cambio de lugar de ? :, descripción básica de la creación de un if terciario
	    int multiplo = (opcion == 1) ? 5 : 7;

		// char -> int
	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
			// Cerrar if con una } antes del else
		  } else {
			// Cambiar in por un out
	        System.out.print(e + " ");
	      }
	    }
		scan.close();
	  }
	}