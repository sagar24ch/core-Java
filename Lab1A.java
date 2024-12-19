			// Variable Type (1.primitive  2.Reference)

/*
class Hello
{
	boolean b1;
	byte b2;
	short s;
	int i;
	long l;
	float f;
	double d;
	String str;
	Hello h;
	void show()
	{
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(str);
		System.out.println(h);
	}
}

class Lab1{
	public static void main (String[] as)
	{
	Hello h= new Hello();
	h.show();
	}
}

*/

/*
class Hello {
	char ch;
	void show (){
		System.out.println(ch==0);
		System.out.println(ch==' ');
		System.out.println(ch=='\u0000');
	}
}

class Lab2{
	public static void main (String[] args)
	{
		Hello h=new Hello();
		h.show();
	}
}

   */
   
 class Lab2A{
	 public static void main (String[] as)
	 {
		 for (int i=32;i<126;i++)
		 {
			 char ch=(char)i;
			 System.out.println("\t" +ch+ "\t" +i);
		 }
	 }
 }