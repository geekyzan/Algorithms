 static int[] getPrimes(int N) {
        // code here
        int arr[]=new int[2];
        int i;
        for(i=2;i<N;i++){
            if(isPrime(i) && isPrime(N-i)){
                arr[0]=i;
                arr[1]=N-i;
                break;
            }
        }
        if(i==N){
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
    
    static boolean isPrime(int n){
        int i;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
            return true;
    }