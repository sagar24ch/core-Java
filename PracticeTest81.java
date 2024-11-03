/*
class Test1
{
	public static void main(String as[])
	{
		Hello h=new Hello();
	}
}
class Hello{
	int a;
	Hello(){
		System.out.println("Hello class");
	}
}

class Test2{
	public static void main(String as[])
	{
		Hello h=new Hello();
	}
}
class Hello{
	int a;
	void Hello(){
		System.out.println("Hello cons");
	}
}

class Test3
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		
	}
}
class Hello{
	int a;
	Hello(){
		System.out.println("Hello cons");
		return;
	}
}

class Test4{
	public static void main(String as[])
	{
		Hello h=new Hello(10);
		System.out.println(h.a);
	}
}
class Hello{
	int a;
	Hello(int a){
		System.out.println("Hello cons");
		this.a=a;
		return;
	}
}


class Test5{
	public static void main(String as[])
	{
		Hello h=new Hello(10);
		System.out.println(h.a);
	}
}
class Hello{
	int a;
	Hello(int a){
		System.out.println("Hello cons");
		a=a;
		return;
	}
}

class Test6{
	public static void main(String as[])
	{
		Hello h=new Hello();
	}
}
class Hello{
	int a;
	Hello(int a){
		System.out.println("Hello cons");
	}
}

class Test7{
	public static void main(String as[])
	{
	Hello h=new Hello(10);
	}
}
class Hello{
	int a;
	Hello(int a){
		this();
		System.out.println("Hello Cons");
	}
}

class Test8{
	public static void main(String as[]){
		Hello h=new Hello();
	}
}
class Hello{
	int a;
	Hello(){
		this(10);
	}
	Hello(int a){
		System.out.println("Hello cons");
	}
}

class Test9{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.Hello(10);
	}
}
class Hello{
	int a;
	Hello(){
		System.out.println("Hello cons");
		
	}
	void Hello(int a){
		System.out.println("void Hello cons");
	}
}

class Test10{
	public static void main(String as[])
	{
		Hello h=new Hello(12);
	}
}
class Hello{
	int a=10;
	Hello(int a){
		System.out.println(a);
		System.out.println(this.a);
	}
}

class Test11{
	public static void main(String as[])
	{
		Hello h=new Hello(12);
		System.out.println("OK");
	}
}
class Hello{
	Hello(int a){
		System.out.println(this.a);
	}
}

class Test12{
	public static void main(String as[])
	{
		Hello h=new Hello(12);
	}
}
class Hello{
	Hello(){
		System.out.println("Hello 1");
	}
	Hello(int a){
		Hello();
		System.out.println("Hello 2");
	}
}
*/
class Test13{
	public static void main(String as[]){
		System.out.println(Hello.a);
	}
}
class Hello{
	static int a=10;
	Hello(){
		System.out.println("cons");
	}
	static {
		System.out.println("SB");
	}
}
