import java.util.*;
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
            int count=0;
            while(n>0){
			   n=(n&(n-1));
               count++;
            }
            System.out.println(count);
        }
	 }
}

//note:when we sbutract 1 from a number then thn the rightmost set bit and all the bits right of it get flipped.
//following that idea we can find set bit in a given integer