/*
class Hello{
	int a=10;
	static int b=20;
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	static void m2()
	{
		//System.out.println(a);
		System.out.println(b);
	}
}
class Lab250
{
	public static void main(String as[])
	{
		Hello.m2();
	}
}

class Hello{
	int a=10;
	static int b=20;
	void m1()
	{
	System.out.println(a);
	System.out.println(b);
}
	static void m2()
	{
		System.out.println(b);
		
	}
}
class Lab251
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
		h.m2();
	}
}

class Hello {
	int a;
}

class Lab252
{
	public static void main(String as[])
	{
	Hello h=new Hello();
	System.out.println(h.a);
	h.a=99;
	System.out.println(h.a);
	}
}
*/

class Hello{
	static int b;
}
class Lab253
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		System.out.println(h.b);
		h.b=99;
		System.out.println(h.b);
	}
}
	
	
