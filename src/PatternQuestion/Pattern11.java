package exam.prep;

import java.util.Scanner;

public class Pattern11 {
	
	public void pattern11()
	{
		int i,j,k;
		int n;
		
		System.out.println("Enter number of rows");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		//********************************
//		for(i=1;i<=n;i++)
//		{
//			for(j=i;j<=n-1;j++)
//			{
//				System.out.print(" ");
//			}
//			
//			for(k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//**********************************
		
//		for(i=1;i<=n;i++)
//		{
//			for(j=i;j<=n;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//***************************************
		
		
//		for(i=1;i<=n;i++)
//		{
//			for(j=1;j<=i-1;j++)
//			{
//				System.out.print(" ");
//			}
//			for(j=i;j<=n;j++)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		//************************************
		
//		for(i=1;i<=n;i++)
//		{
//			for(j=1;j<=i-1;j++)
//			{
//				System.out.print(" ");
//			}
//			for(k=i;k<=n;k++)
//			{
//				System.out.print(i);
//			}
//			System.out.println(" ");
//		}
		
		//***************************************
		
//		for(i=1;i<=n;i++)
//		{
//			for(j=i;j<=n-1;j++)
//			{
//				System.out.print(" ");
//			}
//			for(k=1;k<=i;k++)
//			{
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		//************************************
		
//		for(i=1;i<=n;i++) 
//		{
//			for(j=1;j<=i-1;j++)
//			{
//				System.out.print(" ");
//			}
//			for(k=i;k<=n;k++)
//			{
//			int	count=k;
//				System.out.print(count);
//				count++;
//			}
//			System.out.println();
//		}
		
		//*********************************
		
		
//		int	count=1;
//		for(i=1;i<=n;i++) 
//		{
//			for(j=1;j<=i-1;j++)
//			{
//				System.out.print(" ");
//			}
//			for(k=i;k<=n;k++)
//			{
//			
//				System.out.print(count+" ");
//				count++;
//			}
//			System.out.println();
//		}
		
		//*****************************************
	    //Palendrom
		int l; 
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n-1;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k);
			}
		    int	count =i-1;
			for(l=1;l<=i-1;l++)
			{
				System.out.print(count);
				count--;
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Pattern11 p = new Pattern11();
		p.pattern11();

	}

}
