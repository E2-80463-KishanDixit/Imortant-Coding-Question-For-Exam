package dsa;

public class UniqueNoOfOccurence {
	
	public void uniqueOccurence(int arr[])
	{
		
		
	}
	public static void main(String[] args) {
		UniqueNoOfOccurence u = new UniqueNoOfOccurence();
		int arr1[]= {1,2,2,3,3,3,4,4,4};
		int arr2[]= {1,2,3,3,3,4,4,4};
		
		int i,j;
		int visited=-1;
		boolean unique=true;
		int occur[]=  new int[arr1.length];
		for( i=0;i<arr1.length;i++)
		{
			int count=1;
			for(j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					count++;
					occur[j]=visited;
				}
			}
			if(occur[i]!=visited) 
			{
				occur[i]=count;
			}
		}
		for(int k=0;k<occur.length;k++)
		{
			for(int l=k+1;l<occur.length;l++)
			{
				if(occur[k]!=occur[l])
				{
					unique= true;
				}
				else {
					unique =false;
				}
			}		
		}
		System.out.println("value of occurence  :"+unique);
//		return unique;
	}

}
