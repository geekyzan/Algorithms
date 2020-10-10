public int findPeakElement(int arr[],int low,int high,int n){
	//simple idea like binary search
	int mid=low+(high-low)/2; //(to prevent overflow->low+high/2)
	
	if((mid==0 || arr[mid]>=arr[mid-1] ) && (mid==n-1 || arr[mid]>=arr[mid+1])){
		return mid;
	}
	
	else if(mid>0 && arr[mid]<arr[mid+1]){
		return findPeakElement(arr[],mid+1,high,n);
	}	
	return findPeakElement(arr[],low,mid-1,n); 
}
