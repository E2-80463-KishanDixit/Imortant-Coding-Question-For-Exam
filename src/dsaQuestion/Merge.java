package dsa;

public class Merge {
	public void mergeArray(int arr1[] , int arr2[] , int arr3[])
	{
		int i=0,j=0,k=0;
		while(i<arr1.length && j< arr2.length)
		{
					if(arr1[i] > arr2[j])
					{
						arr3[k++] = arr2[j++];
						
					}else if(arr1[i] < arr2[j])
					{
						arr3[k++] = arr1[i++];
				    
					}
		}
		while(i<arr1.length)
		{
			arr3[k++] = arr1[i++];
		}
		
		while(j<arr2.length)
		{
			arr3[k++] = arr1[j++];
		}
		
		
		for( int p :arr3)
		{
			System.out.print(" "+p);
			
		}
		
	}

	public static void main(String[] args) {
		Merge m = new Merge();
		int arr1[] = {1,4,7,9,11,15};
		int arr2[] = {2,3,5,8,10};
		int arr3[] = new int [11];
		m.mergeArray(arr1,arr2,arr3);

	}

}
