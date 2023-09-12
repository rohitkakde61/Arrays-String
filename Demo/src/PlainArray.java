
public class PlainArray {

	class GfG{
		
		
		
		public static int palinArray(int[] a, int n){
			int count=0;
		
			
			for(int i = 0; i < n ; i++)
			{
				
				if(check(a[i])==1)
					
					count++;
			}
			
			if(count==n)
				return 1;
			
			return 0;
		}
		
		
		public static int check(int a){
			
			int arr[]= {121,131,141};
			int m=a;
			int rev=0;
			
			while(a!=0){
				rev=(rev*10)+(a%10);
				a/=10;
			}
		
			if(m==rev)
				return 1;
			
			return 0;
		}
	}
		
		
		
		
		
		
	
	

}
