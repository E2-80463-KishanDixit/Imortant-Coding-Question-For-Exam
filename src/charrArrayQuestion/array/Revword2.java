package charr.array;

public class Revword2 {
	
	
	public void findSpace(char arr1[])
	{
		 int s = 0;
		 int count=0;
		 int e=0;
		
		 System.out.println(arr1);
		 System.out.print("i am arrays length   "+arr1.length);
		 
		 System.out.println();
	    while(e<arr1.length)
		{
			while(arr1[e] != ' ' && e<arr1.length)                                                   
			{
				e++;
				if(e>=arr1.length)
				{
					break;
				}
			}
			
			int e1= e-1;
			int i=s;
			while(i<=e1)
			{ 
			     char temp = arr1[i];
			     arr1[i] = arr1[e1];
			     arr1[e1] = temp;
			     
			     i++;
			     e1--; 
			}
			s=e+1;
			e=s;
			
			System.out.println("i am e     "+e);
		}
		     System.out.print(arr1);
	}
	

	public static void main(String[] args) {
		Revword2 r = new Revword2();
		char arr[] = {'k','i','s',' ','h','a','n',' ','d','i','x','i','t',' ','t','h','e'};
//		char arr[] = {'n','a','n','d','a','n','i',' ','c','h','a','u','d','h','a','r','y'};
//		char arr[] = {'n','a','n',' ','c','h','a','u','d'};
		r.findSpace(arr);
		

	}

}
