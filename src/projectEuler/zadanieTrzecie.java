package projectEuler;

public class zadanieTrzecie {

	public static void main(String[] args) {
		System.out.println((czyJestLiczbaPierwsza(24)));
		wyswietlPodzielniki(24);

	}

	public static boolean czyJestLiczbaPierwsza(int liczba) {

		boolean result = false;
		double limit = Math.sqrt(liczba);
		int i;
		for (i = 2; i <= limit; i++) {
			if (liczba % i == 0) {
				return result;
			}
		}
		return true;
	}

	public static void wyswietlPodzielniki(int liczba) {
		int i;
		for (i = 1; i <= liczba; i++)
			;
		if (liczba % i == 0) {
			System.out.println(i + "");

		}
	}
}