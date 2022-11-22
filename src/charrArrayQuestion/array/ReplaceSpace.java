package charr.array;

import java.util.Scanner;
public class ReplaceSpace {

	public void replace(String line)
	{
		for(int i=0;i<line.length();i++)
		{
			if(line.charAt(i)==' ')
			{
				line=line.replace(" ", "@40");
			}
		}
		
		System.out.println("my modified String   :"+ line);
	}
	public static void main(String[] args) {
		ReplaceSpace r = new ReplaceSpace();
		System.out.println("Enter a string ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		r.replace(str);

	}

}
