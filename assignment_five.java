package assignment;

public class assignment_five {

	public static void main(String[] args) {
int n=14;
		
		for(int i=0;i<=n; i++)
		{
		 for(int j=0; j<=n; j++) {
			 
			 
			 if(i==0 && j>=0 && j<=n || i==n && j>=0 && j<=n ||
					 i==0 && j<=(n-1)/2 && j>0 && i>=(n-1)/2||j==0 && i<(n-1)/2||i+j<=(n-1)/2 ||
					 i-j>(n-1)/2) {
				 System.out.print("* ");
			 }
			
			 else {
				 System.out.print("  ");
			 }
		 }
			
			System.out.println();
		}
	}

}
