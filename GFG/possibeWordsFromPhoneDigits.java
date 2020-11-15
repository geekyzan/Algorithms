static void possibleWords(int a[], int N)
    {
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> res=new ArrayList<>();
        
        
        recursiveComputeWord(a,arr,0,res,"");
        
         for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
        
        
    }
    
    static void recursiveComputeWord(int a[],String arr[],int index,List<String> res,String curr){
        if(index==a.length){
            res.add(curr);
            return;
        }
        
        String letters=arr[a[index]];
        
        for(int i=0;i<letters.length();i++){
            recursiveComputeWord(a,arr,index+1,res,curr+letters.charAt(i));
        }
        
    }