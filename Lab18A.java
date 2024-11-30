/*
class Lab224
{
	public static void main(String as[])
	{
		int arr[]={12,30,20,50,60};
		
		System.out.println("All starting from first");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("In reverse order");
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("From 3rd element");
		for (int i=2;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("element in odd indexes");
		for (int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
	}
}

class Lab225
{
	public static void main(String as[])
	{
		int arr[]={10,20,30,40,50};
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("\n");
		
		for(int x:arr)
			System.out.println(x);
	}
}

class Lab226
{
	public static void main(String as[])
	{
		double d[]={10.1,20.2,30.3,40.4,50.5};
		
		for(int i=0;i<d.length;i++)
			System.out.println(d[i]);
		System.out.println('\n');
		
		for(double y:d)
			System.out.println(y);
	}
}

class Lab227
{
	public static void main(String as[])
	{
		String courses[]=new String[3];
		
		courses[0]="java";
		courses[1]="aws";
		courses[2]="DevOps";
		
		for(String x:courses)
		{
			System.out.println(x);
		}
	}
}
*/
class Lab228
{
	public static void main(String as[])
	{
		String courses[]={"java","Aws","dev"};
		
		for(String a:courses)
		{
			System.out.println(a);
		}
	}
}