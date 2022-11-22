package dsa;

public class ToShort {
       //*******************TO SHORT 0,1,2 ARRAY****************************
	
	 //***************************DUCH FLAG ALGO ------------------THREE POINTER APPROACH********************
	public static void main(String args[])
	{
		int arr[]= {1,2,2,0,0,1,2,0,2,0,0,1};
		
		int lo=0;
		int mid =0;
		int hi=arr.length-1;
		
		while(mid<=hi)
		{
			switch(arr[mid])
			{
			case 0 : int swep1 = arr[lo];
			         arr[lo]=arr[mid];
			         arr[mid]=swep1;
				lo++;
			    mid++;
			break;
			
			case 1: mid++;
			break;
			
			case 2:
				int swep2=arr[mid];
			    arr[mid]=arr[hi];
			    arr[hi]=swep2;
				hi--;
			
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
	}
}
