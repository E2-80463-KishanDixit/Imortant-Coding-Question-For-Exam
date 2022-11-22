
import java.util.Scanner;
public class IsStringPalindrome {

	
	public char toLowerCase(char ch)
	{
		char covrt;
		
		if(ch>='a' && ch<='z')
		{
			covrt = ch;
		}
		else {
			covrt =(char) (ch-'A'+'a');
		}
		
		return covrt;
	}
	public boolean isStringPalindrome(String str)
	{
		int s=0;
		int e = str.length()-1;
		boolean comp = true;
		char check1 ='\0',check2 ='\0';
		while(s<=e)
		{
			
//			System.out.println("S   :"+s);
//			System.out.println("E   :"+e);
			
			if(str.charAt(s)>=32 && str.charAt(s)<=47 || str.charAt(s)>=58 && str.charAt(s)<= 64 || str.charAt(s)>=91 && str.charAt(s)<=96 || str.charAt(s)>=123 && str.charAt(s)<= 126 )
			{
				s++;
			    continue;
			}else if(str.charAt(s)>=65 && str.charAt(s)<=90 || str.charAt(s)>=97 && str.charAt(s) <=122 )
			{
				check1 = toLowerCase(str.charAt(s));
			}
			else if(str.charAt(s) >='0' && str.charAt(s)<= '9')
			{
				check1 = str.charAt(s);
			}
			
//			System.out.println("character at sth index    :"+str.charAt(s));
//			System.out.println("check 1 :"+check1);
			
			if(str.charAt(e)>=32 && str.charAt(e)<=47 || str.charAt(e)>=58 && str.charAt(e)<= 64 || str.charAt(e)>=91 && str.charAt(e)<=96 || str.charAt(e)>=123 && str.charAt(e)<= 126 )
			{
				e--;
				continue;
			}
			else if(str.charAt(e)>=65 && str.charAt(e)<=90 || str.charAt(e)>=97 && str.charAt(e) <=122 )
			{
				check2 = toLowerCase(str.charAt(e));
			}
			else if(str.charAt(e) >='0' && str.charAt(e)<= '9')
			{
				check2 = str.charAt(e);
			}
//			
//			System.out.println("character at eth index    :"+str.charAt(e));
//			System.out.println("check 2 :"+check2);
			if(check1 != check2)                                            
			{
				comp = false;                                           
                                                                         
                                                                             

				break;
			}
				s++;
				e--;
				
//				check1 = str.charAt(s);
//				check2 = str.charAt(e);
		}
		
		
		return comp;
	}

	public static void main(String[] args) {
		IsStringPalindrome i = new IsStringPalindrome();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = s.nextLine(); 
		
		
//		System.out.println(str.charAt(1));
		System.out.println("length of string   :"+str.length());
		
		boolean findpalindrome =i.isStringPalindrome(str);
		System.out.println(findpalindrome);
	}

}
