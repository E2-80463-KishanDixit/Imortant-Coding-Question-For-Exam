package charr.array;
import java.util.Scanner;
public class ReverseString {

	public void reverseArray(char[] name)
	{
		int s = 0;
		int e = name.length-1;
		
		while(s<=e)
		{
			char temp = name[s];
			name[s] = name[e];
			name[e] = temp;
			
			s++;
			e--;
		}
			System.out.print(name);
		
	}
	
	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		char name[] = s.next().toCharArray();
		r.reverseArray(name);

	}

}
