package dsa;

import java.util.*;
public class FindDuplicate {

	
	//************************ PROGRAM TO SORT 0,1***************************
	public static void main(String[] args) {
		 
		int arr[]= {1,1,0,0,0,0,1,0};
		
		int i=0,j=(arr.length-1);
		
		while(i<arr.length || j>0 )
		{

			if(arr[i]==0 )
			{
				i++;
			}
//			System.out.print("i="+i);
			if(arr[j]==1)
			{
				j--;
			}
			
//			System.out.print("j="+j);
			
			if(arr[i]==1 && arr[j]==0)
			{
				int swap = arr[i];
				arr[i]=arr[j];
				arr[j]=swap;
				i++;
				j--;
			}
			if(i>=j)
			{
				break;
			}
		}
		
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(" "+arr[k]);
		}
		
	}

}
