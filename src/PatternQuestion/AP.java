package exam.prep;

import java.util.*;
public class AP {
	
	public int nValue()
	{
		System.out.println("Enter the value of n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		return n;
		
	}
	public void ap(int n)
	{
		int nthTerm = (3*n+7);
		System.out.println(nthTerm );
	}

	public static void main(String[] args) {
		AP a=new AP();
		int n =a.nValue();
		a.ap(n);
		
	}

}
