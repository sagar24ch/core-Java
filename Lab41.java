/*
class Lab581{
	public static void main(String as[])
	{
		String s1="JLC";
		String s2=new String("JLC");
		System.out.println(s1==s2);
		
		//StringBuilder sb1="jlc";
		
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder("Jlc123");
		StringBuilder sb3=new StringBuilder("jlc");
		System.out.println(sb2==sb3);
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
	}
}

class Lab582
{
	public static void main(String as[])
	{
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		StringBuilder sb2=new StringBuilder("Hello");
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		sb2.append(" Guys");
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		sb2.append(" 11234567899");
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		sb2.trimToSize();
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
	}
}

class Lab583
{
	public static void main(String as[])
	{
		StringBuilder sb1=new StringBuilder(25);
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.append("Hello Guys");
		sb1.append( true);
		sb1.append( 9.9);
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.insert(6,"indian ");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		StringBuilder sb2=new StringBuilder(5);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		sb1.insert(10,"true");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}
}

class Lab584{
	public static void main(String as[])
	{
		StringBuilder sb=new StringBuilder("Hello JLC Guys!!!");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.deleteCharAt(15);
		sb.deleteCharAt(15);
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.delete(9,15);
		System.out.println(sb);
		System.out.println(sb.length());
	}
}

class Lab585{
	public static void main(String as[])
	{
		StringBuilder sb= new StringBuilder("Hello Hai Guys!!!");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.replace(6,9,"JLC");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.replace(5,6,"jj");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		}
}

class Lab586{
	public static void main(String as[])
	{
		StringBuilder sb1=new StringBuilder("JLC");
		StringBuilder sb2=new StringBuilder("JLC");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		//Option 1
		String s1=sb1.toString();
		String s2=sb2.toString();
		System.out.println(s1.equals(s2));
		
		//Option2
		String s=sb1.toString();
		System.out.println(s.contentEquals(sb2));
	}
}
*/
class Lab587
{
	public static void main(String as[])
	{
		StringBuilder sb1=new StringBuilder("JLC");
		
		System.out.println(sb1.hashCode());
		
		StringBuilder sb2=new StringBuilder("JLC");
		
		System.out.println(sb2.hashCode());
	}
}