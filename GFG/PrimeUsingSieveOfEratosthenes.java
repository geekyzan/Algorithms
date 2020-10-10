public void genPrimeUsingsieveOfEratosthenes(int n) 
    { 
        
        boolean isPrime[] = new boolean[n+1];
        isPrime[0]=isPrime[1]=true;
        for(int p = 2; p*p <=n; p++){             
            if(!isPrime[p]) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= n; i += p) 
                    isPrime[i] = true; 
            } 
        }           
        // Print all
        for(int i = 2; i <= n; i++) 
        { 
            if(!isPrime[i]) 
                System.out.print(i + " "); 
        } 
    } 
