package exam.prep;

import java.util.Scanner;

public class Pattern9 {

	
	public void pattern9()
	{
		int i,j;
		int n;
		char ch=65;
		
		System.out.println("Enter number of rows");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
			char	ph = (char)(ch+i-1);
//				System.out.print('A'+i-1+" ");
				System.out.print(ph+" ");
			}
//			ch++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Pattern9 p = new Pattern9();
		p.pattern9();
	}

}
