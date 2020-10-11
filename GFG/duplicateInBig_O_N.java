public static ArrayList<Integer> duplicates(int arr[], int n) {
        
        ArrayList<Integer> dupList=new ArrayList<>();
        // int count[]=new int[n];
        
        // for(int i=0;i<arr.length;i++){
        //     int ele=arr[i];
        //     count[ele]++;
        //     if(count[ele]>1){
        //         dupList.add(ele,ele);
        //     }
        // }
        // if(dupList.size()!=0)
        //         return dupList;
        // dupList.add(-1);
        // return dupList;
        for(int i=0;i<n;i++){
           // int temp=arr[i]%n;
            arr[arr[i]%n]=arr[arr[i]%n]+n;
        }
        
        for(int i=0;i<n;i++){
         if((arr[i]/n)>1){
             dupList.add(i);
         }
        }
      if(dupList.isEmpty())
                dupList.add(-1);
        //dupList.add(-1);
        return dupList;   
    }

//another solution from GFG that prints only one element if an element occurs multiple times.
//below condition is only true when element occurs another time
/*if (arr[arr[i] % n] >= n) 
        { 
            if (arr[arr[i] % n] < 2 * n)  
            { 
                System.out.print( arr[i] % n + " "); 
                fl = 1; 
            } 
        } 
        arr[arr[i] % n] += n; 
    } 
*/


