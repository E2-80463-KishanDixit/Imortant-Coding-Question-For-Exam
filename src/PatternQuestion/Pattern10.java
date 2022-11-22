package exam.prep;
import java.util.*;

public class Pattern10 {
	public void pattern10()
	{
		int i,j;
		int n;
		int  start = 'A';
		
		System.out.println("Enter number of rows");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		           //***********************************
//		for(i=1;i<=n;i++)
//		{
//			for(j=1;j<=n;j++)
//			{
//				char ch = (char)('A'+j-1);
//				System.out.print(ch+" ");
//			}
//			System.out.println();
//		}
		
		            //**************************************
		
//		for(i=1;i<=n;i++)
//		{
//			for(j=1;j<=n;j++)
//			{			char ch =(char) start;
//				System.out.print(ch+" ");
//				start++;
//			}
//			System.out.println();
//			
//		}
		
		            //***********************************
		
//		for(i=1;i<=n;i++)
//			{
//				for(j=1;j<=n;j++)
//				{	
//				char ch =(char)	(start+j-1);
//					System.out.print(ch+" ");
//				}
//				System.out.println();
//				start++;
//			}	
		
		            //**************************************
//		for(i=1;i<=n;i++)
//		{
//			for(j=1;j<=i;j++)
//			{	
//			char ch =(char)	('A'+i-1);
//				System.out.print(ch+" ");
//			}
//			System.out.println();
//		}	
//		
		//*********************************************
	
		
		//***************************
//		for(i=1;i<=n;i++)
//			{
//				for(j=1;j<=i;j++)
//				{	
//					char ch = (char)('A'+i+j-1);
//					System.out.print(ch);
//				}
//				System.out.println();
//			}	
		
		//********************************
		
		
		//*************************
		
//	for(i=n;i>=1;i--)
//	{
//		for(j=i;j<=n;j++)
//		{
//			char ch =(char)( 'A'+j-1);
//			System.out.print(ch+" ");
//		}
//		System.out.println();
//	}
	
	//**********************************
		
		
	}
	

	public static void main(String[] args) {
		Pattern10 p = new Pattern10();
		p.pattern10();
		
	}
}
