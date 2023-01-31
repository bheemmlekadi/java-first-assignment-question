package assignment;

public class Assignment {
	public static void main(String[] args) {
			int n=10;
			
			for(int i=0;i<n; i++)
			{
				
				// 'B' Letter
				
				for(int j=0 ; j<n; j++)
				{
					
					if(j==0 && i>=0 && i<=n ||
					   i==0 && j>0 && j<(3*n)/4 || i>0 && i<(n-1)/2 && j==(3*n)/4 || 
					j>0 && j<(3*n)/4 && i==(n-1)/2 ||  i>(n-1)/2 && j==(3*n)/4 && i<n-1 ||
					j>0 && j<(3*n)/4 && i==n-1 )
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}

				// 'H' Letter
				
				for(int j=0 ; j<n; j++)
				{
					
					if(j==0 && i>=0 && i<=n || j>0 && j<(3*n)/4 && i==(n-1)/2 ||
							j==(3*n)/4 && i>=0 && i<=n  )
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}
				
				// 'E' Letter 
				for(int j=0 ; j<n; j++)
				{
					
					if(i==0 && j>=0 && j<=(3*n)/4 && i<n-1|| 
							j==0 && i<=n-1 ||
							i==(n-1)/2 && j<=(3*n)/4 
							||i==n-1 && j<=(3*n)/4)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}
				
				// 'E' Letter 
				for(int j=0 ; j<n; j++)
				{
			
					if(i==0 && j>=0 && j<=(3*n)/4 && i<n-1|| 
							j==0 && i<=n-1 ||
							i==(n-1)/2 && j<=(3*n)/4 
							||i==n-1 && j<=(3*n)/4)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}

				// 'M' Letter 
				for(int j=0 ; j<n; j++)
				{
					
					if(j==0 && i>=0 && i<=n || i==j && i<(n-1)/2 && j<(n-1)/2 || 
							i<=(n-1)/2 && j>=(n-1)/2 && i+j == (3*n)/4||
							j==(3*n)/4 && i>=0 && i<=n )
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}

				
				
				for(int j=0 ; j<n; j++)
				{
					// 'I' Letter
					if(i==0 && i< (3*n)/4|| i==n-1 ||j==(n-1)/2)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}
				System.out.print("  ");

				for(int j=0 ; j<n; j++)
				{
					//'N' Letter
					if( j==0 && i>0 && i<n ||
							i==j || i>=0 && i<n-1 && j==n-1 )
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}
				System.out.print("  ");

				for(int j=0 ; j<n; j++)
				{
					// 'E' Letter 
					if(i==0 && j>=0 && j<=(3*n)/4 && i<n-1|| 
							j==0 && i<=n-1 ||
							i==(n-1)/2 && j<=(3*n)/4 
							||i==n-1 && j<=(3*n)/4)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}

				
				// 'U' Letter
				for(int j=0 ; j<n; j++)
				{
					// 'U' Letter 
					if(j==0 &&  i<n-1 ||
					   j>0 && i==n-1 && j<(3*n)/4 || 
					 i<n-1 && j==(3*n)/4)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}

			
				for(int j=0 ; j<n; j++)
				{
					// 'R' Letter
					if(i>0 && i<n && j==0 || 
					   i==0 && j< (3*n)/4 || 
					   i>0 && j>0 && i<(n-1)/2 && j==(3*n)/4 || 
					   j>0 && i==(n-1)/2 &&  j<(3*n)/4 ||
					   i==j && i>(n-1)/2 && j>(n-1)/2)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}
				System.out.print("  ");


				for(int j=0 ; j<n; j++)
				{
					// 'O' Letter
					if(i==0 && i<n && j>0 && j<(3*n)/4 || 
							j==0 && i>0 && i<n-1 ||
							(j>0 && i==n-1 && j<(3*n)/4) ||
							j==(3*n)/4 &&i>0 &&i<n-1 )
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
						
					}
					
				}
				System.out.print("  ");

				for(int j=0 ; j<n; j++)
				{
				//'N' Letter
				if(j==0 && i>0 && i<n ||
						i==j || i>=0 && i<n-1 && j==n-1 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
					
				}
				
			}
				
				
				System.out.println();
			}
			
		}

	
	
}
