package packung;

import java.util.Scanner;

public class PrimzahlenAusleser {
	public static void main(String[] args) {
		// Variablen Deklarieren
		int zahl = 0;
		boolean isPrime;

		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Beendet mit Eingabe von 0");
			System.out.println("Bitte geben sie eine Zahl gr��er als 1 ein:");
			zahl = in.nextInt();
			
			// Pr�ft welche der Zahlen von 2 bis zur eingegebenen Zahl, Primzahlen sind und gibt diese aus
			for (int z�hler = 2; z�hler <= zahl; ++z�hler) {
				isPrime = true;
				int teiler = 2;
				// Pr�ft die Teilbarkeit ohne Rest von 2 bis zur Quadratwurzel des Z�hlers
				while (teiler <= Math.sqrt(z�hler) && isPrime) {
					if (z�hler % teiler == 0) {
						isPrime = false;
					}
					++teiler;
				}
				if (isPrime) {
					System.out.println(z�hler);
				}
			}
		} while (zahl != 0);
		in.close();
		System.out.println("Ende");
	}
}
