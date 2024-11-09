/*
class A{
	 int x=10;
}
class Test22 extends A{
	public static void main(String as[])
	{
		System.out.println(super.x);
	}
}

class A{int x=99;}
class B extends A{String x="JLC";}
class C extends B{float x=11.1F;}
class Test23{
	public static void main(String as[]){
		C ref=new C();
		ref.x=98;
		System.out.println(ref.x);
	}
}

class A{
	int x=99;
}
class B extends A{
	String x="Jlc";


	void show(){
		System.out.println(super.x);
	}
}	
class Test25{
	public static void main(String as[])
	{
		B ref=new B();
		ref.super.x=9090;
		ref.show();
	}

}

class A{

	A(int a){
		System.out.println("A Par C");
	}
}
class B extends A{
	B(){
		super(10);
		System.out.println("B Def C");
	}
}
class Test26{
	public static void main(String as[])
	{
		B ref=new B();
	}
}

class A extends Object{
	A(){
		super(10);
	}
}
class Object{
	Object(int a){}
}
class Test28{
	public static void main(String as[])
	{
		A ref=new A();
	}
}

class A extends Object{
	A(){
		super(10);
	}
}
class Object{
	Object(int a){}
}
class Test28{
	public static void main(String as[])
	{
		A ref=new A();
	}
}

class A{
	int x;
}
class B extends A{
	String x;
}
class Test30{
	public static void main(String as[])
	{
	B ref=new B();
	ref.x="JLC";
	System.out.println(ref.x);
	}
}

class A{
	int x;
	
	int getX(){
		return x;
	}
}
class B extends A{
	String x;
	void setX(String x){
		this.x=x;
	}
}
class Test32{
	public static void main(String as[])
	{
		B ref=new B();
		ref.setX("jlc");
		System.out.println(ref.getX());
	}
}
*/
class A{
	static int x;
}
class B extends A{
	void show(){
		System.out.println(super.x);
	}
}
class Test35{
	public static void main(String as[])
	{
		B r1=new B();
		B r2=new B();
		r1.x=99;
		r2.x=88;
		r1.show();
		r2.show();
	}
}