package projectEuler;

import java.math.BigInteger;

public class zadanieDrugie {

	public static void main(String[] args) {
		System.out.println(zadanieDrugie.ciągFibonnacciego(4000000));
	}

	public static BigInteger ciągFibonnacciego(long limit) {
		BigInteger suma = new BigInteger("2");
		long fibNr = 0;// element ciągu fibonacciego
		long first = 1;
		long second = 2;

		while (fibNr < limit) {
			// znajdz kolejny wyraz ciagu
			fibNr = first + second;
			first = second;
			second = fibNr;

			// sprawdz czy parzysty
			// dodaj do sumy
			if (fibNr % 2 == 0 && fibNr < limit) {
				suma = suma.add(new BigInteger("" + fibNr));
			}
		}
		return suma;
	}
}
