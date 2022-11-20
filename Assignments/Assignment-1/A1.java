// 1.Write a program(WAP) to print INEURON using pattern programming logic.
public class A1 
{
	public static void main(String[] args) 
	{
		int n = 10;
		for(int i=0;i<n;i++) 
		{			
			for(int j=0;j<n;j++) 
			{
				if(i==0 && j<=(3*n)/4 || j==(n-1)/2 && i<=n-1 || i==n-1 && j<=(3*n)/4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//printing 'N'
			for(int j=0;j<n;j++) 
			{
				if(j==0 || i==j || j==n-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//printing 'E'
			for(int j=0;j<n;j++) 
			{
				if(j==n/4 || j>=n/4 &&  i==0 || j>=n/4 &&  i==(n-1)/2 || j>=n/4 &&  i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//printing 'U'
			for(int j=0;j<n;j++) 
			{
				if(j==n/4 && i<n-1 || j>n/4 && i==n-1 && j<n-1 || j==n-1 &&i<n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			System.out.print(" ");
			//printing 'R'
			for(int j=0;j<n;j++) 
			{
				if(j==0||i==0 &&j<n-1&&j>0 || j==n-1&& i>0 && i<(n-1)/2 || i==(n-1)/2 && j>=0 && j<n-1 || i==n && j<n/2 ||i==j && j>0 &&i>=(n-1)/2)    
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//printing 'O'
			for(int j=0;j<n;j++) 
			{
				if(i==0 && j>n/4 && j<n-1 || j==n/4 && i>0 && i<n-1 || i==n-1 && j>n/4 && j<n-1 || j==n-1 && i>0 && i<n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			System.out.print(" ");
			//printing 'N'
			for(int j=0;j<n;j++) 
			{
				if(j==0 || i==j || j==n-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
