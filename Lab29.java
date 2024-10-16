/*
class Hello{
	void show(int a,int b)
	{
		System.out.println("show(int,int)");
	}
	int show(int x,int y)
	{
		System.out.println("show(int, int)");
		return 99;
	}
}
class Lab342
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show(10,20);
	}
}

class Hello {
	void show(int a, int b)
	{
		System.out.println("Show(int, int)");
	}
	int show(int x,int y,int z)
	{
		System.out.println("show(int,int,int)");
		return 99;
	}
}
class Lab343{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show(10,20,30);
		h.show(10,20);
	}
}

class Hello{
	void show(int a,int b)
	{
		System.out.println("show(int ,int)");
	}
	void show(String s,int b)
	{
		System.out.println("show(string ,int)");
	}
}
class Lab344
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show(10,20);
		h.show("hai",1);
	}
}

class Hello{
	void show(int a,String s)
	{
		System.out.println("show(int, String)");
	}
	void show(String x,int y)
	{
		System.out.println("show(String, int)");
	}
}
class Lab345
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show("sagar",10);
		h.show(10,"sagar");
	}
}

class Hello{
	void show(int a,byte b){
		System.out.println("show(int,byte)");
	}
}
class Lab346{
	public static void main(String as[])
	{
		Hello h=new Hello();
		byte b=20;
		h.show(10,b);
	}
}

class Hello{
	void show(byte a,int b)
	{
		System.out.println("show(byte,int)");
	}
}
class Lab348
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show(10,20);
	}
}

class Hello{
	void show(byte b,int a){
		System.out.println("show(byte,int)");
	}
}
class Lab349
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		byte b1=10;
		byte b2=20;
		h.show(b1,b2);
	}
}
*/
class Hello{
	void show(int a,byte b)
	{
		System.out.println("show(int,byte)");
	}
	void show(byte x,int y)
	{
		System.out.println("show(byte,int)"+x);
	}
}
class Lab350{
	public static void main(String as[])
	{
		Hello h=new Hello();
		byte b1=20;
		byte b2=50;
		h.show(20,b1);
		h.show(b2,10);
	}
}