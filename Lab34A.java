/* Overriding -- process of implementing super class method in sub class with same signature
			used when we want to add new behavior in super class method	*/
/*
class Hai{
	void m1(){
		System.out.println("Hai-m1()");
	}
	void m2(){
		System.out.println("Hai-m2()");
	}
}
class Hello extends Hai{
	void m2(){
		System.out.println("Hello -m2()");
	}
	void m3(){
		System.out.println("Hello- m3()");
	}
}
class Lab438{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
		h.m2();
		h.m3();
	}
}

class Hai{
	void m1(){
		System.out.println("Hai -m1()");
	}
}
class Hello extends Hai{
	void M1(){
		System.out.println("Hello-M1()");
	}
}
class Lab439{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
		h.M1();
	}
}

class Hai{
	void m1(int a){
		System.out.println("Hai -m1 1 arg (int)");
	}
}
class Hello extends Hai{
	void m1(String s){
		System.out.println("Hello - m1(string)");
	}
}
class Lab440{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1(10);
		h.m1("sagar");
	}
}

class Hai{
	void m1(int a){
		System.out.println("Hai-m1(int)");
	}
}
class Hello extends Hai{
	int m1(int a){
		System.out.println("Hello m1(int)");
		return 9;
	}
}
class Lab441{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1(10);
	}
}

class Hai{
	long m1(int a){
		System.out.println("Hai m1(int)");
		return 9;
	}
}
class Hello extends Hai{
	long m1(int a){
		System.out.println("Hello m1(int)");
		return 9;
	}
}
class Lab442{
	public static void main(String as[])
	{
		Hello h= new Hello();
		h.m1(10);
	}
}

class Hai{
	long m1(int a){
		System.out.println("Hai- m1(int)");
		return 9;
	}
}
class Hello extends Hai{
	int m1(int a){
		System.out.println("Hello- m1(int)");
		return 9;
	}
}
class Lab443{
	public static void main(String as[])
	{
		Hello h= new Hello();
		h.m1(10);
	}
}

class A{}
class B extends A{}
class C extends B{}
class D{}
class Hai{
	B m1(){
		System.out.println("Hai-m1()");
		return new B();
	}
}
class Hello extends Hai{
	 B m1(){
		 System.out.println("Hello m1()");
		 return new B();
	 }
}
class Lab444{
	public static void main(String as[]){
	Hello h=new Hello();
	h.m1();
}
}

class A{}
class B extends A{}
class C extends B{}
class D{}
class Hai{
	 B m1(){
		 System.out.println("Hai -m1()");
		 return new B();
	 }
}
class Hello extends Hai{
	C m1(){
		System.out.println("Hello m1()");
		return new C();
	}
}
class Lab445{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class A{}
class B extends A{}
class C extends B{}

class Hai{
	B m1(){
		System.out.println("Hai m1()");
		return new B();
	}
}
class Hello extends Hai{
	A m1(){
		System.out.println("Hello m1()");
		return new A();
	}
}
class Lab446{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	final void m1(){
		System.out.println("HAi-m1()");
	}
}
class Hello extends Hai{
	void m1(){
		System.out.println("Hello-m1()");
	}
}
class Lab447{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}
*/
class Hai{
	int m1(int a){
		System.out.println("Hai-m1()");
		return 9;
	}
}
class Hello extends Hai{
	final int m1(int a){
	System.out.println("Hello-m1()");
	return 9;
	}
}
class Lab448{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1(10);
	}
}