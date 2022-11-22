package dsa;

public class MoveZeros {

	public void moveZero(int arr[])
	{
		int i=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j] !=0)
			{
				int temp = arr[i];
			    arr[i]=arr[j];
			    arr[j]=temp;
			    i++;
			}
			
		}
			for( int k : arr)
			{
				System.out.print(" "+k);
			}
			
	}
	public static void main(String[] args) {
		MoveZeros m = new MoveZeros();
		int nums[]= {1,0,4,5,0,0,6,8,0,9};
		m.moveZero(nums);
	}

}
