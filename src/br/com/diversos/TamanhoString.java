package br.com.diversos;

public class TamanhoString {

	final static String delimitador = "%";

	public static void main(String[] args) {
		String userInforme = "lnsdlkclkdk";
		TamanhoString ts = new TamanhoString();
		System.out.println("tamanho ==> " + ts.getLengthOfString(userInforme));
		System.out.println("tamanhoII ==> " + ts.getLengthOfStringWithCharArray(userInforme));		
	}

	public static int getLengthOfString(String str) {
		int i = 0;
		try {
			for (i = 0;; i++) {
				str.charAt(i);
			}

		} catch (Exception e) {

		}
		return i;
	}

	public static int getLengthOfStringWithCharArray(String str) {
		int length = 0;
		char[] strCharArray = str.toCharArray();
		for (char c : strCharArray) {
			length++;
		}
		return length;
	}

	public int getSizeString(String s) {
		int i = 0;
		if (s == null)
			return i;

		do {
			s.charAt(i);
			i++;
		} while (!String.valueOf(s.charAt(i)).equals(delimitador));
		return i;
	}

}
