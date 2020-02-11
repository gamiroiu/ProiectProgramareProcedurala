package main;

public class Capitol3 {

	public static void main(String[] args) {
//TEMA 1	
        	double v[];
        	v = new double[10];
        	v[0] = 12;
        	v[1] = 25.4;
        	v[2] = 31;
        	for(int i=0;i<3;i++)
        	System.out.println(v[i]);  
//TEMA 2
		    int[] arr = { 5, 12, 33, 456, 5, 57, 1, 99, 789, 74 };
		    int maxValue = arr[0];
		    int minValue = arr[0];
		    for(int i= 1;i < arr.length; i++){
		    if(arr[i] > maxValue){
			  maxValue = arr[i];
			  } 		    
	}
		    for(int i=1;i < arr.length;i++){
		    if(arr[i] < minValue){
		    	minValue = arr[i];
	}	  
	}
            System.out.println("Maxim: " + maxValue); 
            System.out.println("Minim: " + minValue); 
//TEMA 3
        	int[] array = new int[] {45, 2, -97, 5};
    		for (int i = 0; i < array.length; i++) {
    		if (array[i] < 0)
    		System.out.println("Pozitia valorii negative: " + i);
//TEMA 6
    		int[] N = new int[] {6, 86, 4, 90};
    		double[] M = new double[N.length];
    		double K = 2.2;
    		for(int c = 0; c < N.length; c++)
    			M[c] = N[c] + K;
    		System.out.print("Numerele intregi sunt: ");
    		for(int c = 0; c < M.length; c++)
    			System.out.print(M[c] + ", ");
}
}
}