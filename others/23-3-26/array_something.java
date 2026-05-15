class array_something
{
	public static void main(String ...a){
		int arr[]={1,2,4,1,3,1,2,5,4,6};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		for(int j=0;j<max;j++){
			int count=0;
			for(int k=0;k<arr.length;k++){
				if(j==arr[k]
}