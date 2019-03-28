package projectEuler;

import java.math.BigInteger;

public class zadanieTrzecie {

	public static void main(String[] args) {
//		System.out.println((czyJestLiczbaPierwsza(new BigInteger("24"))));
		wyswietlPodzielniki(24);

	}

	public static boolean czyJestLiczbaPierwsza(BigInteger liczba) {

		boolean result = false;
		BigInteger limit = liczba.divide(new BigInteger("2"));
		BigInteger i = new BigInteger("2");
		for (; i.compareTo(limit) <= -1; i.add(BigInteger.ONE)) {
			if (liczba.remainder(i).equals(0)) {
				return result;
			}
		}
		return true;
	}

	public static void wyswietlPodzielniki(int liczba) {
		int i = 1;
		for (i = 1; i <= liczba; i++) {
			if (liczba % i == 0) {
				System.out.println(i + "");
			}
		}
	}
}