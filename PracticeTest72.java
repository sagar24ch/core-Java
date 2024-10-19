/*
class Test21{
	public static void main(String as[])
	{
		Student st=new Student();
		System.out.println(st.fee);
	}
}
class Student{
	final float fee;
}

class Test22{
	public static void main(String as[])
	{
		Student st=new Student();
		System.out.println(st.fee);
	}
}
class Student{
	final float fee;
	{
		fee=1000;
	}
}

class Test23{
	public static void main(String as[])
	{
		Student st=new Student();
		System.out.println(st.fee);
	}
}
class Student{
	final float fee;
	{
		fee=1000;
	}
	{
		fee=2000;
	}
}


class Test24{
	public static void main(String as[]){
		int ab=10;
		System.out.println(ab);
	}
	{
		System.out.println(ab);
	}
}

class Test25{
	public static void main(String as[])
	{
		int ab=90;
		System.out.println(ab);
		{
			System.out.println(ab);
		}
	}
}

class Test26
{
	public static void main(String as[])
	{
		{
		int ab=90;
		System.out.println(ab);
		}
		String ab="AB";
		System.out.println(ab);
	}
}

class Test27{
	public static void main(String as[])
	{
		{
		int ab=90;
		{
		    System.out.println(ab);
		}
		}
		String ab="Ab";
		System.out.println(ab);
	}
}

class Test28
{
	public static void main(String as[])
	{
		int ab=90;
		System.out.println(ab);
		{
			String ab="AB";
			System.out.println(ab)
		}
	}
}

class Test29
{
	static int ab=90;
	static{
		int ab=10;
				System.out.println(ab);

	}
	public static void main(String as[])
	{
		
		System.out.println(ab);
		
	}
}

class Test30
{
	static int ab=90;
	static {
		ab=10;
				System.out.println(ab);

	}
	public static void main(String as[])
	{
		
		System.out.println(ab);
		
	}
}

class Test31
{
	static int ab=90;
	{
	ab=10;
				System.out.println(ab);

	}
	public static void main(String as[])
	{
		
		System.out.println(ab);
		
	}
}

class Test32{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}
class Hello{
	void show(){
		this=null;
	}
}

class Test33{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}
class Hello{
	int a;
	void show()
	{
		System.out.println(Hello.this.a);
	}
}
*/
class Test34
{
	public static void main(String as[])
	{
		System.out.println(Hello.a);
	}
}
class Hello{
	static int a=10;
	static Hello h=new Hello();
	{
		System.out.println("IB");
		
	}
	static{
		System.out.println("SB");
	}
}