public int getNthFibonacci(int n){
	if(n>0 && n<2)
		return 1;
	return getNthFibonacci(n-1)+getNthFibonacci(n-2);
}

//Or used formula given by
//Fn = {[(√5 + 1)/2] ^ n} / √5 