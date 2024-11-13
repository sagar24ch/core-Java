class Lab558{
	public static void main(String as[])
	{
		String s1="Srinivas";
		
		String s2=s1.replace('i','I');  //replace all i
		System.out.println(s2);
		
		String s3=s1.replace('n','N');
		System.out.println(s3);
		
		String s4=s1.replace("ni","Hello");
		System.out.println(s4);
		
		String s5=s1.replace("Hello","ni");
		System.out.println(s5);
	}
}

class Lab559{
	public static void main(String as[])
	{
		String s1="srinivas";
		
		String s2=s1.replace('n','s');
		System.out.println(s1);
		
		String s3=s1.replaceFirst("i","I");
		System.out.println(s3);
		
		String s4=s1.replaceAll("s","S");
		System.out.println(s4);
	}
}

class Lab560
{
	public static void main(String as[])
	{
		String s1="Srinivas";
		
		char chArr[]=s1.toCharArray();
		for(char ch:chArr)
		{
			System.out.println(ch);
		}
		byte byArr[]=s1.getBytes();
		for(byte by:byArr)
			System.out.println(by);
	}
}

class Lab561{
	public static void main(String as[])
	{
		String s1="Srinivas";
		
		char destArr[]=new char[10];
		destArr[0]='j';
		destArr[1]='l';
		destArr[2]='c';
		
		s1.getChars(5,8,destArr,4);
		for(char ch:destArr)
		{
			System.out.println(ch);
		}
	}
}

class Lab562{
	public static void main(String as[])
	{
		String s="srinivas";
		
		byte destArr[]=new byte[10];
		destArr[0]=65;
		destArr[1]=66;
		
		s.getBytes(0,3,destArr,3);
		for(byte by:destArr)
			System.out.println(by);
		}
}

class Lab563
{
	public static void main(String as[])
	{
		String s="Hello Guys How are you Guys";
		
		String strArr1[]=s.split(" ");
		System.out.println(strArr1.length);
		for(String x:strArr1)
			System.out.println(x);
		
		String strArr2[]=s.split(" ",3);
		System.out.println(strArr2.length);
		for(String x:strArr2)
			System.out.println(x);
		
	}
}
*/
class Lab564{
	public static void main(String as[])
	{
		String s="Hello Guys How are you Guys ok ok";
		
		String strArr[]=s.split("Guys");
		System.out.println(strArr.length);
		for(String x:strArr)
		{
			System.out.println(x);
		}
	}
}
output:-
3
Hello
 How are you
 ok ok