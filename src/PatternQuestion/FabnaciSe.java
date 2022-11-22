package exam.prep;
import java.util.*;
public class FabnaciSe {
	public void fab()
	{
		int a = 0;
		int b=1;
		int sum,n,i;
		System.out.println("Enter number of terms");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		sum=a+b;
		System.out.print(a+" "+b+" "+sum+" ");
		
		
		for(i=1;i<=n;i++)
		{
			a=b;
			b=sum;
			sum=a+b;
			System.out.print(sum+" ");
		}
	}

	public static void main(String[] args) {
		FabnaciSe f = new FabnaciSe();
		f.fab();

	}

}
