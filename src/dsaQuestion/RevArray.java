package dsa;

import java.util.*;
public class RevArray {
	
	// it reverse the valeue after the given index value of k
	public void revArray(int arr[],int k)
	{
		int j=arr.length-1;
//		System.out.println("i am j "+j);
		for(int i=k+1;i<=j;i++,j--)
		{
			
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j] = temp;
		}
		
		for( int p : arr)
		{
			System.out.print(" "+p);
		}
	}

	public static void main(String[] args) {
	   RevArray r = new  RevArray();
		 
	   int arr[] = {1,0,4,5,0,0,6,8,0,9};
//	   int arr[] = {1,0,4,5,0,0,6,8,0};
	   System.out.println("enter the value of index k ");
	   Scanner s = new Scanner(System.in);
	  int k= s.nextInt();
	  r.revArray(arr,k);

	}

}
