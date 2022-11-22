package twoDArray;
import java.util.*;

public class SomeOfRow {

	public int [] addRow(int arr[][], int row, int col)
	{
		int arr1[] = new int[row];
		
		// **************** To add the row Elements **********************
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				arr1[i] =arr[i][j]+arr1[i];
			}
		}
		// **************** To print  the addition of row Elements **********************
		
		for(int i=0;i<row;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		return arr1;
		
	}
	
	public int [] addCol(int arr[][], int row, int col)
	{
		int arr1[] = new int[col];
		
		// **************** To add the column Elements **********************
		for(int j=0;j<col;j++) {
			for(int i=0;i<row;i++)
			{
				arr1[j] =arr[i][j]+arr1[j];
			}
		}
		// **************** To print  the addition of column Elements **********************
		
		for(int i=0;i<col;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		return arr1;
	}
	
	public void largeSum(int arr[])
	{
		int index=-1;
		int largeElement=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				largeElement = arr[i+1];
				index=i+1;
			}
		}
		
		System.out.println("largest row element:  "+ largeElement);
		System.out.println("largest Index :  "+ index);
	}
	
	public void wavePrint(int arr[][],int row , int col)
	{
		for(int j=0;j<col;j++)
		{
			if(j%2==0)
			{
				for(int i=0;i<row;i++)
				{
					System.out.println(arr[i][j]);
				}
			}else
			{
				for(int i=row-1;i>=0;i--)
				{
					System.out.println(arr[i][j]);
				}
			}
		}
	}
	
	 public List<Integer> spiralPrint(int[][] matrix) {
	        
	        
	       List<Integer> ans= new ArrayList<Integer>();
	        
	        int row = matrix.length;
	        int col = matrix[0].length;
	        
	        int count =0;
	        int total = row*col;
	        
	        // indices 
	        
	        int startingRow = 0;
	        int endingRow = row-1;
	        int startingCol = 0;
	        int endingCol = col-1;
	         
	       
	        
	        while(count < total){
	            
	             // Starting Row
	            
	             for(int index= startingCol; count < total && index<=endingCol ;index++)
	        {
	            ans.add(matrix[startingRow][index]);
	                 count++;
	        }
	        startingRow++;
	        
	        
	        // Ending Column
	        
	        for(int index= startingRow; count < total && index<=endingRow;index++)
	        {
	            ans.add(matrix[index][endingCol]);
	            count++;
	        }
	        endingCol--;
	        
	        //ending Row 
	        
	        for(int index= endingCol; count < total && index>=startingCol;index--)
	        {
	            ans.add(matrix[endingRow][index]);
	            count++;
	        }
	        endingRow--;
	        
	        //starting column
	        
	        for(int index= endingRow; count < total && index>=startingRow;index--)
	        {
	            ans.add(matrix[index][startingCol]);
	            count++;
	        }
	        startingCol++;
	           
	        }
	        return ans;
	    }
	
	
	public static void main(String[] args) {
		SomeOfRow sor = new SomeOfRow();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the values of rows and columns");
		int row = s.nextInt();
		int col = s.nextInt();
		
		int arr[][]= new int[row][col];
		
		System.out.println("Enter the values of elements: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Your Array:   ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
//		
//		System.out.println("addition of row: ");
//		 int myarr1[]=sor.addRow(arr,row,col);
//		 
//		 System.out.println();
//		 
//		 System.out.println("addition of column: ");
//		 int myarr2[]=sor.addCol(arr,row,col);
//		 
//		 System.out.println();
		 // ****************************  Largest Row Sum  **********************************************
//		 sor.largeSum(myarr1);
		 
		 //*************************** TO PRINT 2D ARRAY IN WAVE PATTERN **************************************
//		 sor.wavePrint(arr,row,col);
		 
		 //**************************** TO PRINT SPRIRAL PATTERN IN 2D ARRAY ************************************
		List<Integer> ans= new ArrayList<Integer>();
		
		ans= sor.spiralPrint(arr);
		
		for(int i=0;i<ans.size();i++)
		{
			System.out.println(ans.get(i));
		}
	}
	
	

}
