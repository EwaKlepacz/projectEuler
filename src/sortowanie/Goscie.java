package sortowanie;

import dalejjj.Human;

public class Goscie extends Human {
	private int cena;
	private boolean potwierdzenie;
	private boolean nocleg;
	private boolean obecność;

	public Goscie(String imię, int wiek, int cena, boolean potwierdzenie, boolean nocleg, boolean obecność) {
		this.imię = imię;
		this.wiek = wiek;
		this.cena = getCena(wiek);
		this.potwierdzenie = potwierdzenie;
		this.nocleg = nocleg;
		this.setObecność(obecność);
	}


	void setCena(int wiek) {
		// if (wiek <= 3) {
		// cena = 0;
		// if (wiek <= 10) {
		// cena = 100;
		// }
		// } else {
		// cena = 165;
		// }

	}

	void setPotwierdzenie(boolean czyPotwiedził) {
		potwierdzenie = czyPotwiedził;
	}

	void setNocleg(boolean czyNocuje) {
		nocleg = czyNocuje;
	}

	int getCena(int wiek) {
		if (wiek <= 3)  {
			cena = 0;
		}
		else if (wiek >= 4 && wiek <= 10) {
			cena = 100;
		}
		else  {
			cena = 165;
		}
		return cena;

	}

	boolean getPotwierdzenie() {
		return potwierdzenie;
	}

	boolean getNocleg() {
		return nocleg;
	}

	public boolean isObecność() {
		return obecność;
	}

	public void setObecność(boolean obecność) {
		this.obecność = obecność;
	}
}
