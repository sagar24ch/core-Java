
/*
					String class----------
					1.int hashCode()
					2.format()
					3.matches()


class Lab569{
	public static void main(String as[])
	{
		String str1="A";
		
		int hash1=str1.hashCode();
		System.out.println(hash1);
		
		String s2="AB";
		int hash2=s2.hashCode();
		System.out.println(hash2);
	}
}

class Lab570
{
	public static void main(String as[])
	{
		int a=10;
		int b=20;
		int c=a+b;
		String s1=String.format("Sum of %d and %d is %d",a,b,c);
		System.out.println(s1);
		String s2="Sum of "+a+" and "+b+" is "+c;
		System.out.println(s2);
		
	}
}

class Lab571{
	public static void main(String as[])
	{
		String exp1="[A-Z]";
		
		String s1="JLC";
		boolean b=s1.matches(exp1);
		System.out.println(b);
		
		System.out.println("J".matches(exp1));
		System.out.println("j".matches(exp1));
		System.out.println("A9".matches(exp1));
	}
}

class Lab572{
	public static void main(String as[])
	{
		String exp2="[A-Z]*";
		
		System.out.println("JLC".matches(exp2));
		System.out.println("SAGAR".matches(exp2));
		System.out.println("S".matches(exp2));
		System.out.println("".matches(exp2));
		System.out.println("jLc".matches(exp2));
		System.out.println("J44".matches(exp2));
	}
	
}

class Lab573{
	public static void main(String as[])
	{
		String exp3="[A-Za-z]*";
		
		System.out.println("Aa".matches(exp3));
		System.out.println("aA".matches(exp3));
		System.out.println("ABch".matches(exp3));
		System.out.println("A9".matches(exp3));
		System.out.println("".matches(exp3));
	}
}

class Lab574{
	public static void main(String as[])
	{
		String exp4="[A-Za-z0-9]*";
		
		System.out.println("gsagar224".matches(exp4));
		System.out.println("Sagar".matches(exp4));
		System.out.println("99".matches(exp4));
		System.out.println("".matches(exp4));
		System.out.println("9scg".matches(exp4));
		System.out.println("sgc9@".matches(exp4));
	}
}

class Lab575{
	public static void main(String as[])
	{
		String exp5="[A-Za-z0-9!@#$]*";
		
		System.out.println("scg224@".matches(exp5));
		System.out.println("Sc9$".matches(exp5));
		System.out.println("!@#".matches(exp5));
		System.out.println("".matches(exp5));
		System.out.println("9#sA".matches(exp5));
		System.out.println("Scg&9".matches(exp5));
		System.out.println("SaG@224".matches(exp5));
	}
}

//Name pattern
class Lab576
{
	public static void main(String as[])
	{
		String exp6="[A-Z][A-Za-z ]*";
		
		System.out.println("Sagar".matches(exp6));
		System.out.println("sagar".matches(exp6));
		System.out.println("".matches(exp6));
		System.out.println("Sgar gorai".matches(exp6));
		System.out.println("S ".matches(exp6));
		System.out.println("S a g a R".matches(exp6));
	}
}

//email pattern
class Lab577
{
	public static void main(String as[])
	{
		String exp7="[A-za-z0-9]*[@][A-Za-z]*[.][A-Za-z]*";
		
		System.out.println("".matches(exp7));
		System.out.println("@.".matches(exp7));
		System.out.println("sa9@9gmail.com".matches(exp7));
		System.out.println("Sa@jl.in".matches(exp7));
		System.out.println("s@s.".matches(exp7));
	}
}

class Lab578{
	public static void main(String as[])
	{
		String exp8="[a-z][a-z][a-z]*[@][a-z][a-z][a-z]*[.][a-z][a-z][a-z]*";
		
		System.out.println("sag@gmail.com".matches(exp8));
		System.out.println("Sa@g.in".matches(exp8));
		System.out.println("@.".matches(exp8));
		System.out.println("s@s.s".matches(exp8));
		System.out.println("ss@ss.ss".matches(exp8));
	}
}

//Number pattern
class Lab579
{
	public static void main(String as[])
	{
		String exp9="[6-9][0-9]*";
		
		System.out.println("".matches(exp9));
		System.out.println("6".matches(exp9));
		System.out.println("1854108690".matches(exp9));
		System.out.println("8970".matches(exp9));
		System.out.println("sa9767".matches(exp9));
	}
}
*/
class Lab580{
	public static void main(String as[])
	{
		
		String exp10="[+91-][6-9][0-9]*";
		
		System.out.println("".matches(exp10));
		System.out.println("+91-6".matches(exp10));
		System.out.println("+91-6204593974".matches(exp10));
		System.out.println("+62045".matches(exp10));
		System.out.println("9620".matches(exp10));
		System.out.println("2620".matches(exp10));
	}
}