/*
class Lab541
{
	public static void main(String as[])
	{
		String s1="Sagar";
		String s2="";
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
	}
}


class Lab542
{
	public static void main(String as[])
	{
		String s1="SriNiVas";
		String s2="SaGar";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
	}
}

    //valueOf() method to change primitive data into string(since String s1=99;  .....incompatible type)

class Lab543
{
	public static void main(String as[])
	{
		//String s=99;
		
		String s1=String.valueOf(99);
		System.out.println(s1);
		
		String s2=String.valueOf(99.9);
		System.out.println(s2);
		
		String s3=String.valueOf(true);
		System.out.println(s3);
		
		String s4=String.valueOf(999L);
		System.out.println(s4);
		String s5= String.valueOf('A');
		System.out.println(s5);
	}
}	

class Lab544
{
	public static void main(String as[])
	{
		char chArr[]={'S','R','I','N','I','V','A','S',' ','D'};
		
		String s1=String.valueOf(chArr);
		System.out.println(s1);
		
		String s2=String.valueOf(chArr,3,5);
		System.out.println(s2);
		
	}
}

class Customer{
	public String toString(){
		return "I am Customer";
	}
}
class Account{}

class Lab545{
	public static void main(String as[])
	{
		Customer cust=new Customer();
		Account acc=new Account();
		String s1=String.valueOf(cust);
		System.out.println(s1);
		
		String s2=String.valueOf(acc);
		System.out.println(s2);
	}
}

class Lab546
{
	public static void main(String as[])
	{
		String s1=String.valueOf(null);
		System.out.println(s1);
	}
}


class Lab547
{
	public static void main(String as[])
	{
		Hello hello=null;
		String s2=String.valueOf(hello);
		System.out.println(s2);
	}
}

class Lab548
{
	public static void main(String as[])
	{
		String s="Hello Guys";
		
		boolean b1=s.startsWith("Hello");
		System.out.println(b1);
		
		b1=s.startsWith("Hai");
		System.out.println(b1);
		
		b1=s.startsWith("Guys",6);
		System.out.println(b1);
		
		b1=s.startsWith("Hello",5);
		System.out.println(b1);
	}
}

class Lab549
{
	public static void main(String as[])
	{
		String s="Hello Guys";
		
		boolean b=s.endsWith("Hello");
		System.out.println(b);
		
		b=s.endsWith("Guys");
		System.out.println(b);
		
		b=s.endsWith("ys");
		System.out.println(b);
		
		b=s.endsWith("s");
		System.out.println(b);
	}
}
*/
class Lab550
{
	public static void main(String as[])
	{
		String s="Hello Guys";
		
		boolean b=s.startsWith("");
		System.out.println(b);
		
		 b=s.endsWith("");
		System.out.println(b);
	}
}