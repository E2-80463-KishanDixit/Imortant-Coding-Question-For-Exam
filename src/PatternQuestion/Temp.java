package exam.prep;
import java.util.*;

public class Temp {

	public void frenheit() {
		Scanner s = new Scanner(System.in);
		float f = 0 ;
		float celcius;
		System.out.println("Enter your temp in Farenheit");
		f=s.nextFloat();
		celcius = (f-32)*5/9;
		System.out.println("your value in Calcius:"+celcius);
		
	}
	
	
	public static void main(String args[])
	{
		Temp t = new Temp();
		t.frenheit();
	}
}
