package sortowanie;

import java.util.Arrays;
import java.util.List;

public class Sortowanie {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);
		System.out.println(bubleSort(list));
	}

	public static List<Integer> bubleSort(List<Integer> listaBąbelkowa) {
		for (int a = 0; a <= listaBąbelkowa.size(); a++) {
			for (int el = 0; el < listaBąbelkowa.size() - 1; el++) {
				if (listaBąbelkowa.get(el) > listaBąbelkowa.get(el + 1)) {
					int temp = listaBąbelkowa.get(el);
					listaBąbelkowa.set(el, listaBąbelkowa.get(el + 1));
					listaBąbelkowa.set(el + 1, temp);
				}
			}
		}
		return listaBąbelkowa;

	}

}
