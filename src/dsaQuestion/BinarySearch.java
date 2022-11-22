package dsa;
import java.util.Scanner;
public class BinarySearch {

	public int binarySearch(int [] arr,int key)
	{
		int value=0;
		int start =0;                          //{1,22,35,40,54,62}
		int end =arr.length-1;
		
		
		
		while(start<end)
		{
			int mid = (start + end)/2;
			
			if(arr[mid]==key)
			{
				 value= mid;
				 System.out.println(" hey! i am here value "+value);
				 break;
			}
			
			if(key>arr[mid])
			{
				start=(mid+1);
				continue;
			}
			
			if(key<arr[mid])
			{
				end=(mid-1);
				continue;
			}
			
			else 
			{
				return -1;
			}
			
		}
		
//		System.out.println("value "+value);
		return value;
	}
	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
		
		int arr1[]= {1,22,35,40,54,62};
		int arr2[]= {23,29,37,45,67};
		
		System.out.println("Enter the value to search");
		Scanner s = new Scanner(System.in);
		int key = s.nextInt();
		
		int index=b.binarySearch(arr1,key);
		System.out.println("index no  :"+index);
		
	}

}
