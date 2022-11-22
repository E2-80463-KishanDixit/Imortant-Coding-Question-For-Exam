package exam.prep;

import java.util.*;
public class CountSetBits {
	static int a,b;
	public void takeInput()
	{
		System.out.println("Enter the value of a and b");
		Scanner s = new Scanner(System.in);
		 a=s.nextInt();
		 b= s.nextInt();
	}
	
	public int  countBit(int a , int b)
	{
		int count=0;
		while(a!=0||b!=0)        
		{
			 int n=a&1;
			  int m=b&1;
				if(n==1)
				{
					count++;
				}
				if(m==1)
				{
					count++;
				}
				a=a>>1;
				b=b>>1;
				
		}
		return count;
	}

	public static void main(String[] args) {
		CountSetBits c = new CountSetBits();
		c.takeInput();
		int count = c.countBit(a,b);
		System.out.println("Number of total set bits  :"+count);
	}

}
