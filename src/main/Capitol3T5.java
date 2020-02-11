package main;

public class Capitol3T5 {

	public static void main(String[] args) {
	    String cuv = "CursProgramareJava";
	    for(int c = 0; c < cuv.length(); c++) {
	    	if(c%2==1)
	    		cuv = cuv.substring(0,c) + cuv.substring(c,c+1).toUpperCase() + cuv.substring(c+1,cuv.length());
	    	else
	    		cuv = cuv.substring(0,c) + cuv.substring(c,c+1).toLowerCase() + cuv.substring(c+1,cuv.length());
	    }
	    System.out.println(cuv);
	}
}