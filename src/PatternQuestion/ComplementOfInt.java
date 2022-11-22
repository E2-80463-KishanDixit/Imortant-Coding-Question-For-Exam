package exam.prep;

import java.util.*;

//**********************TO GET DATA FROM THE USER*************************************
public class ComplementOfInt {
	int n;
	public int getData()
	{
		System.out.println("Enter a integer to know complement");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		return n;
	}
	
	// **************TO CONVERT INTO BINARY*****************************
	
	public int intdigi(int n)
	{
		int digi;
		int ansp=0;
		int i=0;
		while(n!=0) {
			digi=n%2;
		    ansp =(int)((digi*Math.pow(10, i))+ansp);
			n=n/2;
			i++;
		}
		
		return ansp;
	}
	
	//*****************TO REVERE THE BINARY**************************
	
//	public int rev(int pro)
//	{
//		int reverse=0 ;
//		while(pro!=0)
//		{
//		int	digi2=pro%10;
//		reverse=(int)((reverse*10)+digi2);
//		pro=pro/10;
//		}
//		return reverse;
//		
//	}
	
	
	//*******************TO FIND THE COMPLEMENT THE OF THE BINERY**********************
	public int complement(int pro)
	{
		int bit;
		int com =0;
		int i= 0;
		bit=0;
		while(pro!=0)
		{
		   int slice = pro%10;
		   if(slice==0)
		   {
			   bit=1;
		   }else if(slice==1)
		   {
			   bit=0;
		   }
		  com =(int) ((bit*Math.pow(10,i))+com);
		  pro=pro/10;
		  i++;
		}
		return com;
	}
	
	//******************TO CONVERT BINARY INTO DECIMAL****************************
	
	public int decimal(int pro)
	{
		int i=0;
		int lastDecimal =0;
		while(pro!=0)
		{
			 int digi=pro%10;
		      lastDecimal = (int)((digi*Math.pow(2,i))+lastDecimal);
		      pro=pro/10;
		      i++;
		}
		System.out.println("complement integer of the given integer : "+lastDecimal);
		return lastDecimal;
	      
	      
	}

	
	public static void main(String[] args) {
		ComplementOfInt c= new ComplementOfInt();
		int k =c.getData();
		int ansShow=c.intdigi(k);
		System.out.println("binary of entered number  :"+ansShow);
		
		int comple = c.complement(ansShow);
		System.out.println("complement of enterd binary  :"+comple);
		
		int complementofdecimal=c.decimal(comple);
				
		
		
		
		
//		int rev_no = c.rev(ansShow);
//		System.out.println(rev_no);
		
		
		
		
		

	}

}
