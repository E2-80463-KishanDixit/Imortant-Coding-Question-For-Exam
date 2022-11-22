package dsa;

import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class MinAndMaxvalueOfArray {
	
	public int intMax(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
		
	}
	
public int intMin(int arr[]) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
		
	}
	

	
	public int[] array()
	{
		System.out.println("Enter the size of the array");
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++)
		{
			int p = s.nextInt();
		    arr[i] = p;
		}
	
		for(int i=0;i<size;i++)
		{	
			System.out.print(" "+arr[i]);
		}
		
		return  arr;
		
	}
	

	public static void main(String args[])
	{
		MinAndMaxvalueOfArray a = new MinAndMaxvalueOfArray();
		int arr[]=a.array();
		int maximum=a.intMax(arr);
		int minimum=a.intMin(arr);
		
		System.out.println();
		System.out.println("maximum element  :"+maximum);
		System.out.println("minimum element   :"+minimum);
	}
}
