package charr.array;

public class CheckPalindrome {
	
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

	public char checkpalindrome(char mychar[])
	{
		int s=0;
		int e= mychar.length-1;
		char comp =0;
		while(s<=e)
		{
				if(toLowerCase(mychar[s]) != toLowerCase(mychar[e]))
				{
					comp = 'n';
					
					break;
				}else
					{
					comp = 'y';
						s++;
						e--;
					}
			
		}
		
		
		return comp;
	}
	
	public static void main(String[] args) {
		CheckPalindrome c = new CheckPalindrome();
//		char mychar[] = { 'a','b','c','d','c','b','a'};
		char mychar[] = { 'a','b','c','d','d','c','b','A'};
		
	        
		char result = c.checkpalindrome(mychar);
		System.out.println(result);
	}

}
