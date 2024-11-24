/*
class Hello{
	int a;
	int b;
	int c;
	
	void show()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}
class Lab287
{
	public static void main(String as[])
	{
		Hello h1=new Hello();
		h1.show();
		
		Hello h2=new Hello();
		h2.show();
		
		Hello h3=new Hello();
		h3.show();
	}
}

class Hello{
	int a;
	int b;
	int c;
	
	void show()
	{
		System.out.println(a+"\t"+b+"\t"+c);
	}
}

class Lab288
{
	public static void main(String as[])
	{
		Hello h1=new Hello();
		h1.a=10;
		h1.b=20;
		h1.c=30;
		
		h1.show();
		
		Hello h2=new Hello();
		h2.a=100;
		h2.b=200;
		h2.c=300;
		
		h2.show();
		
		Hello h3=new Hello();
		h3.a=11;
		h3.b=22;
		h3.c=33;
		
		h3.show();
	}
}


class Hello{
	int a;
	int b;
	int c;
	
	void init(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	void show()
	{
		System.out.println(a+"\t"+b+"\t"+c);
	}
}
class Lab289
{
	public static void main(String as[])
	{
		Hello h1=new Hello();
		h1.init(10,20,30);
		h1.show();
		
		Hello h2=new Hello();
		h2.init(100,200,300);
		h2.show();
		
		Hello h3=new Hello();
		h3.init(11,22,33);
		h3.show();
	}
}
*/
class Hello{
	 int a;
     int b;
	 int c;
	Hello(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	void show()
	{
		System.out.println(a+"\t"+b+"\t"+c);
	}
}
class Lab290
{
	public static void main(String as[])
	{
		Hello h1=new Hello(10,20,30);
		h1.show();
		
		Hello h2=new Hello(100,200,300);
		h2.show();
		
		Hello h3=new Hello(11,22,2147483647);
		h3.show();
	}
}