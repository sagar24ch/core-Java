/*
class Hello {
	int a;
	{
		System.out.println("Instance Block");
		System.out.println(a);
	}
	Hello()
	{
		System.out.println("0 agr cons");
	}
	Hello(int x)
   {
	System.out.println("1 arg cons");
	a=x;
   }
   void show()
   {
	   System.out.println("Show() method");
	   System.out.println(a);
   }
}

class Lab291
{
	public static void main(String as[])
	{
		Hello h1=new Hello();
		h1.show();
		
		Hello h2=new Hello(10);
		h2.show();
	}
}

class Hello{
	int a;
	{
		System.out.println("Instance block");
		System.out.println(a);
		
	}
	Hello()
	{
		System.out.println("0 arg cons");
		System.out.println(a);
	}
	void show()
	{
		System.out.println("show() method");
		System.out.println(a);
	}
}
class Lab292
{
	public static void main(String as[])
	{
		Hello h=new Hello(99);
		h.show();
	}
}

class Hello{
	Hello(){
		System.out.println("0 arg cons");
	}
	void show()
	{
		System.out.println("show method");
		
	}
}
class Lab293
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}

class Hello{
	int a;
	Hello(){
		System.out.println("0 arg cons");
	}
	Hello(int x){
		System.out.println("1 arg cons");
		System.out.println(a);
		a=x;
		System.out.println(a);
	}
	void show()
	{
		System.out.println("show() method");
		System.out.println(a);
	}
}
class Lab294
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
		h.Hello(10);
	}
}

class Hello{
	int a;
	Hello(){
		System.out.println("0 arg const");
	}
	void Hello(int x)
	{
		System.out.println("1 arg method");
		a=x;

	}
	void show()
	{
		System.out.println("Show() method");
		System.out.println(a);
	}
}
class Lab295
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
		h.Hello(99);
	}
}
*/
class Hello{
	int a;
	void Hello(int x)
	{
		System.out.println("1 arg cons");
		a=x;
	}
	void show()
	{
		System.out.println("show method");
		System.out.println(a);
	}
}
class Lab296
{
	public static void main(String as[])
	{
		Hello h=new Hello(99);
		h.show();
	}
}