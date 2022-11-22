package exam.prep;
import java.util.Scanner;

public class Pattern4 {

	public void pattern4()
	{
		int i,j;
		 int n;
		 int cnt=1;
			System.out.println("Enter a number");
		    Scanner s = new Scanner(System.in);
		    n= s.nextInt();
		    
		    for(i=1;i<=n;i++)
		    {
		    	for(j=1;j<=i;j++)
		    	{
		    		System.out.print("* ");
		    	}
		    	
		    	System.out.println();
		    }
	}
	
	public static void main(String[] args) {
		Pattern4 p = new Pattern4();
		p.pattern4();
	}

}
