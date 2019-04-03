package projectEuler;

public class zadanieSzóste {

	public static void main(String[] args) {
		int sumaKwadratów = 0;
		int sumaLiczb = 0;
		int kwadratSumy = 0;
		
			for (int i = 1; i <= 100; i++) {
				sumaLiczb = sumaLiczb + i;
				sumaKwadratów = sumaKwadratów + i*i;
				kwadratSumy = sumaLiczb*sumaLiczb;
				}

		System.out.println(sumaLiczb);
		System.out.println(sumaKwadratów);
		System.out.println(kwadratSumy);
		System.out.println(kwadratSumy - sumaKwadratów);
}
}
