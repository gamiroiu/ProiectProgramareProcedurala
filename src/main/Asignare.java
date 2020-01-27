package main;

public class Asignare {

	public static void main(String[] args) {
		    	   int a= 3;
		    	   int b = (a=2)*a;
		    	   int c = b * (b=5);
		    	   System.out.println("a=" + a + ",b=" + b + ",c=" + c);
		    	   double d = 2.95;
		    	   int i = 4;
		    	   System.out.println(++d>i?d:i);
		    	   int suma = 0;
		    	   for(i = 1, i < 10; i++ ) {
		    		   suma += suma + i;
		    	   }
		    	   System.out.print("Suma este: " + suma);
		       }
}