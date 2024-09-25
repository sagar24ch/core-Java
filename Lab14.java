				//unconditional control statement ...break and continue

/*
class Lab181
{
	public static void main(String as[])
	{
		int a=10;
		if(a==10){
			System.out.println("ok");
			break;
		}
	}
}

class Lab182
{
	public static void main(String as[])
	{
		for (int i=1;i<=6;i++)
		{
			System.out.println(i);
			break;
			System.out.println("Hello");
		}
		System.out.println("outside loop");
	}
}

class Lab183
{
	public static void main(String as[])
	{
		for(int i=1;i<=6;i++)
		{
			System.out.println(i);
			if(i==3)
				break;
				System.out.println("HEllo"+i);
		}
		System.out.println("ok");
	}
	
}
*/


/*
class Lab184
{
	public static void main(String as[])
	{
		int a=10;
		if(a==10)
		{
			continue;
		}
	}
}

class Lab185
{
	public static void main(String as[])
	{
		for (int i=1;i<=6;i++)
		{
			System.out.println(i);
			continue;
			System.out.println("Hello");
		}
		System.out.println("ok");
	}
}

class Lab186
{
	public static void main(String as[])
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(i);
			if(i>=3)
				continue;
			System.out.println("Hello");
		}
		System.out.println("ok");
	}
}

class Lab187
{
	public static void main(String as[])
	{
		int p=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("sagar"+(p++));
			}
		}
		System.out.println("outside -for");
	}
}


class Lab188
{
	public static void main(String as[])
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.println(i+"---"+j);
				if (i==2)
					break;
				System.out.println("Hello");
			}
		}
		System.out.println("ok");
	}
}

class Lab189
{
	public static void main(String as[])
	{
		MyJLC:
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.println(i+"___"+j);
				if(i==2)
					break MyJLC;
				System.out.println("Hello");
			}
		}
		System.out.println("Outside for");
	}
}

class Lab190
{
	public static void main(String as[])
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.println(i+"\t"+j);
				if (i==2)
					continue;
				System.out.println("Hello");
			}
		}
		System.out.println("Outside-for");
	}
}
*/
class Lab191
{
	public static void main(String as[])
	{
		MyJLC:
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.println(i+"-----"+j);
				if(i==2)
					continue MyJLC;
				System.out.println("Hello");
			}
		}
		System.out.println("ok");
	}
}