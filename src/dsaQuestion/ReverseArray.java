package dsa;

import java.util.*;
public class ReverseArray {
	
	public int[] getArray()
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = s.nextInt();
		int arr[] =new int [size];
		
		System.out.println("enter the elements of the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
				
		System.out.println("Your array :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]); 
		}
		System.out.println();
		return arr;
	}
	
	public int[] reverseArray(int myarry[])
	{
		
		int start =0;
		int last = myarry.length-1;
		
		for(int i=start;i<last;i++)     
		{
			int s= myarry[start];
			 myarry[start]= myarry[last];
			 myarry[last] = s;
			 
			 start++;
			 last--;
		}
		
		return myarry;
		
	}
	
	public int[] swapAlternateElement(int []myArray)
	{
		int start =0;
		
		for(int i=start;i<myArray.length;i+=2)
		{
			if((i+1)==myArray.length)
			{
				return myArray;
			}
			else {
				int swap = myArray[i];
				myArray[i]= myArray[i+1];
				myArray[i+1] = swap;
			}
			
		}
		
		return myArray;
	}
	
	//****************FIND UNIQUE ELEMENT IN THE ARRAY*************************
	public void uniqueElementInArray(int []myArray)
	{
		
		int i,j,unique=0;
		for( i=0;i<myArray.length;i++)
		{
			for( j=1;j<myArray.length;j++)
			{
				if(myArray[i]!=myArray[j])
				{
					unique=myArray[i];
				}
			}
		}
		
		System.out.println("your unique value  :"+unique);
	}
	
	//****************SECOND METHOD TO FIND THE UNIQUE VALUE IN THE ARRAY***********************
	public void uniqueNum(int []myArray)
	{
	    int unique=0;
		for(int i =0;i<myArray.length;i++)
		{
			unique=unique^myArray[i];                // because a^a=0 and 0^a=a   ***********XOR opetator***********
		}
		
		System.out.println("your unique value   :"+unique);
	}
	
	public void printArray(int revArr[]) {
		System.out.println("your procesed array is  :");
		for(int j=0;j<revArr.length;j++)
		{
			System.out.print(" "+revArr[j]);
		}	
		
	}

	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
//		int myarray[]=ra.getArray();	       
		
		                                                          // TO GET VALUES OF ARRAY
//		int revArr[]=ra.reverseArray(myarray);                   // TO REVERSE THE ARRAY
//		ra.printArray(revArr);                                   // TO PRINT THE ARRAY
				
//		int myArr[]=ra.swapAlternateElement(myarray);
//		ra.printArray(myArr);  
		
		int testarray[]= {3,4,5,5,4,1,1};
//	    ra.uniqueElementInArray(testarray);
		ra.uniqueNum(testarray);
		
	}

}
