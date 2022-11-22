package dsa;

public class Array {

//	public void array()
//	{
////		int [] arr = new int [5];
//		int [] arr1 = {3,5,6,7};
//		int [] arr2 = {45,67,89,23,45,12,90};
//		
//	}
	
	public void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[])
	{
		Array a = new Array();
//		a.array();
		int [] arr1 = {3,5,6,7};
		int [] arr2 = {45,67,89,23,45,12,90};
		a.printArray(arr1);
		a.printArray(arr2);
	}
}
