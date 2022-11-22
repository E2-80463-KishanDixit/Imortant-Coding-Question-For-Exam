package dsa;
import java.util.*;

public class SumOfArray {

	public int[] getArray()
	{
        System.out.println("Enter the size of the array");
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		
		System.out.println("Enter the elements of the array");
		int arr[]= new int[size];
		
		for(int i=0;i<size;i++)
		{
			int p = s.nextInt();
		    arr[i] = p;
		}
	
		System.out.println("Your Array is  :");
		for(int i=0;i<size;i++)
		{	
			System.out.print(" "+arr[i]);
		}
		
		return  arr;
	}
	
	public int sumArray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int element=arr[i];
		    sum +=element;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		SumOfArray sa = new SumOfArray();
		int arr[]=sa.getArray();
		int sum= sa.sumArray(arr);
		System.out.println();
		System.out.println("sum of the array is   :"+sum );
		
		

	}

}
