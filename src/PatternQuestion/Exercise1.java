package exam.prep;
import java.util.*;

public class Exercise1 {
	public void exr1()
	{
		int n;
		System.out.println("Enter Your number");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		int multi=1;
		int digit;
		int slice;
		int sum=0;
		do {
			digit =n%10;
			multi = multi*digit;
			sum+=digit;
			slice = n/10;
			n=slice;
			
		}while(n>0);
		
		System.out.println("multiplication of digit is: "+multi);
		System.out.println("sum of digits is "+sum);
		
		int sub = multi-sum;
		System.out.println("subtraction :"+sub);	
	}

	public static void main(String[] args) {
		Exercise1 e = new Exercise1();
		e.exr1();
		

	}

}
