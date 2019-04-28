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
			System.out.println("Bitte geben sie eine Zahl größer als 1 ein:");
			zahl = in.nextInt();
			
			// Prüft welche der Zahlen von 2 bis zur eingegebenen Zahl, Primzahlen sind und gibt diese aus
			for (int zähler = 2; zähler <= zahl; ++zähler) {
				isPrime = true;
				int teiler = 2;
				// Prüft die Teilbarkeit ohne Rest von 2 bis zur Quadratwurzel des Zählers
				while (teiler <= Math.sqrt(zähler) && isPrime) {
					if (zähler % teiler == 0) {
						isPrime = false;
					}
					++teiler;
				}
				if (isPrime) {
					System.out.println(zähler);
				}
			}
		} while (zahl != 0);
		in.close();
		System.out.println("Ende");
	}
}
