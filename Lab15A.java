							//Array
/*
class Lab192
{
	public static void main(String as[])
	{
		int arr1[];
		double arr2[];
		System.out.println(arr1);
		System.out.println(arr2);
		
	}
}
	//error: variable d might not have been initialized(local variable).

class Lab193
{
	static int arr1[];
	static double arr2[];
	public static void main(String as[])
	{
		System.out.println(arr1);
		System.out.println(arr2);
	}
}

class Lab194
{
	static int arr1[5];
	static double arr2[5];
	public static void main(String as[])
	{
		System.out.println(arr1);
		System.out.println(arr2);
	}
}
	\\error:illegal start of type

class Lab195
{
	public static void main(String as[])
	{
		int arr[];
		arr=new int[];
		System.out.println(arr.length);
	}
}

class Lab196
{
	public static void main(String as[])
	{
		int arr1[];
		double arr2[];
		arr1=new int[3];
		arr2=new double[5];
		System.out.println(arr1.length);
		System.out.println(arr2.length);
	}
}

class Lab197
{
	public static void main(String as[])
	{
		int arr1[];
		arr1=new int[3];
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
	}
}

class Lab198
{
	public static void main(String as[])
	{
		int arr[]=new int[6];
		int n=arr.length;
		
		for (int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

class Lab199
{
	public static void main(String as[])
	{
		double arr[]=new double[6];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
*/
class Lab200
{
	public static void main(String as[])
	{
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		arr[0]=11;
		arr[1]=12;
		arr[2]=22;
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}