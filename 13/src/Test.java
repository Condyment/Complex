import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Avem o Lista cu numere complexe,caruia o sa aplicam urmatoarele cerinte");
		System.out.println("Afisat ̧i dimensiunea listei (q)");
		System.out.println("Verificati daca un numar citit exista ın list̆a. "
				+ " Daca nu exist̆a, adaugat ̧i-l  ̧si afisati noua lungime  listei(w)");
		System.out.println("Eliminati un numar din lista(e)");
		System.out.println("Afisati suma numerelor din lista(r)");
		System.out.println("Afisati elementele listei(t)");

		HashSet<Complex> set = new HashSet<Complex>();
		Complex x1 = new Complex(1, 2);
		Complex x2 = new Complex(1, 3);
		Complex x3 = new Complex(1, 4);
		Complex x4 = new Complex(1, 5);
		Complex x5 = new Complex(1, 6);
		set.add(x1);
		set.add(x2);
		set.add(x3);
		set.add(x4);
		set.add(x5);
		System.out.println("Marimea setului " + set.size());
		char c = r.next().charAt(0);
		switch (c) {
		case 'q': {
			
			System.out.println(set.size());
			break;
		}
		case 'w': {
			System.out.println("Numarul real");
			int a = r.nextInt();
			System.out.println("Numarul imaginar");
			int b = r.nextInt();

			if (set.contains(new Complex(a, b))) {
				System.out.println((set.contains(new Complex(a, b))));
				System.out.println("Deja exista");
				System.out.println("Marimea setului " + set.size());
			} else {

				System.out.println("Nu exista");
				set.add(new Complex(a, b));
				System.out.println("Deja am adaugat");
				System.out.println("Maraimea setului " + set.size());
			}
			break;
		}

		case 'e': {
			set.remove(new Complex(2, 2));
			
			break;
		}

		case 'r': {

			addreal(set);
			addimaginary(set);
			break;

		}
		case 't': {

		}
			printoutreal(set, set);
			break;
		}

	}

	public static void addreal(HashSet<Complex> t) {
		int sumreal = 0;
		Iterator<Complex> a = t.iterator();
		while (a.hasNext()) {

			sumreal = sumreal + a.next().getreal();

		}
		System.out.println(sumreal);
	}

	public static void addimaginary(HashSet<Complex> t) {
		int sumreal = 0;
		Iterator<Complex> a = t.iterator();
		while (a.hasNext()) {

			sumreal = sumreal + a.next().getimaginary();

		}
		System.out.println(sumreal);
	}

	public static void printoutreal(HashSet<Complex> t, HashSet<Complex> t1) {
		Iterator<Complex> a = t.iterator();
		Iterator<Complex> a1 = t1.iterator();
		while (a.hasNext()) {
			System.out.print("real " + a.next().getreal());
			System.out.print(" imaginar= " + a1.next().getimaginary());
			System.out.println();
		}
	}
}