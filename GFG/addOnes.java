//You start with an array A of size N. Also, A[i] = 0 for i = 1 to N. You will be given K positive integers. 
//Let j be one of these integers, you have to add 1 to all A[i], for i >= j. Your task is to print the array A after all these K updates are done.

import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int ii=0;ii<t;ii++){
            int n=s.nextInt();
            int k=s.nextInt();
            int arr[]=new int[k];
            int arr1[]=new int[n+1];
            for(int i=0;i<k;i++){
                arr[i]=s.nextInt();
            }
            
            for(int i=0;i<k;i++){
                for(int j=arr[i];j<n+1;j++){
                    arr1[j]=arr1[j]+1;
                }
            }
            
            for(int i=1;i<n+1;i++){
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
        }
	 }
}