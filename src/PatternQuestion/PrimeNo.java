package exam.prep;
import java.util.*;

public class PrimeNo {
	
	public void prime()
	{
		int n,prime,count=0;
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter a number");
		n= s.nextInt();
		for(int i=2;i<n;i++)
		{
			prime = n%i;
			if(prime==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			 System.out.println(n+"  Given number is prime:");
		}else
		{
			System.out.println(n+"  Given number is not a prime:");
		}
		
	}

	public static void main(String[] args) {
		
		PrimeNo pn = new PrimeNo();
		pn.prime();

	}

}
