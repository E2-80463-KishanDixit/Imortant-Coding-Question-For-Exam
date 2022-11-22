package exam.prep;

import java.util.*;

public class Pattern6 {
	static int count =1;
	public void pattern6()
	{
		 int i,j;
		 int n;
		 int cnt=1;
	     System.out.println("Enter a number");
		 Scanner s = new Scanner(System.in);
		 n= s.nextInt();
		 
		 for(i=1;i<=n;i++) 
		 {
			 for(j=1;j<=i;j++) {
			
				 System.out.print(count+" ");
			 count++;
			 }
			 System.out.println();
		 }
	}	 
	
	public static void main(String[] args) {
		Pattern6 p = new Pattern6();
		p.pattern6();

	}


}

