				//Overriding
/*
class Hai{
	public void m1()
	{
		System.out.println("HAi-m1()");
	}
}
class Hello extends Hai{
	public void m1(){
		System.out.println("Hello m1()");
	}
}
public class Lab449{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	public void m1(){
		System.out.println("Hai-m1()");
	}
}
class Hello extends Hai{
	void m1(){
		System.out.println("Hello -m1()");
	}
}
class Lab450A{
	public static void maia(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	 protected void m1()
	 {
		 System.out.println("Hai-m1()");
	 }
}
class Hello extends Hai{
	protected void m1()
	{
		System.out.println("Hello -m1()");
	}
}
class Lab451{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	protected void m1(){
		System.out.println("Hai-m1()");
	}
}
class Hello extends Hai{
	public void m1(){
		System.out.println("Hello -m1()");
	}
}
class Lab452{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	protected void m1(){
		System.out.println("HAi-m1()");
	}
}
class Hello extends Hai{
	void m1(){
		System.out.println("Hello-m1()");
	}
}
class Lab453{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	void m1(){
		System.out.println("HAi-m1()");
	}
}
class Hello extends Hai{
	void m1(){
		System.out.println("Hello-m1()");
	}
}
class Lab454
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	void m1(){
		System.out.println("HAi-m1()");
	}
}
class Hello extends Hai{
	public void m1(){
		System.out.println("Hello-m1()");
	}
}
class Lab455
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	void m1(){
		System.out.println("HAi-m1()");
	}
}
class Hello extends Hai{
	private void m1(){
		System.out.println("Hello-m1()");
	}
}
class Lab456
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	private void m1(){
		System.out.println("Hai-m1()");
	}
}
class Hello extends Hai{
	void m1()
	{
		System.out.println("Hello-m1()");
	}
}
class Lab457{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	void m1(){
		System.out.println("HAi-m1()");
	}
}
class Hello extends Hai{
	void m1(){
		System.out.println("Hello -m1()");
	}
}
class Lab458{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	void m1(){
		System.out.println("Hai-m1()");
	}
}
class Hello extends Hai{
	static void m1(){
		System.out.println("Hello-m1()");
	}
}
class Lab458{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	static void m1(){
		System.out.println("Hai-m1()");
	}
}
class Hello extends Hai{
	static void m1(){
		System.out.println("Hello-m1()");
	}
}
class Lab460{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}

class Hai{
	static void m1(){
		System.out.println("Hai-m1()");
	}
}
class Hello extends Hai{
void m1(){
	System.out.println("Hello-m1()");
}
}
class Lab461{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.m1();
	}
}
*/
					//Dynamic dispatch---process of assigning sub class object to super class reference variable
								// Hai hai=new Hello();
					//if overridden method is static super class method will be execute and if instance sub class method will extends

/*class Hai{
	void m1(){
		System.out.println("Hai-m1()");
	}
}
class Hello extends Hai{
	void m1(){
		System.out.println("Hello-m1()");
	}
}
class Lab462{
	public static void main(String as[])
	{
		Hai hai=new Hello();
		hai.m1();
	}
}
*/
class Hai{
	 static void m1(){
		System.out.println("Hai-m1()");
	}
}
class Hello extends Hai{
	 static void m1(){
		System.out.println("Hello-m1()");
	}
}
class Lab463{
	public static void main(String as[])
	{
		Hai hai=new Hello();
		hai.m1();
	}
	
}