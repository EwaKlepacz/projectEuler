package projectEuler;

public class zadaniePierwsze {

	public static void main(String[] args) {
		int[] liczbyPodzielnePrzez3i5 = new int[466];
		int id = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 5 == 0 || i % 3 == 0) {
				liczbyPodzielnePrzez3i5[id] = i;
				id++;// wyciagnełam liczbę liczb spełniających cechy podzielnosci

			}

		}
		System.out.println(id);

		System.out.println(wyświetlLiczby(liczbyPodzielnePrzez3i5));

		System.out.println(sumaLiczbTablicy(liczbyPodzielnePrzez3i5));
	}

	public static String wyświetlLiczby(int[] liczby) { //tworzę metodę która wyświetli liczby
		String s = "";
		for (int i = 0; i < liczby.length; i++) {
						s += liczby[i] + ",";
						}
				return s;
	}

	public static int sumaLiczbTablicy(int[] liczby) { //metoda która sumuje liczby z tablicy
		int suma = 0;
		for (int i = 0; i < liczby.length; i++) {
			suma += liczby[i];
		}
		return suma;
	}
}
