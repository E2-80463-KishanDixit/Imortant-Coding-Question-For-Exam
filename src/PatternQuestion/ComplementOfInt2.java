package exam.prep;

import java.util.Scanner;


public class ComplementOfInt2 {
	
	int n;
	public int getData()
	{
		System.out.println("Enter a integer to know complement");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		return n;
	}
	
	public int complementt(int n)
	{
		int mask=0;
		int m=n;
		if(m==0)
		{
			return 1;
		}
		while(m!=0)
		{
			mask = (mask << 1)|1;
			 m=m>>1; 
		}
		int ans = (~n) & mask;
		return ans;
	}

	public static void main(String[] args) {
		ComplementOfInt2 c = new ComplementOfInt2();
		int p=c.getData();
		int q =c.complementt(p);
		System.out.println(q);

	}

}
