package sortowanie;

import java.util.LinkedList;
import java.util.List;

public class ListaGości {

	public static void main(String[] args) {
		Goscie ewa = new Goscie("Ewa Klepacz", 31, 31, true, true, true);
		Goscie pawel = new Goscie("Paweł Banach", 32, 32, true, true, true);
		Goscie mama = new Goscie("Elżbieta Klepacz", 65, 65, true, true, true);
		Goscie tata = new Goscie("Marek Klepacz", 58, 58, true, true, true);
		Goscie babcia = new Goscie("Jolanta Hejduk", 88, 88, true, true, true);
		Goscie chrzesna = new Goscie("Krystyna Godala", 65, 65, true, false, true);
		Goscie kuzyn1 = new Goscie("Krzysztof Godala", 37, 37, true, false, true);
		Goscie zonakuzyna1 = new Goscie("Ewelina Godala", 35, 35, true, false, true);
		Goscie dziecko1 = new Goscie("Paweł Godala", 5, 5, true, false, true);
		Goscie dziecko2 = new Goscie("Przemysław Godala", 3, 3, true, false, true);
		Goscie kuzyn2 = new Goscie("Bartłomiej Godala", 43, 43, true, false, true);
		Goscie zonakuzyna2 = new Goscie("Anna Godala", 40, 40, true, false, true);
		Goscie dziecko3 = new Goscie("Maciej Godala", 10, 10, true, false, true);
		Goscie dziecko4 = new Goscie("Olga Godala", 4, 4, true, false, true);
		Goscie ciocia1 = new Goscie("Jadwiga Stępień", 158, 60, true, false, true);
		Goscie wujek1 = new Goscie("Marek Stępień", 58, 58, true, false, true);
		Goscie kuzyn3 = new Goscie("Tomasz Stępień", 33, 33, true, false, true);
		Goscie ostow1 = new Goscie("Os.Tow.Tomasz.Stepień", 34, 34, false, false, false);
		Goscie kuzyn4 = new Goscie("Przemysław Stępień", 31, 31, true, false, true);
		Goscie zonakuzyna4 = new Goscie("Magdalena sStępień", 30, 30, true, false, true);
		Goscie dziecko5 = new Goscie("Wojciech Stępień", 4, 4, true, false, false);
		Goscie dziecko6 = new Goscie("Marcelina Stępień", 0, 0, true, false, false);
		Goscie ciocia2 = new Goscie("Henryka Grzywacz", 73, 73, true, false, true);
		Goscie kuzynka1 = new Goscie("Kamila Grzywacz-Włodarczyk", 44, 44, true, false, true);
		Goscie mazkuzynki1 = new Goscie("Piotr Włodarczyk", 45, 45, true, false, true);
		Goscie dziecko7 = new Goscie("Julianna Włodarczyk", 10, 10, true, false, true);
		Goscie ciocia3 = new Goscie("Edyta Caban", 45, 45, true, false, true);
		Goscie wujek2 = new Goscie("Dariusz Caban", 47, 47, true, false, true);
		Goscie kuzyn5 = new Goscie("Piotr Caban", 23, 23, true, false, true);
		Goscie ostow2 = new Goscie("Natalia Caban", 23, 23, true, false, true);
		Goscie kuzynka2 = new Goscie("Angelika Budner", 27, 27, true, false, true);
		Goscie mazkuzynki2 = new Goscie("Łukasz Budner", 28, 28, true, false, true);
		Goscie chrzesnica = new Goscie("Anastazja Caban", 8, 8, true, false, true);
		Goscie wujek3 = new Goscie("Piotr Włodarski", 62, 62, true, false, true);
		Goscie wujek4 = new Goscie("Andrzej Dobiecki", 64, 64, true, false, true);
		Goscie ciocia4 = new Goscie("Irena Skiba", 78, 78, false, false, false);
		Goscie kuzynka3 = new Goscie("Magdalena Soyta", 25, 25, false, true, false);
		Goscie ostow3 = new Goscie("Kamil Piątek", 25, 25, false, true, false);
		Goscie chrzesny = new Goscie("Sławomir Soyta", 58, 58, false, true, false);
		Goscie zonachrzesnego = new Goscie("Anna Soyta", 58, 58, false, true, false);
		Goscie wujek5 = new Goscie("Andrzej Soyta", 71, 71, true, false, true);
		Goscie ciocia5 = new Goscie("Lidia Soyta", 57, 57, true, false, true);
		Goscie kuzyn6 = new Goscie("Dariusz Soyta", 33, 33, true, true, true);
		Goscie zonakuzyna3 = new Goscie("Bernadette Soyta", 33, 33, true, true, true);
		Goscie dziecko8 = new Goscie("Marek Soyta", 3, 3, true, true, true);
		Goscie dziecko9 = new Goscie("Eliza Soyta", 1, 1, true, true, true);
		Goscie ciocia6 = new Goscie("Anna Niewiadomska", 77, 77, false, false, false);
		Goscie kuzynka4 = new Goscie("Milena Małagocka", 33, 33, false, false, false);
		Goscie mazkuzynki3 = new Goscie("Marcin Małagocki", 33, 33, false, false, false);
		Goscie dziecko10 = new Goscie("Miłosz Małagocki", 4, 4, false, false, false);
		Goscie ciocia7 = new Goscie("Danuta Jeż", 67, 67, true, false, true);
		Goscie wujek6 = new Goscie("Ryszard Jeż", 70, 70, true, true, true);
		Goscie kuzynka5 = new Goscie("Honorata Jeż", 43, 43, true, false, true);
		Goscie ostow4 = new Goscie("Os Tow Hon", 43, 43, false, false, false);
		Goscie kuzynka6 = new Goscie("Aneta Lenarczyk", 40, 40, true, false, true);
		Goscie mazkuzynki4 = new Goscie("Janusz Lenarczyk", 45, 45, true, false, true);
		Goscie dziecko11 = new Goscie("Michał Lenarczyk", 13, 13, true, false, true);
		Goscie dziecko12 = new Goscie("Agata Lenarczyk", 10, 10, true, false, true);
		Goscie kuzyn7 = new Goscie("Tomasz Jeż", 33, 33, true, false, true);
		Goscie ostow5 = new Goscie("Os Tow Tom", 33, 33, true, false, true);
		Goscie ciocia8 = new Goscie("Krystyna Szychowska", 70, 70, true, true, true);
		Goscie kuzyn8 = new Goscie("Roman Szychowski", 40, 40, true, false, true);
		Goscie ostow6 = new Goscie("Os tow Rom", 40, 40, false, false, true);
		Goscie kuzynka7 = new Goscie("Marzena Szychowska", 45, 45, true, false, true);
		Goscie ostow7 = new Goscie("Os tow Marz", 45, 45, false, false, false);
		Goscie friend1 = new Goscie("Anna Sęk", 37, 37, true, false, true);
		Goscie friend2 = new Goscie("Piotr Zieliński", 37, 37, true, false, true);
		Goscie dziecko13 = new Goscie("Monika Sęk", 12, 12, true, false, true);
		Goscie dziecko14 = new Goscie("Mariusz Sęk", 10, 10, true, true, true);
		Goscie friend3 = new Goscie("Ewelina Lechowska", 31, 31, true, false, true);
		Goscie friend4 = new Goscie("Szymon Lechowski", 31, 31, true, false, true);
		Goscie dziecko15 = new Goscie("Bartosz Lechowski", 6, 6, true, false, true);
		Goscie dziecko16 = new Goscie("Michał Lechowski", 3, 3, true, false, true);
		Goscie friend5 = new Goscie("Artur Rychter", 31, 31, false, false, false);
		Goscie friend6 = new Goscie("Danuta Rychter", 30, 30, false, false, false);
		Goscie friend7 = new Goscie("Amelia Szydłowska", 31, 31, false, false, false);
		Goscie friend8 = new Goscie("Os tow Am", 31, 31, false, false, false);
		Goscie friend9 = new Goscie("Małgorzata Wąsińska-Kałwa", 31, 31, true, true, true);
		Goscie friend10 = new Goscie("Marian Kałwa", 31, 31, true, true, true);
		Goscie friend11 = new Goscie("Przemysław Bator", 23, 23, true, false, true);
		Goscie friend12 = new Goscie("Os tom Prz", 23, 23, true, false, false);
		Goscie friend13 = new Goscie("Alicja Kielar", 29, 29, false, false, false);
		Goscie friend14 = new Goscie("Łukasz Kielar", 31, 31, false, false, false);
		Goscie friend15 = new Goscie("Renata Bator", 50, 50, true, false, false);
		Goscie friend16 = new Goscie("Zbigniew Bator", 50, 50, true, false, false);
		Goscie friend17 = new Goscie("Patryk Piórkowski", 25, 25, true, true, true);
		Goscie friend18 = new Goscie("Os Tow Pat", 25, 25, true, true, true);
		Goscie friend19 = new Goscie("Zbigniew Żeromiński", 70, 70, false, false, false);
		Goscie friend20 = new Goscie("Teresa Żeromińska", 70, 70, false, false, false);
		Goscie friend21 = new Goscie("Stanisław Dębiec", 65, 65, false, false, false);
		Goscie friend22 = new Goscie("Jadwiga Dębiec", 65, 65, false, false, false);
		Goscie friend23 = new Goscie("Magdalena Klyta", 55, 55, true, true, true);
		Goscie friend24 = new Goscie("Piotr Klyta", 55, 55, true, true, true);
		Goscie friend25 = new Goscie("Anna Stąpór", 65, 65, true, true, true);
		Goscie friend26 = new Goscie("Kazimierz Stąpór", 65, 65, true, true, true);
		Goscie friend27 = new Goscie("Katarzyna Puchalska", 32, 32, true, true, true);
		Goscie friend28 = new Goscie("Adam Puchalski", 33, 33, true, true, true);
		Goscie dziecko17 = new Goscie("Jakub Puchalski", 6, 6, true, true, true);
		Goscie dziecko18 = new Goscie("Piotr Puchalski", 3, 3, true, true, true);
		Goscie ksiadz = new Goscie("Jacek Wojciechowski", 43, 43, false, false, false);
		Goscie kuzyn9 = new Goscie("Łukasz Zimnicki", 45, 45, false, false, false);
		Goscie zonakuzyna5 = new Goscie("Magdalena Zimnicka", 43, 43, false, false, false);
		Goscie corkaKuzyna1 = new Goscie("Natalia Zimnicka", 16, 16, false, false, false);
		Goscie corkaKuzyna2 = new Goscie("Aleksandra Zimnicka", 15, 15, false, false, false);
		Goscie corkaKuzyna3 = new Goscie("Katarzyna Zimnicka", 12, 12, false, false, false);
		Goscie ostow8 = new Goscie("Os Tow", 16, 16, false, false, false);
		Goscie ostow9 = new Goscie("Os Tow", 15, 15, false, false, false);
		Goscie ostow10 = new Goscie("Os Tow", 13, 13, false, false, false);
		Goscie ciocia9 = new Goscie("Barbara Zimnicka", 67, 67, false, false, false);
		Goscie wujek7 = new Goscie("Andrzej Zimnicki", 67, 67, false, false, false);
		Goscie friend29 = new Goscie("Izabela Sabaj", 31, 31, true, false, false);
		Goscie friend30 = new Goscie("Krzysztof Sabaj", 33, 33, true, false, false);
		Goscie tesciowa = new Goscie("Hanna Banach", 57, 57, true, true, false);
		Goscie młody = new Goscie("Piotr Banach", 23, 23, true, true, true);
		Goscie ostow11 = new Goscie("Os tow Pi", 23, 23, true, true, true);
		Goscie gucha = new Goscie("Agnieszka Banach", 26, 26, true, true, true);
		Goscie szwagier = new Goscie("Mateusz Kosela", 26, 26, true, true, true);
		Goscie brat = new Goscie("Tomasz Banach", 34, 34, true, true, true);
		Goscie ostow12 = new Goscie("Os Tow Tom", 34, 34, false, false, false);
		Goscie dziecko19 = new Goscie("Stanisław Banach", 8, 8, false, false, false);
		Goscie dziecko20 = new Goscie("Remigiusz Banach", 4, 4, false, false, false);
		Goscie dziadek = new Goscie("Julian Banach", 80, 80, true, true, true);
		Goscie zonadziadka = new Goscie("Janina Banach", 77, 77, true, true, true);
		Goscie ciocia10 = new Goscie("Małgorzata Kurpiel", 60, 60, true, false, true);
		Goscie wujek8 = new Goscie("Jerzy Kurpiel", 65, 65, true, false, true);
		Goscie kuzyn10 = new Goscie("Jakub Kurpiel", 33, 33, false, false, false);
		Goscie zonakuzyna6 = new Goscie("Agnieszka Kurpiel", 32, 32, false, false, false);
		Goscie dziecko21 = new Goscie("Zofia Kurpiel", 3, 3, false, false, false);
		Goscie dziecko22 = new Goscie("XX Kurpiel", 1, 1, false, false, false);
		Goscie kuzynka8 = new Goscie("Dorota Bojarska", 24, 24, false, false, false);
		Goscie mazkuzynki5 = new Goscie("Andrzej Bojarski", 26, 26, false, false, false);
		Goscie ciocia11 = new Goscie("Krystyna Wiącek", 70, 70, true, false, true);
		Goscie wujek9 = new Goscie("Stanisław Wiącek", 72, 72, true, false, true);
		Goscie ciocia12 = new Goscie("Ewa Wiącek", 62, 62, false, false, false);
		Goscie wujek10 = new Goscie("Wiesław Wiącek", 58, 58, false, false, false);
		Goscie ciocia13 = new Goscie("Bożena Byda", 56, 56, false, false, false);
		Goscie ostow13 = new Goscie("Os Tow Bo", 56, 56, false, false, false);
		Goscie kuzyn11 = new Goscie("Piotr Byda", 25, 25, false, false, false);
		Goscie ostow14 = new Goscie("Os TO Pi", 25, 25, false, false, false);
		Goscie ciocia14 = new Goscie("Grażyna Sieńko", 58, 58, true, true, true);
		Goscie wujek11 = new Goscie("Krzysztof Sieńko", 59, 59, true, true, true);
		Goscie kuzyn12 = new Goscie("Grzegorz Sieńko", 34, 34, false, false, false);
		Goscie zonakuzyna7 = new Goscie("Eliza Sieńko", 33, 33, false, false, false);
		Goscie dziecko23 = new Goscie("XX Sieńko", 6, 6, false, false, false);
		Goscie dziecko24 = new Goscie("XXX Sieńko", 3, 3, false, false, false);
		Goscie kuzyn13 = new Goscie("Michał Sieńko", 32, 32, false, false, false);
		Goscie zonakuzyna8 = new Goscie("Barbara Sanecka-Sieńko", 31, 31, false, false, false);
		Goscie kuzynka9 = new Goscie("Jolanta Pyszniak", 26, 26, false, false, false);
		Goscie mazkuzynki6 = new Goscie("Piotr Pyszniak", 27, 27, false, false, false);
		Goscie dziecko25 = new Goscie("XX Pyszniak", 3, 3, false, false, false);
		Goscie kuzyn14 = new Goscie("Rafał Sieńko", 23, 23, false, false, false);
		Goscie ostow15 = new Goscie("Os Tow Raf", 23, 23, false, false, false);
		Goscie wujek12 = new Goscie("Lucjan Banach", 78, 78, false, false, false);
		Goscie ciocia15 = new Goscie("Hanna Banach", 78, 78, false, false, false);
		Goscie wujek13 = new Goscie("Jacek Banach", 48, 48, false, false, false);
		Goscie ostow16 = new Goscie("Os Tow. JAc", 48, 48, false, false, false);
		Goscie babcia2 = new Goscie("Krystyna Gąguł", 80, 80, false, false, false);
		Goscie wujek14 = new Goscie("Janusz Gąguł", 53, 53, false, false, false);
		Goscie ostow17 = new Goscie("Os TOw Jan", 50, 50, false, false, false);
		Goscie kuzyn15 = new Goscie("Przemysław Gąguł", 28, 28, false, false, false);
		Goscie zonakuzyna9 = new Goscie("Magdalena Gąguł", 28, 28, false, false, false);
		Goscie kuzyn16 = new Goscie("Jarosław Gąguł", 25, 25, false, false, false);
		Goscie ostow18 = new Goscie("Os tow JAr", 25, 25, false, false, false);
		Goscie ciocia16 = new Goscie("Justyna Winiarczyk", 56, 56, false, false, false);
		Goscie ostow19 = new Goscie("Os Tow Jus", 56, 56, false, false, false);
List<Goscie> listagosci = new LinkedList <>();
listagosci.addAll
System.out.println(listagosci);


	}

}