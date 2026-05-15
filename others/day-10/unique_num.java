class unique_num
{
	public static void main(String ...a){
		int n=12;
        int n1=n;
		int count1=0;
		int count2=0;
		while(n1>0){
			int d1=n1%10;
			count1++;
			
			int n2 =n;
			while(n2>0){
				int d2=n1%10;
			    count2++;
				
				n2=n2%10;
			}
			n1=n2/10;
		}
		if(count1==count2)
			System.out.print("unique");
		else
			System.out.print("not unique");
		}	

}