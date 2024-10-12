/*
class Hello{
	int a=10;
	void show()
	{
		int a=20;
		System.out.println(a);
		System.out.println(a);
	}
}
class Lab298
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}

class Hello{
	int a=10;
	void show()
	{
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}
}
class Lab299
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}

class Hello{
	int a=10;
	void show()
	{
		System.out.println(a);
		System.out.println(this.a);
	}
}
class Lab300
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}

class Hello{
	int a=10;
	static int b=20;
	void show()
	{
		String a="sagar";
		String b="gorai";
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
	}
}
class Lab301
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}

class Hello{
	int a;
	int b;
	int c;
	
	Hello(int a,int b,int c)
	{
		a=a;
		b=b;
		c=c;
	}
	void show()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class Lab302
{
	public static void main(String as[])
	{
		Hello h=new Hello(10,20,30);
		h.show();
	}
}

class Hello{
	int a;
	int b;
	int c;
	Hello(int a, int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void show()
	{
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
}
class Lab303
{
	public static void main(String as[])
	{
		Hello h=new Hello(10,20,30);
		h.show();
	}
}

class Hello{
	int a;
	Hello()
	{
		System.out.println("0 arg const");
	}
	Hello(int a)
	{
		System.out.println("1 arg cons");
		this.a=a;
		this();
	}
	void show()
	{
		System.out.println(a);
	}
}
class Lab304
{
	public static void main(String as[])
	{
		Hello h=new Hello(10);
		h.show();
	}
}

class Hello{
	int a;
	Hello(){
		System.out.println("0 arg const");
	}
	Hello(int a)
	{
		this();
		System.out.println("1 arg const");
		this.a=a;
	}
	void show()
	{
		System.out.println(a);
	}
}
class Lab305
{
	public static void main(String as[])
	{
		Hello h=new Hello(10);
		h.show();
	}
}
*
class Hello{
	Hello(){
		this();
		System.out.println("0 arg const");
	}
}
class Lab306
{
	public static void main(String as[])
	{
		Hello h=new Hello();
	}
}

class Hello{
	int a;
	Hello(){
		this(10);
		System.out.println("0 arg constr");
	}
	Hello(int a)
	{
		this();
		System.out.println("1 arg constr");
		this.a=a;
	}
	
}
class Lab307
{
	public static void main(String as[])
	{
		Hello h=new Hello();
	}
}

class Hello{
	Hello()
	{
		System.out.println("0 arg cons");
		this(10);
	}
	Hello(int a)
	{
		System.out.println("1 arg cons");
	}
}
class Lab308
{
	public static void main(String as[])
	{
		Hello h=new Hello();
	}
}

class Hello{
	static int a=10;
	static void show()
	{
		int a=20;
		System.out.println(a);
		System.out.println(a);
	}
}
class Lab309
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}
class Hello{
	static int a=10;
	void display()
	{
		int a=200;
		System.out.println(a);
		System.out.println(this.a);
	}
	static void show()
	{
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}
}
class Lab310
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.display();
		h.show();
	}
}
//error: non-static variable this cannot be referenced from a static context
*/
class Hello{
	void show()
	{
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}
}
class Lab311
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}