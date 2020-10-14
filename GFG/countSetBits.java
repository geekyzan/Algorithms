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
                count+=n&1;
                n=n>>1;
            }
            System.out.println(count);
        }
	 }
}