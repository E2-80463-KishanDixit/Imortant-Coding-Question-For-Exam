package dsa;

import java.util.*;
public class LinearSearch {

	public boolean search(int myarr[],int key)
	{
		for(int i=0;i<myarr.length;i++)
		{
			if(myarr[i]==key)
			{
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		int arr[] = {1,4,-6,-9,-4,-7,2,9,67,45};
		
		System.out.println("Enter the element you want to search");
		Scanner s = new Scanner(System.in);
		int key = s.nextInt();
		boolean bool =ls.search(arr,key);
		if(bool==true)
		{
			System.out.println("yes, searched element is present ");
		}else {
			System.out.println(" searched element is not present ");
		}

	}

}
