package dsa;

public class Merge2 {
	public void merge(int arr1[] ,int m , int arr2[] , int n)
	{
		int p1=m-1,p2=n-1, i = m+n-1;
		
		while(p2>=0)
		{
			if(arr1[p1] <=arr2[p2])
			{
				arr1[i--]=arr2[p2--];
			}else
			{
				arr1[i--]=arr1[p1--];
			}
			
		}
		for(int print :arr1)
		{
			System.out.print(" "+print);
			
		}
		
		
	}

	public static void main(String args[])
	{
		Merge2 m = new Merge2();
		int arr1[] = {1,4,7,8,0,0,0};
		int arr2[] = {4,6,11};
		int a= 4,b=3;
		m.merge(arr1 , a, arr2 , b);
		{
			
		}
	}
}
