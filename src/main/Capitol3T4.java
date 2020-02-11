package main;

public class Capitol3T4 extends Capitol3 {
//TEMA 4
	public static void main(String[] args) {
		String cuv = "String";
		int len = cuv.length();
		char[] charArray = new char[len];
		for(int i = 0; i < len; i++) {
			charArray[i]=cuv.charAt(i);
			System.out.println("charArray["+i+"]= "+charArray[i]);
	}
}
}