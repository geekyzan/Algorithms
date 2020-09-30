public void allPrimeUptoGivenN(int n) 
    {         
        //ideas is to mark multiple of a number upto N
        //those which are unmarked are prime
        boolean allPrime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            allPrime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            if(allPrime[p] == true) 
            {               
                for(int i = p*p; i <= n; i += p) 
                    allPrime[i] = false; 
            } 
        } 
           
        for(int i = 2; i <= n; i++) 
        { 
            if(allPrime[i] == true) 
                System.out.print(i + " "); 
        } 
    } 