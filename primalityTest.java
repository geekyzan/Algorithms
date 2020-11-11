public boolean isPrime(int n){
	if(n<1)
	  return false;
  for(int i=2;i*i<n;i++){
	if(n%i==0)
		return false;	
  }
  return true;
}

//Method 2:we can increament our i value by factor of 6 as every prime except 2 &3 can be expressed as 6k+1 or 6k-1

public boolean isPrime(int n){
 if(n<=3) return true; //2 and 3 are prime

 if(n<=1 || n%2==0 || n%3==0) return false;

for (int i=5; i*i<=n; i=i+6) 
        if (n%i == 0 || n%(i+2) == 0)//6k-1-->0 & 6k+1-->2 
           return false; 
  
    return true; 
}

