package main;

public class Asignare {
//TEMA1
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
		    	   
//TEMA2
		    	   double d = 2.95;
		    	   int i = 4;
		    	   System.out.println(++d>i?d:i);
/*afiseaza valoarea 4.0
*se incrementeaza inainte si dupa se afiseaza,adica d=3.95.
*dar 3.95<4 si atunci d=2.95/3.95 este mai mic decat 4 
*astfel se duce pe a 2-a varianta fiind rezultatul i=4 
*/
		    	   
//TEMA 4
		    		int suma = 0;
		    		for(int i1 = 1; i1 <10; i1++){
		    		        suma += suma + i1;
		    		}
		    		System.out.println("Suma este: " +suma);
//suma este: 1013
		    		
//TEMA 8
		    		int day = 5;
		    		switch (day) {
		    		case 1:
		    			System.out.println("Luni");
		    			break;
		    		case 2:
		    			System.out.println("Marti");
		    			break;
		    		case 3:
		    			System.out.println("Miercuri");
		    			break;
		    		case 4:
		    			System.out.println("Joi");
		    			break;
		    		case 5:
		    			System.out.println("Vineri");
		    			break;
		    		}
}
}