/*
class Test1{
	public static void main(String as[])
	{
		Student st=new Student();
		System.out.println(st.sname);
	}
}
class Student{
	String sname;
}

class Test2{
	public static void main(String as[])
	{
		Student st = new Student();
		st.sname="sagar";
		System.out.println(st.sname);
	}
}
class Student{
	String sname;
}

class Test3{
	public static void main(String as[])
	{
		Student st1=new Student();
		Student st2=new Student();
		st1.sname="sagar";
		System.out.println(st1.sname+"\t"+st2.sname);
	}
}
class Student{
	static String sname;
}

class Test4{
	public static void main(String as[])
	{
		Student st=null;
		st.sname="sagar";
		System.out.println(st.sname);
	}
}
class Student {
	String sname;
}

class Student {
	static String sname;
}
class Test5{
	public static void main(String as[])
	{
		Student st=null;
		st.sname="sagar";
		System.out.println(st.sname);
	}
}

class Student{
	String name;
}
class Test6{
	public static void main(String as[])
	{
		System.out.println(new Student().name="sagar");
		System.out.println(new Student().name);
	}
}

class Student{
	static String name;
}
class Test7{
	public static void main(String as[])
	{
		System.out.println(new Student().name="sahgar");
		System.out.println(new Student().name);
	}
}


class Test8{
	public static void main(String as[])
	{
		String email=null;
		email="Sg@gmail.com";
		System.out.println(email);
	}
} 

class Test9{
	static String email=null;
	//email="sag@gmail.com";
	public static void main(String as[])
	{
		System.out.println(email);
	}
}

class Test10{
	static String email=null;
	{
		email="sagar@gmail.com";
	}
	
	public static void main(String as[])
	{
		System.out.println(email);
	}
}

class Test11{
	public static void main(String as[])
	{
		System.out.println(email);
	}
	static String email=null;
	static {
		email="sa@gmail.com";
	}
}

class Test12{
	public static void main(String as[])
	{
		System.out.println(email);
		new Test();
		System.out.println(email);
	}
	static String email=null;
	{
		email="sri@gmail.com";
	}
}

class Test13
{
	public static void main(String as[])
	{
		Student st=null;
		System.out.println("Main");
	}
}
class Student{
	static {
		System.out.println("St block");
	}
}

class Test14{
	public static void main(String as[])
	{
		new Student();
		new Student();
		System.out.println("Main");
	}
}
class Student{
	static {
		System.out.println("block");
	}
}

class Test15{
	public static void main(String as[])
	{
		new Student();
		new Student();
		System.out.println("Main");
	}
}
class Student{
	{
		System.out.println("Block");
	}
}

class Test16{
{
	System.out.println("Block1");
}
public static void main(String as[])
{
	System.out.println("MAin");
}
}

class Test17{
	static{
		System.out.println("Block1");
	}
	public static void main(String ass[])
	{
		System.out.println("Main");
	}
}

class Test18{
	public static void main(String as[])
	{
		System.out.println("main");
	}
	static{
		System.out.println("Block1");
	}
}

class Test19
{
	static final float f1;
	public static void main(String as[])
	{
		System.out.println(f1);
	}
}
*/
class Test20{
	static final float f1;
	{
		f1=90;
	}
	public static void main(String as[])
	{
		System.out.println(f1);
	}
}