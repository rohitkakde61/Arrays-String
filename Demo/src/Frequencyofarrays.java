
public class Frequencyofarrays {

	public static void main(String[] args) {
		
		
		int[] a= {10,20,30,60,10,20,50};
		
		for(int i=0;i<a.length;i++) {
			int x=a[i];
			int count=0;
			
			if(x==-1)continue;
			for(int j=0;j<a.length;++j) {
				if(a[j]==x) {
					++count;
					a[j]=-1;
				}
			}
			
			System.out.println("Frequency of "+x+"is"+count);
		}

	}

}
