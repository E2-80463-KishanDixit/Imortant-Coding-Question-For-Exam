package twoDArray;
import java.util.*;

// ************* this program is to know that  how we crate, initialize,print  and pass  2D array *************************
public class TwoDArray {
	
	public boolean isPresent(int arr[][],int target) {
		boolean know=false;
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=2;j++)
			{
				if(arr[i][j]==target)
				{
					know = true;
				}
			}	
		}
		return know;
	}

	public static void main(String[] args) {
		
		TwoDArray td = new TwoDArray();
		// create 2D array
		int arr[][] = new int[4][3];
//		int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
			
		System.out.println("Enter the numbers:");       
		Scanner s = new Scanner(System.in);
		
		// taking input >> row wise
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=2;j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.print("Enter the element to search ");
		int target = s.nextInt();
		
		 boolean status = td.isPresent(arr,target);
		// To print the Array
		 System.out.print("your array is:  \n");
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();	
		}
		
		System.out.print("your seraching element:   "+status);
		
	}

}
