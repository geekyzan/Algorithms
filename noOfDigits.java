//No of digits in a given number N is D = floor(log10N)+1
public int getNoOfDigits(int n){
	return (int)(Math.floor(Math.log10(n)))+1;
}

//No of digits in a factorial n!
//log(a+b)=log a+log b;
//so,log(n!)=log(1)+log(2)+.....+log(n);
//As no of digits in n is given as D=floor(log10(N))+1
//so no of digits in a factorial is,D=log10(2)+log10(3)+....+log10(n)+1---

public int getDigitsInFactorial(int n){
	if(n<=1)
		return 1;
	int noOfDig=0;
	for(int i=2;i<=n;i++){
		noOfDig+=Math.log10(i);
	}
	return Math.floor(noOfDig)+1;
}