package fundamentals;

public class TypeConversion {
	
	
	public static void main(String args[])
	{
		//char to int 
		char ch='a';
		int i=ch;
//		ch=i
		ch=(char)i;
		
		//byte to short 
		byte b=10;
		short s=b;
		s=(short)b;
		
		//short to long
		short s1=20;
		long l=s;
		s=(short)l;
		System.out.println(s1);
		
		long l1=23445l;
		
		System.out.println(4+4);
		System.out.println(4.0+4.5);
		System.out.println(4.1+4.4f);
		System.out.println(2.0/5);
		System.out.println('a'+1);
		int i1='c';
	    System.out.print(i1);
	}

}
