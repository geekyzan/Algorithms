//find if a given element is exist in an array or not.
//function return -1 if element not exist in array.
public int searchRecursively(int arr[],int s,int e,int element){
	if(s>e)
		return -1;
	if(arr[s]==element)	
		return s;
	if(arr[e]==element)
		return e;
	return searchRecursively(arr,s+1,e-1,element);
}