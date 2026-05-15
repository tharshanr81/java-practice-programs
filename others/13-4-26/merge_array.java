class merge_array{
	public static void main(String[] args){
		int a[]={12,56,78};
		int b[]={81,45,23};
		int m=a.length;
		int n=b.length;
		int merged[]=new int[m+n];
		for (int i=0;i<m;i++)
		{
			merged[i]=a[i];
		}
		for(int i=0;i<n;i++){
			merged[m+i]=b[i];
		}
		  for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i] + " ");
        }
	}
}