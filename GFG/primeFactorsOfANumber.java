
//function that print prime factors of a number
//import java.lang.*
public void printPrimeFactOfNumber(int n){
    int temp=n;
    while(n%2==0){
        System.out.print("2 ");
        n=n/2;
    }
    for(int i=3;i<Math.sqrt(n);i++){
        if(n%i==0){
            System.out.print(i+" ");
            n/=i;
        }
    }

    // if(temp==n){
        if(n>2){
            System.out.print(n);
    }
}