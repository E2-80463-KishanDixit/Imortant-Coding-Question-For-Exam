package charr.array;

import java.util.*;
public class MaxiChar {

	// ************************maximum occuring character***********************
	public char maxi(String line)
	{
		int arr[] =  new int[26];
		
		// traversing string 
		
		int check=0;
		int j=0;
		int max =arr[0];
		int ans=0;
		for(int i =0;i<line.length();i++)
		{
			check = line.charAt(i) -'a';
			arr[check]++;
		}
		// traversing array
		for( j = 0 ;j<arr.length;j++)
		{
				if(max<arr[j])
				{
					 max = arr[j];
					 ans= j;
				}
		}
		char  maximum =(char) (ans+'a');
		return maximum;
        
	}
	public static void main(String[] args) {
		MaxiChar m = new MaxiChar();
		System.out.println("Enter your string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char me=m.maxi(str);
		System.out.println(me);

	}

}
