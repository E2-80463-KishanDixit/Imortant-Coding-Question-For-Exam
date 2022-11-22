package exam.prep;

public class BitOp {
	
	public void bit()
	{
		int a=17;
		int b=19;
		
		//left shift Oprerator ---------------probabily multyply small no with 2
		
		System.out.println("left for 17");
		System.out.println(a<<1);
		System.out.println(a<<2);
		
		System.out.println("left for 19");
		System.out.println(b<<1);
		System.out.println(b<<2);
				
		//left shift Oprerator ---------------probabily devide small no with 2
		
		System.out.println("right for 17");
		System.out.println(a>>1);
		System.out.println(a>>2);
		
		System.out.println("right for 19");
		System.out.println(b>>1);
		System.out.println(b>>2);
		
	}

	public static void main(String[] args) {
		BitOp b = new BitOp();
		b.bit();

	}

}
