package klondike.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {

	static private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
			System.in));

	static public String readString(String title) {
		String input = null;
		boolean ok = false;
		do {
			write(title);
			try {
				input = bufferedReader.readLine();
				ok = true;
			} catch (Exception ex) {
				writeError("de cadena de caracteres");
			}
		} while (!ok);
		return input;
	}

	static public int readInt(String title) {
		int input = 0;
		boolean ok = false;
		do {
			try {
				input = Integer.parseInt(readString(title));
				ok = true;
			} catch (Exception ex) {
				writeError("entero");
			}
		} while (!ok);
		return input;
	}

	static public char readChar(String title) {
		char charValue = ' ';
		boolean ok = false;
		do {
			String input = readString(title);
			if (input.length() != 1) {
				writeError("caracter");
			} else {
				charValue = input.charAt(0);
				ok = true;
			}
		} while (!ok);
		return charValue;
	}

	static public void writeln() {
		System.out.println();
	}

	static public void write(String string) {
		System.out.print(string);
	}

	static public void writeln(String string) {
		System.out.println(string);
	}

	static private void writeError(String formato) {
		System.out.println("ERROR!!! La opcion debe ser entre 1 y 9 inclusives");
	}
}
