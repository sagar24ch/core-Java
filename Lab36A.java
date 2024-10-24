				//Polymorphism--1 name many forms/ operations
	/* polymorphism is the ability of an object to behave differentlyat different situations
			
			types-1>  compile-time polymorphism/   static polymorphism/   early binding
			compile time poly can be achived by method overloading(within the class different methods has same name ut diff parameters)
			java compilers binds method calls with actual method at compile time only hence early binding and compile time
			also once binded can't change at run time called static polymorphism.
			
			2> Runtime polymorphism/    Dynamic polymorphism/     late binding
			Runtime polymorphism can be achived by method overriding (same method name same parameters) and dynamic dispatch
			jvm binds the method calls with actual method at run time
			changing object dynamically at run time
			*/
/*
class Hello{
	void sum(int a,int b){
		System.out.println("Hello -sum(int,int)");
	}
	void sum(int a,int b,int c){
		System.out.println("Hello sum(int,int,int)");
	}
}
class Lab464{
	public static void main("String as[]")
	{
		Hello h=new Hello();
		h.sum(10,20);
		h.sum(10,20,30);
		h.sum(10);
	}
}

class A{
	void m1(){
		System.out.println("A-m1()");
	}
	void m2(){
		System.out.println("A-m2()");
	}
}
class B extends A{
	void m2(){
		System.out.println("B-m2()");
	}
	void m3(){
		System.out.println("B-m3()");
	}
}
class C extends A{
	void m2(){
		System.out.println("C-m2()");
	}
	void m4(){
		System.out.println("C-m4()");
	}
}
class Lab465{
	public static void main(String as[])
	{
		A ao=null;
		ao=new B();
		ao.m1();
		ao.m2();
		ao=new C();
		ao.m1();
		ao.m2();
	}
}

class A{
	void m1(){
		System.out.println("A-m1()");
	}
	void m2(){
		System.out.println("A-m2()");
	}
}
class B extends A{
	void m2(){
		System.out.println("B-m2()");
	}
	void m3(){
		System.out.println("B-m3()");
	}
}
class C extends A{
	void m2(){
		System.out.println("C-m2()");
	}
	void m4(){
		System.out.println("C-m4()");
	}
}
class Lab467{
	public static void main(String as[]){
		A ao=null;
		ao=new B();
		ao.m3();
		ao=new C();
		ao.m4();
	}
}

class A{
	 void m1(){
		System.out.println("A-m1()");
	}
	 void m2(){
		System.out.println("A-m2()");
	}
}
class B extends A{
	static void m2(){
		System.out.println("B-m2()");
	}
	void m3(){
		System.out.println("B-m3()");
	}
}
class C extends A{
	void m2(){
		System.out.println("C-m2()");
	}
	void m4(){
		System.out.println("C-m4()");
	}
}
class Lab467{
	public static void main(String as[])
	{
		A ao=null;
		ao=new B();
		ao.m2();
		ao=new C();
		ao.m2();
	}
}
error: m2() in B cannot override m2() in A
*/
class A{
	int x=10;
	static int y=20;
}
class B extends A{
	String x="JLC";
	static String y="Myjlc";
}
class Lab468
{
	public static void main(String as[])
	{
		A ao=new B();
		System.out.println(ao.x);
		System.out.println(ao.y);
	}
}