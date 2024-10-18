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
*/
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