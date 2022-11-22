package dsa;

public class AddToArray {

	public int[] add(int arr1[], int n , int arr2[] , int m)
	{
		int ans[] = new int[Math.max(n, m)];
		int i =ans.length-1;
		int add=0, digit=0,carry=0;
		int e1=n-1,e2=m-1;
		
		while(e1>=0 && e2>=0)
		{
			add=arr1[e1] + arr2[e2]+carry;
			
			digit = add % 10;
			
			carry = add / 10;
		
			 ans[i] = (int) digit;
			 i--;
			 e1--;
			 e2--;	 
		}
		
		while(e1>=0 && i>=0)
		{
			 add= arr1[e1] +carry;
			
            digit = add % 10;
			
			carry = add / 10;
		
			 ans[i] = (int) digit;
			 i--;
			 e1--;
			
			 
		}
		
		while(e2>=0 && i>=0)
		{
			 add= arr2[e2] +carry;
			
            digit = add % 10;
			
			carry = add / 10;
		
			 ans[i] = (int) digit;
			 i--;
			 e2--;
			 
		}
		
		
		while(carry!=0)
		{
			 add= carry;
			
            digit = add % 10;
			
			carry = add / 10;
		
			 ans[i] = (int) digit;
			 i--;
			 
		}
		
		return ans;
		 
	}
	
	public static void main(String[] args) {
		AddToArray a = new AddToArray();
		int arr1[] = {1,5,8};
		int arr2[] = {4,3,8};
		
        int fans[]= a.add(arr1 , 3 , arr2 ,3);
        for( int p :fans)
		{
			System.out.print(" "+p);
			
		}
		
	}

}
