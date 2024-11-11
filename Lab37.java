/*
class Lab527{
	public static void main(String as[])
	{
		String str1="JLC";
		String str2="JLC";
		String str3="JLC";
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str1==str3);
	}
}

class Lab528
{
	public static void main(String as[])
	{
		String s1="Jlc";
		String s11="Jlc";
		String s2=new String("Jlc");
		String s3=new String("Jlc.java");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1==s11);
	}
}

 class Lab529{
	public static void main(String as[])
	{
		String s1="Jlc";
		String s2=new String("Jlc");
		String s3=s2.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println();
		String s4="OK".intern();
		String s5="OK";
		System.out.println(s4==s5);
	}
}

class Lab530{
	public static void main(String as[])
	{
		String s1=new String("Hello");
		String s2=new String("Guys");
		String s3=s1+s2;
		String s4="Hello Guys";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
	}
}

class Lab531{
	public static void main(String as[])
	{
		String s1="Hello";
		String s2="Guys";
		String s3=s1+s2;
		String s4="Hello Guys";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
	}
}

class Lab532
{
	public static void main(String as[])
	{
		String s1="Guys";
		String s3="Hello"+s1;
		String s4="Hello Guys";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
	}
}

class Lab534{
	public static void main(String as[])
	{
		String s3="Hello"+"Guys";
		String s4="HelloGuys";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
	}
}

class Lab535
{
	public static void main(String as[])
	{
		String s3="Hello".concat("Guys");
		String s4="Hello Guys";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
	}
}

class Lab536
{
	public static void main(String as[])
	{
		String s1=new String("JLC");
		String s2=new String("JLC");
		String s3=new String("Myjlc");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s2));     //equals compare content// == compares addresses
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));

	}
}

class Lab537
{
	public static void main(String as[])
	{
		String s1=new String("JLC");
		String s2=new String("jlc");
		
		boolean b1=s1.equals(s2);
		System.out.println(b1);
		
		boolean b2=s1.equalsIgnoreCase(s2);
		System.out.println(b2);
	}
}
*/
class Lab538
{
	public static void main(String as[]){
	String s1=new String("JLC");
	String s2=new String("JLC");
	String s3=new String("jlc");
	int x=s1.compareTo(s2);
	System.out.println(x);
	
	x=s1.compareTo(s3);
	System.out.println(x);
	x=s1.compareToIgnoreCase(s3);
	System.out.println(x);
	
	/*x=s1.compareTo("JLH");
	System.out.println(x);
	x=s1.compareTo("JLA");
	System.out.println(x);
	x=s1.compareTo("jlc");
	System.out.println(x); */
}
}