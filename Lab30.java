					/* Inheritace-Writing new class by re-using functionalities of existing class ....using extends keyword
					*types- simple,multilevel,heirarchical,hybrid ....java does not supports mutiple inherit with class but supports with interfaces
					*object will be created for sub class only...this sub class oj statement
					1st load super class then the sub class 
					after that 3rd creating obj for super class and then create obj for sub class*/
/*
class Hai{
	static {
		System.out.println("Hai-SB");
	}
}
class Hello extends Hai{
	static{
		System.out.println("Hello-SB");
	} 
}
class Lab387{
	static public void main(String as[])
	{
		Hai hai=new Hai();
	}
}

class Hai{
	static{
		System.out.println("Hai=SB");
	}
}
class Hello extends Hai{
	static {
		System.out.println("Hello-SB");
	}
}
class Lab388{
	public static void main(String as[])
	{
	Hello hello=new Hello();
	}
}

class Hai{
	int a=10;
}
class Hello{
	int b=20;
}
class Lab389{
	static public void main(String as[])
	{
	Hai hai=new Hai();
	System.out.println(hai.a);
	//System.out.println(hai.b);
	
	Hello hello=new Hello();
	//System.out.println(hello.a);
	System.out.println(hello.b);
	}
}

class Hai{
	int a=10;
}
class Hello extends Hai{
	int b=20;
}
class Lab390{
	public static void main(String as[])
	{
		Hello hello=new Hello();
		System.out.println(hello.a);
		System.out.println(hello.b);
		
		Hai hai=new Hai();
		System.out.println(hai.a);
		//System.out.println(hai.b);
	}
}

class Hai{
	int a=10;
    void m1(){
		System.out.println("m1-a="+a);
		//System.out.println("m2-b="+b);
	}
}
class Hello extends Hai{
	int b=20;
    void m2(){
		System.out.println("m1-a="+a);
		System.out.println("m2-b="+b);
	}
}
class Lab392{
	public static void main(String as[])
	{
		Hello hello=new Hello();
		hello.m2();
		hello.m1();
	}
}

class A{
	void m1(){
		System.out.println("A-m1()");
	}
}
class B extends A{
	void m2(){
		System.out.println("B-m2()");
	}
}
class C extends B{
	void m3(){
		System.out.println("C-m3()");
	}
}
class Lab394{
	public static void main(String as[])
	{
		C co=new C();
		co.m1();
		co.m2();
		co.m3();
	}
}

class A{
	void m1(){
		System.out.println("A-m1");
	}
}
class B extends A{
	void m2(){
		System.out.println("B-m2");
	}
}
class C extends A{
	void m3(){
		System.out.println("C-m3");
	}
}
class Lab395{
	public static void main(String as[])
	{
		C co=new C();
		co.m1();
		//co.m2();
		co.m3();
		
		B bo=new B();
		bo.m1();
		bo.m2();
		//bo.m3();
	}
}


class A{}
class B{}
class C extends A,B{}
class Lab396{
	public static void main(String as[]){
	System.out.println("Hello guys");
	}
}


class Hai{}
class Hello extends Object,Hai{}
class Lab397{
	public static void main(String as[])
	{
		System.out.println("Hello sagar");
	}
}

class Hello extends Hello{}
class Lab398{
	static public void main(String as[])
	{
		System.out.println("Hello sgr");
	}
}

class Hai extends Hello{ }
class Hello extends Hai{ }
class Lab399{
	static void main(String as[])
	{
		System.out.println("Hello sagar");
	}
}
*/
final class Hai{ }
class Hello extends Hai { }
class Lab400{
	public static void main(String as[])
	{
		for(int a=0;a<10;a++)
		{
			System.out.println("sagar"+a);
			if(a==5)
					break;
		}
	}
}