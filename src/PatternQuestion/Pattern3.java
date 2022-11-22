package exam.prep;
import java.util.*;

public class Pattern3 {

	public void pattern3()
	{
		 int n;
		 int cnt=1;
			System.out.println("Enter a number");
		    Scanner s = new Scanner(System.in);
		    n= s.nextInt();
		    
		    
		  for(int i=1;i<=n;i++)
		  {
			 for(int j=1;j<=n;j++) 
			 {
				 System.out.print(cnt+" ");
				 cnt++;
			 }
			 System.out.println();
		  }
	}
	public static void main(String[] args) {
		Pattern3 p = new Pattern3();
		p.pattern3();

	}
}
