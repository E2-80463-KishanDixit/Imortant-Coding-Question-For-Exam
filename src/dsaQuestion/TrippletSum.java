package dsa;


import java.util.Arrays;
public class TrippletSum {

	public static void main(String[] args) {
		int arr[]= {1,4,6,8,9,5,3,6};
		int n=9;
		
		
		//**************1st APPROACH***************************
//		int ans;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				for(int k=j+1;k<arr.length;k++) 
//				{
//					if(arr[i]+arr[j]+arr[k]==n)
//					{
//						ans=arr[i]+arr[j]+arr[k];
//						System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
//						break;
//					}
//				}
//			}
//		}
     
		
		//***************2nd APPROACH*********************************
		                                   
		                       //*********************** like sum = a+b+c*******************************
		                       //***********************  sum-a = b+c     *********************************
		
		//***********found some error***************************
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			
			int l=i+1,m=arr.length-1;
			while(l<=m)
			{
				int t=(n-arr[i]);
				int sum=arr[l]+arr[m];
				if(t==sum)
				{
					
					System.out.print(arr[i]+" "+arr[l]+" "+arr[m]);
					break;
				}
				if(t<sum)
				{
					l++;
				}
				else {
					m--;
				}
				
//				System.out.print("i am here ");
//					l++;
			}
//			m--;
		}
	}

}
