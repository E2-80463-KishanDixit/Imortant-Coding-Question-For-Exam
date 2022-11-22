package exam.prep;

import java.util.*;
public class FabnaciTerm {
	
	public void fabnaciNthTerm()
	{
		System.out.println("Enter the nth term");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		int a=0,b=1,c=0;
		if(n==1)
		{
			System.out.println("Your nth term of fabnaci series is  :0");
		}else if(n==2)
		{
			System.out.println("Your nth term of fabnaci series is  :1");
		             
		}else if (n>2)
		{
			for(int i=1;i<=n-2;i++)
			{
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println("Your nth term of fabnaci series is  :"+c);
		}		
		
		
	}
	
	

	public static void main(String[] args) {
		FabnaciTerm ft = new FabnaciTerm();
		ft.fabnaciNthTerm();
	}

}
