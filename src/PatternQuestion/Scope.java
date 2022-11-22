package exam.prep;

import java.util.*;

public class Scope {
	  
		public void pr()
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your input");
			int a= s.next().charAt(0);
			if(a>=47 && a<=58 )                          //||  || 
			{
				System.out.println("Enter Input is a numeric value");
			}else if(a>=65 && a<=90)
			{
				System.out.println("Enter Input is in upper Case value");
			}else if(a>=97 && a<=122)
			{
				System.out.println("Enter Input is in lower Case value");
			}
		    
		}
	
 
	public static void main(String args[])
	{
	     Scope s = new Scope();
	     s.pr();
		
	}
	

}
