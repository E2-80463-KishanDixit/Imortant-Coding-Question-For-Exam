package exam.prep;

import java.util.*;

public class Pattern12 {
	
	public void pattern12()
	{
		int i,j,k,l,m;
		int n;
		System.out.println("Enter number of rows");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			int count=1;
			for(j=i;j<=n;j++)
			{
				System.out.print(count);
				count++;
			}
			for(k=1;k<=i-1;k++)
			{
				System.out.print("*");
			}
			
			for(m=1;m<=i-1;m++)
			{
				System.out.print("*");
			}
			
			int count2 =n-i+1;
			for(l=i;l<=n;l++)
			{
				System.out.print(count2);
				count2--;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Pattern12 p = new Pattern12();
		p.pattern12();
		

	}

}
