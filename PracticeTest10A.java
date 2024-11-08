/*
class Test1 extends Object{
	public static void main(String as[])
	{
		System.out.println("Main");
	}
}

class Test2{
	public static void main(String as[])
	{
		
		Object obj="jlc";
		System.out.println(obj);
	}
}

class Test3{
	public static void main(String as[])
	{
		Object obj="jlc";
		System.out.println(obj);
	}
}
class Object{}

class A{}
class B extends A{}

class Test4{
	public static void main(String as[])
	{
		B ref=new B();
		System.out.println(ref.y);
	}
}
class A{
	int x=99;
}
class B{
	int y=88;
}

class Test5{
	public static void main(String as[]){
		B ref=new B();
		System.out.println(ref.x);
	}
}
class A{
	int x=99;
}
class B{
	int y=88;
}

class Test6{
	public static void main(String as[])
	{
		B ref=new B();
		System.out.println(ref.x);
	}
}
class A{
	int x=99;
}
class B extends A{
	int y=88;
}

class A{
	int x=99;
}
class B extends A{
	int y=98;
	A ref=new A();
}
class Test7{
	public static void main(String as[])
	{
		B ref=new B();
		ref.x=101;
		System.out.println(ref.ref.x);
	}
}

class A{
	int x=99;
}
class B extends A{}
class C extends B{}
class D extends B{}
class Test8{
	public static void main(String as[])
	{
		D ref=new D();
		System.out.println(ref.x);
	}
}

class A{
	int x=99;
}
class B extends A{}
class C extends B{
	String x="JLC";
}
class D extends B{
	//boolean x=false;
}
class Test9{
	public static void main(String as[])
	{
		D ref=new D();
		System.out.println(ref.x);
	}
}

class A{
	static void show()
	 {
		System.out.println("A show()");
	}
}
class B extends A{
}
class Test12{
	public static void main(String as[]){
		B.show();
		
	}
}
*/
class A{
	int x=10;
}
class B extends A{
	
	void show(){
		A ref=new A();
		System.out.println(super.x);
	}
}
class Test18{
	public static void main(String as[])
	{
		B ref=new B();
		ref.x=99;
		ref.show();
	}
}