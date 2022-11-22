package exam.prep;

public class Prep {
	
	public void prep()
	{
//		int i;
//		for(i=0;i<=5;i++)
//		{
//			System.out.println(i);
//			i++;
//		}
		
//		for(int i=0;i<=5;i--)
//		{
//			System.out.println(i);
//			i++;
//		}
		for(int i=0;i<=5;i++) {
			for(int j=i;j<=5;j++) {
//				if(i+j==10)
//				{
//					break;
//				}
				System.out.println(i+" "+j);
			}
		}
	}

	public static void main(String[] args) {
		Prep p = new Prep();
		p.prep();

	}

}
