package exam.prep;
import java.util.*;

public class EvenSum {

	public void sum()
	{
		int n;
		 int sum =0;
		System.out.println("enter number to find even sum");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(int i=2;i<=n;i+=2)
		{ 
			 sum +=i;
		}
		System.out.println(sum);
	}
	
	public static void main(String args[]) {
		EvenSum ev = new EvenSum();
		ev.sum();
	}
}
