package packung;

import java.util.Scanner;

public class Crypter {

	public static void main(String[] args) {
		String input;

		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Beendet mit Eingabe von 0");
			System.out.println("Bitte geben sie eine Zeichenkette ein:");
			input = in.nextLine();
			// Iteriert durch die Zeichenkette und gibt die n‰chste Ascii-Stelle der Groﬂ- und Kleinbuchstaben dieser aus. 'Z' und 'z' wird zu 'A' bzw. 'a'.
			for (int index = 0; index < input.length(); ++index) {
				if ((input.charAt(index) >= 'A' && input.charAt(index) <= 'Z')
						|| (input.charAt(index) >= 'a' && input.charAt(index) <= 'z')) {
					if (input.charAt(index) == 'Z' || input.charAt(index) == 'z')
						System.out.print((char) ((int) (input.charAt(index) - ('Z' - 'A'))));
					else
						System.out.print((char) ((int) (input.charAt(index) + 1)));
				} else
					System.out.print(input.charAt(index));
			}
			System.out.println();
		}while(input.charAt(0) != '0');
		System.out.println("Ende");
		in.close();
	}

}
