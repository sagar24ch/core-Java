/*
class Hai{
	int a=10;
	{
		System.out.println("Hai IB:a="+a);
	}
}
class Hello extends Hai{
	int b=20;
	{
		System.out.println("Hello IB:a="+a);
		System.out.println("Hello IB:b="+b);
	}
}
class Lab401{
	public static void main(String as[])
	{
		Hello h=new Hello();
	}
}

class Hai{
	 static int a=10;
	 static {
		System.out.println("Hai SB:a="+a);
	}
}
class Hello extends Hai{
	 static int b=20;
	 static {
		System.out.println("Hello SB:b="+b);
		System.out.println("Hello Sb:a="+a);
	}
}
class Lab402{
	public static void main(String as[])
		{
			int x=Hello.b;
		}
}

class A{
	{
		System.out.println("A IB:");
	}
	static {
		System.out.println("A SB:");
	}
}
class B extends A{
	{
		System.out.println("B IB:");
	}
	static {
		System.out.println("B SB:");
	}
}
class C extends B{
	{
		System.out.println("C IB:");
	}
	static {
		System.out.println("C SB:");
	}
}
class Lab403{
	public static void main(String as[])
	{
		C co=new C();
	}
}

class Hai{
	Hai(){
		System.out.println("Hai-0 arg");
	}
}
class Hello extends Hai{
	Hello(){
		System.out.println("Hello-0 arg");
	}
}
class Lab404{
	static public void main(String as[])
	{
		new Hello();
	}
}

class A{
	A(){
		System.out.println("A-0arg");
	}
}
class B extends A{
	B(){
		System.out.println("B-0arg");
	}
}
class C extends B{
	C(){
		System.out.println("C-0arg");
	}
}
class Lab405{
	static public void main(String as[])
	{
		new C();
	}
}
*/
class A{
	int a=10;
	static int b=20;
	static {
		System.out.println("A-S.b");
	}
	{
		System.out.println("A-I.b");
	}
	A(){
		System.out.println("A-0arg cons");
	}
}
class B extends A{
	int c=30;
	static int d=40;
	
	static {
		System.out.println("B-S.b");
	}
	{
		
		System.out.println("B-I.b");
	}
	B(){
		System.out.println("B-0arg cons");
	}
}
class C extends B{
	int e=50;
	static int f=60;
	{
		System.out.println("C-I.b");
	}
	static {
		System.out.println("C-S.b");
	}
	C()
	{
		System.out.println("C-0arg cons");
	}
}
class Lab406{
	public static void main(String as[])
	{
		new C();
	}
}