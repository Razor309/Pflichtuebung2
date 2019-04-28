package packung;

import java.util.Scanner;

public class SiebDesEratosthenes {

	public static void main(String[] args) {
		int n = 0;
		int index1 = 0;
		int index2 = 0;
		System.out.println("Willkommen beim Sieb des Eratosthenes.");
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Bitte geben sie eine Zahl größer als 0 ein:");
			System.out.println("Bei 0 beendet das Programm.");
			n = in.nextInt();
			if (n > 0) {
				int[] zahlenArray = new int[n - 1];
				
				// Array zahlenArray die Werte 2 bis n zuweisen
				for (int index = 0; index < zahlenArray.length; ++index) {
					zahlenArray[index] = index + 2;
				}
				
				while (index1 < n >> 1) {
					index2 = index1 + 1;
					while (index2 < zahlenArray.length && zahlenArray[index1] != 0) {
						if (zahlenArray[index2] != 0 && zahlenArray[index2] % zahlenArray[index1] == 0) {
							zahlenArray[index2] = 0;
						}
						++index2;
					}
					++index1;
				}

				for (int index = 0; index < zahlenArray.length; ++index) {
					System.out.println(zahlenArray[index]);
				}
			}
		} while (n != 0);
		in.close();
		System.out.println("Ende");
	}

}
