package exam.prep;
import java.util.*;

public class Pattern1 {

	int r,c,i,j;
	Scanner s = new Scanner(System.in);
	
	public void pattren()
	{
		System.out.println("Enter value of row ");
		r=s.nextInt();
//		c=s.nextInt();
		
		for( i=1;i<=r;i++)
		{
			for(j=1;j<=r;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
		
		
public static void main(String[] args) {
		
		Pattern1 p = new Pattern1();
		p.pattren();
	}
}
