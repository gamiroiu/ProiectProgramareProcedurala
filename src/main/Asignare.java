package main;

public class Asignare {

	public static void main(String[] args) {
		    	   int a= 3;
		    	   int b = (a=2)*a;
		    	   int c = b * (b=5);
		    	   System.out.println("a=" + a + ",b=" + b + ",c=" + c);
/*sunt afisate urmatoarele rezultate: a=2;b=5 si c=20
*a=2 deoarece este reinitializat la expresia de la linia 7 (a=2)
*b= 2*2=4 iar acesta este reinitializat la expresia de la linia 8 (b=5)
*c=20 deoarece 4*5=20
*/
		    	   double d = 2.95;
		    	   int i = 4;
		    	   System.out.println(++d>i?d:i);
//se compileaza si afiseaza valoarea 4.0
		       }
}