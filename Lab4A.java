			// Final variable (constant)

/*
class Lab11{
	public static void main(String as[])
	{
		int a=99;
		System.out.println(a);
		a=88;
		System.out.println(a);
	}
}



class Lab12{
	public static void main(String[] args)
	{
		final int A=90;
		System.out.println(A);
		A=99;
		System.out.println(A);
	}
}
*/

/*
class Lab13{
	public static void main(String args[])
	{
		final int A;
		System.out.println(A);
	}
}
//error: variable A might not have been initialized
// A is a local variable ...Jvm not initializing a local variable only stati and instance
*/

/*
class Lab14{
	public static void main(String args[])
	{
		final int A;
		A=999;
		System.out.println(A);
	}
}
*/


/*
class Lab15{
	public static void main(String as[])
	{
		final int A;
		A=90;
		System.out.println(A);
		A=99;			error -variable A might already have been assigned
		System.out.println(A);
	}
}
*/


/*class Lab16{
	public static void main(String[] as)
	{
		const int a=99;
		System.out.println(a);
	}
}
 error: illegal start of expression const
*/

/*
class Lab17
{
	public static void main(String[] as)
	{
		final int A=90;
		System.out.println(A);
		System.out.println(A+9);
	}
} 


class Hello{
	final int A;
	final static int B;
	
	void show()
	{
		A=90;
		B=99;
		System.out.println(A);
		System.out.println(B);
		final int c;
		c=77;
		System.out.println(c);
	}
}
class Lab18{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}
//error


class Hello{
	final int A=90;
	final static int B=80;
	void show()
	{
		System.out.println(A);
		System.out.println(B);
	}
}
class Lab19
{
	public static void main(String as[])
	{
		Hello h=new Hello();
		h.show();
	}
}


class Lab20
{
	public static void main(String as[])
	{
		int a,b,c;
		a=10=c=99;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
//Error.. unexpected type 
