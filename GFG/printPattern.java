//Print a sequence of numbers starting with N, without using loop, in which  A[i+1] = A[i] - 5,  if  A[i]>0, else A[i+1]=A[i] + 5  repeat it until A[i]=N.

public static void printPattern(int n){
	     if(n<0 || n==0){
	         System.out.print(n+" ");
	         return;
	     }
	      System.out.print(n+" ");
	        printPattern(n-5);
	   System.out.print(n+" ");     
}