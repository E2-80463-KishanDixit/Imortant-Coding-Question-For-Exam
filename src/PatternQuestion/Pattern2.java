package exam.prep;
import java.util.*;

public class Pattern2 {

	public void pattern2()
	{   int n;
		System.out.println("Enter a number");
	    Scanner s = new Scanner(System.in);
	    n= s.nextInt();
	    
	    
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		System.out.print(j+" ");
	    	}
	    	System.out.println();
	    }
	    
	    
	}
	public static void main(String[] args) {
		Pattern2 p = new Pattern2();
		p.pattern2();

	}

}
