package exam.prep;
import java.util.*;
public class DecimalToBinary {
	
	int  n;
	public int getData1()
	{
		
		System.out.println("Enter a number to convert into binary");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		return n;
	}
//************mehhod 1 to conversion************************
	public  int conversion1()
	{
		int ans = 0;
		int digit;
		int i=0;
		while(n!=0){
		digit = n%2;
	    ans =(int) (digit*(Math.pow(10,i))+ans);        // to reverse the number 
	    n=n/2;                                          // to not reverse number ans= (digit*10)+ans;
	    i++; 
		}
		System.out.println("ans1  :"+ans);
		return ans;
	}
	//************************************
	
	//*********************Method 2 to convert************************
//	public   int conversion2(int n)
//	{
//		int ans2 = 0;
//		int i=0;
//		while(n!=0){
//		int bit = n&1;
//		ans2 =(int) ((bit*Math.pow(10, i))+ans2);
//		n=n>>1;
//		i++;
//		}
////		System.out.println("ans2  :"+ans2);
//		return ans2;
//	}
	//******************************************
	
	public int binaryOfNegative(int n)
	{
		int ans3 = 0;
		int i=0;
		int onesCom = 0,bit;
		while(n!=0)
		{
		 bit = n&1;
		if(bit==1)
		{
			 onesCom =0;
		}else if(bit==0)
		{
		 onesCom =1;
		}
		ans3 =(int) ((onesCom*Math.pow(10, i))+ans3);
		n=n>>1;
		i++;
		if(i==32)
		{
			System.out.println("i :"+i);
			break;
		}
		 System.out.println("i m here");
		}
	     System.out.println("binaryOfNegative : "+ans3);
	     return ans3;
	}
	
	//******************************************
	
	
	public int BinaryToDecimal(int p)
	{
		int bit,i;
		int ans4=0;
		i=0;
		
		while(p!=0)
		{
		int	digit = p%10;
			if(digit==1)
				
			{
				ans4 =(int)((Math.pow(2, i))+ans4);
			}
				
			p=p/10;
			i++;
		}
		System.out.println(ans4);
		return ans4;
	}
	
	public static void main(String[] args) {
		DecimalToBinary d= new DecimalToBinary();
	int	k=d.getData1();
		
//		d.conversion1();
		
		
//		int p =d.conversion2();
//		System.out.println("ans2  :"+p);
	
//		d.binaryOfNegative();
		
		
//		d.BinaryToDecimal();
		
		//********************************
		int p=d.binaryOfNegative( k);
		int a=d.BinaryToDecimal(p);
		int total=(a+1);
//		int yes=conversion2(total);
		
//		System.out.println(a+1);
		
	}

}
