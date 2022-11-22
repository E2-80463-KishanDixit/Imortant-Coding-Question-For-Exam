package dsa;

public class RotateArray {

	public void rotate(int nums[] ,int k)
	{
         int arr[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            // this will rotate value in a cyclic order in kth place;
          
        arr[(i+k) % nums.length]= nums[i];   
        }
        
        // now copy arr into nums
        nums = arr;
        
        for(int print : nums)
		{
			System.out.print(" "+print);
			
		}
	}
	public static void main(String[] args) {
		RotateArray r = new RotateArray();
		int nums1[] = {1,2,3,4,5,6,7};
		int k =3;
		r.rotate(nums1 , k);

	}

}
