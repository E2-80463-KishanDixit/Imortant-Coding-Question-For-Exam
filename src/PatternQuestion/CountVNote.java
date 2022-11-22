package exam.prep;
import java.util.*;

public class CountVNote {
	int n;
	public int getData()
	{
		System.out.println("Enter your amount");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		return n;
	}
	
	public int getNoteData()
	{
		System.out.println("Enter which amount note you wants to know");
		Scanner s = new Scanner(System.in);
		int notevalue=s.nextInt();
		return notevalue;
	}
	
	//****************IN THIS PROGRAM WE WILL KNOW HOW MANY ONE TYPE NOTES ARE NECESSARY IN THE PARTICULAR AMOUNT*********************************
	public void oneTypeNotecount(int n,int notValue) {
		switch(notValue)
		{
		
		case 2000:int notes1 = n/2000;
		System.out.println("no. of 2000rs note :"+notes1);
		break;
		
		case 500:int notes2 = n/500;
		System.out.println("no. of 500rs note :"+notes2);
	    break;
	    
		case 200:int notes3 = n/200;
		System.out.println("no. of 200rs note :"+notes3);
		break;
		
		case 100:int notes4 = n/100;
		System.out.println("no. of 100rs note :"+notes4);
		break;
		
		case 50:int notes5 = n/50;
		System.out.println("no. of 50rs note :"+notes5);
		break;
		
		case 20:int notes6 = n/20;
		System.out.println("no. of 20rs note :"+notes6);
		break;
		
		case 10:int notes7 = n/10;
		System.out.println("no. of 10rs note :"+notes7);
		break;
		
		
		}
		
		// ****************THIS PROGRAM LET YOU KNOW HOW MANY DIFFERENT TYPES OF NOTES ARE REQUIRED IN THE GIVEN NUMBER*************************	
	}
	
	public void diffNotes(int amount)
	{
		int notes = amount/2000;
		System.out.println("no. of 2000rs note :"+notes);
		amount = amount%2000;
		
		notes = amount/500;
		System.out.println("no. of 500rs note :"+notes);
		amount = amount%500;
		
		notes = amount/200;
		System.out.println("no. of 200rs note :"+notes);
		amount = amount%200;
		
		notes = amount/100;
		System.out.println("no. of 100rs note :"+notes);
		amount = amount%100;
		
		notes = amount/50;
		System.out.println("no. of 50rs note :"+notes);
		amount = amount%50;
		
		notes = amount/20;
		System.out.println("no. of 20rs note :"+notes);
		amount = amount%20;
		
		notes = amount/10;
		System.out.println("no. of 10rs note :"+notes);
		amount = amount%10;

		System.out.println("The rest amount  :"+amount);
		
	}
	public static void main(String[] args) {
		CountVNote c = new CountVNote();
		int amount = c.getData();
		int noteValue = c.getNoteData();
		c.oneTypeNotecount(amount, noteValue);
		
		
//		c.diffNotes(amount);

	}

}
