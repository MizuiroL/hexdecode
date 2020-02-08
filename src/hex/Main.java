package hex;

public class Main {
	public static void main(String[] args) {
		System.out.println(decodifica("str"));
	}

	public static String decodifica(String stringaIniziale) {
		String stringaFinale = "";
		for (int i = 0; i < stringaIniziale.length(); i = i + 2) {
			String hex = stringaIniziale.substring(i, i + 2);
			char ascii = (char) Integer.parseInt(hex, 16);
			stringaFinale += ascii;
		}
		return stringaFinale;
	}
}
