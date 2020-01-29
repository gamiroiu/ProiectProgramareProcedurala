package main;

public class Ex3 {

	public static void main(String[] args) {
		int a = 3;
		if (++a < 4)
			if (a++ < 4)
			System.out.println(a);
		else
			System.out.println(a);
	}
//nu este afisat niciun rezultat

}
