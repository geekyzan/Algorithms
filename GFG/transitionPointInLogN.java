//You are given a sorted array containing only numbers 0 and 1. Find the transition point efficiently. The transition point is a point where "0" ends and "1" begins (0 based indexing).
//Note that, if there is no "1" exists, print -1.
//Note that, in case of all 1s print 0.

class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        if(arr.length==1 && arr[0]==1)
            return 0;
        else if(arr.length==1 && arr[0]==0)
            return -1;
        else if(arr.length>1 && arr[0]==1)
            return 0;
        return getTransitionPoint(arr,0,n-1,n);
    }
    
    int getTransitionPoint(int arr[],int low,int high,int n){
        int mid=low+(high-low)/2;
        
            if(low>high)
                return -1;
            if(arr[mid]==1 && mid>0 && arr[mid-1]!=1)
                    return mid;
            else if(arr[mid]==1 && mid>0 && arr[mid-1]==1)
                    return getTransitionPoint(arr,low,mid-1,n);
            return getTransitionPoint(arr,mid+1,high,n);        
    }
}
