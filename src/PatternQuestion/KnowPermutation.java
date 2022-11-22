package exam.prep;

import java.util.Scanner;
public class KnowPermutation {
	
	int n,r;
	public int getvalues_n()
	{
		System.out.println("Enter the values of n ");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		return n;
	}
	
	public int getvalues_r()
	{
		System.out.println("Enter the values of r ");
		Scanner s = new Scanner(System.in);
		r=s.nextInt();
		return r;
	}
	
	public int getFactorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public int nCr(int n,int r) {
		int factotial = getFactorial(n)/(getFactorial(r)*getFactorial(n-r));
		return factotial;
	}
	
	
	public static void main(String[] args) {
		KnowPermutation  kp = new KnowPermutation();
		int n=kp.getvalues_n();
		int r=kp.getvalues_r();
		int factorial =kp.nCr(n,r);
		System.out.println(n+"C"+r+" = "+factorial);
		
		
//		int fact=kp.getFactorial(n);
//		System.out.println("value of factorial  :"+fact);

	}

}
