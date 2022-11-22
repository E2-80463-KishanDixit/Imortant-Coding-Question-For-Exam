package charr.array;

public class RemoveOccurenceOfSubstring {

	public void remove(String line,String part)
	{
		int st=0;
		int e=line.length();
		
		while(line.length()!=0 && line.indexOf(part)!=0)
	    	  line= line.replace(part,"");
	    	  
	    	  System.out.println(line);
	      }
//	    System.out.println(s);
	
	public static void main(String[] args) {
		RemoveOccurenceOfSubstring r = new RemoveOccurenceOfSubstring();
//		String str = "axaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxaxbybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybybyby";
//		String part="axby";
//		String str ="axxxxyyyyb";
//		String part="xy";
//		
		String str ="aabababa";
		String part="aba";
		
		r.remove(str,part);
	}

}
