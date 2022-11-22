package charr.array;

public class ReverseWord {


	int s = 0;
	int count=0;
	int e1,e2;
	public void findSpace(char arr1[])
	{
		while(arr1[s] != ' ')
		{
			count++;
			s++;
		}
		
		System.out.println(count);
		e1=count-1;
		e2 = arr1.length-1;
	}
	public void revword(char arr2[])
	{
			System.out.print(arr2);
		
		for(int i=0;i<=e1;i++,e1--)
		{
		     char temp = arr2[i];
		     arr2[i] = arr2[e1];
		     arr2[e1] = temp; 
		}
		
	    e1=count;
		for(int i=e1+1;i<=e2;i++,e2--)
		{
			char temp = arr2[i];
		     arr2[i] = arr2[e2];
		     arr2[e2] = temp;
		}
		System.out.println();
		
		System.out.println(arr2);
		
	}
	public static void main(String[] args) {
		ReverseWord r = new ReverseWord();
//		char arr[] = {'k','i','s','h','a','n',' ','d','i','x','i','t'};
//		char arr[] = {'n','a','n','d','a','n','i',' ','c','h','a','u','d','h','a','r','y'};
		char arr[] = {'n','a','n',' ','c','h','a','u','d'};
		r.findSpace(arr);
		r.revword(arr);
		

		
		
	}

}
