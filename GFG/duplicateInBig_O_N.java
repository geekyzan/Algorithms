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
