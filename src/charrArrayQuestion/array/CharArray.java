package charr.array;
import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
    //char array always  consist a null character at last as a null terminater in c++
		
		System.out.println("Enter your name");
		Scanner s = new Scanner(System.in);
	    char [] me,you;   // here me and you both will work as an array;
		char name[] = s.next().toCharArray();
		
//		 name[2] = '\0';
		
		
		// length of the string
		int count=0;
		for(int i=0;i<name.length;i++)
		{
				count++;
		}
		
		System.out.println("length of the string is  : "+count);
		
		System.out.print("Your name :");
		for( int i =0;i<name.length;i++)
		{
			System.out.print(name[i]);
		}
		
		
		
		
	}

}
