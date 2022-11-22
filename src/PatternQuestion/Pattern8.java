package exam.prep;
import java.util.*;

public class Pattern8 {
	public void pattern8()
	{
		int i,j;
		int n;
		
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			int count=i;
			for(j=1;j<=i;j++)
			{
				System.out.print(count);
				count--;
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		Pattern8 p = new Pattern8();
		p.pattern8();

	}

}
