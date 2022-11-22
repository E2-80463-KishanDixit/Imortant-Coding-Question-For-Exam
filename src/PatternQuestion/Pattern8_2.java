package exam.prep;
import java.util.*;

public class Pattern8_2 {
	
	public void pattern8()
	{
		int i,j;
		int n;
		System.out.println("Enter number of row");
		Scanner s =  new Scanner(System.in);
	    n=s.nextInt();
	    
	    for(i=1;i<=n;i++)
	    {
	    	for(j=1;j<=i;j++)
	    	{
//	    		count=i-j+1;
//	    		System.out.print(n-j+1);
	    		System.out.print((i-j+1)+" ");
	    	}
	    	System.out.println();
	    }
	    
	}

	public static void main(String[] args) {
		Pattern8_2 p = new Pattern8_2();
		p.pattern8();

	}

}
