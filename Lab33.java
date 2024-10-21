			/*Super keyword --a reference variable contains reference of immediate super class members
			can not accesed from static context since it is a instance ref var*/
/*			
class Hai{
	int a=10;
}			
class Hello extends Hai{
	int a=20;
	void show(){
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
class Lab407{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}

class Hai{
	static int a=10;
}
class Hello extends Hai{
	static int a=20;
	void show(){
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
class Lab408{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}

class Hai{
	static int a=10;
}
class Hello extends Hai{
	static int a=20;
	void show(){
		int a=30;
		System.out.println(a);
		System.out.println(Hello.a);
		System.out.println(Hai.a);
	}
}
class Lab409{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}

class Hello{
	void m1(){
		System.out.println("Hello-m1()");
	}
	void show()
	{
		System.out.println("show-begin");
		m1();
		this.m1();
		System.out.println("show-end");
		
	}
}
class Lab410{
	static public void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}

class Hai{
	int a=10;
	void m1(){
		System.out.println("Hai-m1()");
	}
}
class Hello extends Hai{
	void m1(){
		System.out.println("Hello-m1()");
	}
	void show(){
		System.out.println("Show() begin");
		System.out.println(a);
		m1();
		this.m1();
		super.m1();
		System.out.println("show end");
	}
}
class Lab411{
	static public void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}

class Hai{
	Hai(int a){
		System.out.println("Hai-1 arg");
	}
}
class Hello extends Hai{
	Hello(){
		System.out.println("Hello-0arg");
	}
}
class Lab412{
	static public void main(String as[])
	{
	new Hello();
	}
}

class Hai{
	Hai(int a){
		System.out.println("Hai 1 arg cons");
	}
}
class Hello extends Hai{
	Hello(){
		super(10);
		System.out.println("Hello 0 arg cons");
	}
}
class Lab413{
	public static void main(String as[])
	{
		new Hello();
	}
}

class Hai{
	Hai(int a){
		System.out.println("Hai-1 arg ");
	}
}
class Hello extends Hai{
	Hello(){
		System.out.println("0 arg");
		super(10);
	}
}
class Lab414{
	static public void main(String as[])
	{
		new Hello();
	}
}
// error: call to super must be first statement in constructor

class A{
	int a;
	A(){
		System.out.println("A-0 arg cons");
	}
	A(int a)
	{
		System.out.println("A-1 arg");
		this.a=a;
	}
}
class B extends A{
	int b;
	B(){
		System.out.println("B-0 arg");
	}
	B(int a, int b){
		System.out.println("B-2 arg");
		this.b=b;
	}
}
class C extends B{
	int c;
	C(){
		System.out.println("C-0 arg");
	}
	C(int a,int b, int c){
		System.out.println("C-3 arg");
		this.c=c;
	}
	void show()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class Lab415{
	public static void main(String as[])
	{
		C co1=new C(10,20,30);
		co1.show();
		C co2=new C();
		co2.show();
	}
}

class A{
	A(){
		System.out.println("A 0arg");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("B- 0 arg");
	}
	B(int a){
		this();
		System.out.println("B-1 arg");
	}
}
class Lab416{
	static public void main(String as[])
	{
		new B(10);
	}
}

class B{
	B(){
		this(10);
		System.out.println("B 0arg");
		}
		B(int a){
			this();
			System.out.println("B -1arg");
		}
}
class Lab417{
	static public void main(String as[])
	{
		new B(10);
	}
}
*/
class Hello{
	Hello(){
		this();
	}
}
class Lab418{
	static public void main(String as[])
	{
		new Hello();
	}
}