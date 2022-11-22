package exam.prep;
import java.util.*;

public class Pattern7 {
	
	static int count=0;
	public void pattern7()
	{
		 int i=1;
		int j,n;
		 int cnt=1;
		 
	     System.out.println("Enter a number");
		 Scanner s = new Scanner(System.in);
		 n= s.nextInt();
		 
		 for(i=1;i<=n;i++)
		 {
			 count=i;
			 for(j=1;j<=i;j++)
			 { 
				 System.out.print(count);
				 count++;
			 }
			 System.out.println();
		 }
	}
	
	

	public static void main(String[] args) {
		Pattern7 p = new Pattern7();
		p.pattern7();

	}

}
