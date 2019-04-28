package packung;

import java.util.Scanner;

public class RömischeZahlen {

	public static void main(String[] args) {
		int input = 0;
		Scanner in = new Scanner(System.in);
		// Alle römischen Ziffern
		String[] römischeZahlen = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		// Deren Dezimalzahl Repräsentanten
		int[] dezimalZahlen = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String konvertierteZahl = "";
		int vorherigerIndex = -1;
		do {
			System.out.println("Bei Eingabe der 0 beendet das Program.");
			System.out.println("Bitte Zahl zwischen 0 und 3999 eingeben:");
			input = in.nextInt();
			int zahl = input;
			int zähler = 1;
			while (zahl > 0 && zähler <= 3) {
				int index = 0;
				while (dezimalZahlen[index] > zahl) {
					index++;
				}
				// Auf gleiche Römische Zahl hintereinander prüfen
				if (index == vorherigerIndex) {
					zähler++;
				} else {
					zähler = 1;
				}
				// Bei 3 gleichen römischen Zahlen hintereinander ist die Zahl zu hoch.
				if (zähler <= 3) {
					zahl -= dezimalZahlen[index];
					konvertierteZahl += römischeZahlen[index];
					vorherigerIndex = index;
				}
			}
			if (input == 0)
				System.out.println("Ende.");
			else if (zahl > 0) {
				System.out.println("Zahl zu hoch!");
			} else {
				System.out.println("Konvertierte Zahl: " + konvertierteZahl);
			}
		} while (input != 0);
		in.close();
	}
}