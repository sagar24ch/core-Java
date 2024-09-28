/*
class Lab201
{
	public static void main(String as[])
	{
		byte b=5;
		int arr1[]=new int[b];
		System.out.println(arr1.length);
		
		short s=55;
		int arr2[]=new int[s];
		System.out.println(arr2.length);
		
		char ch='A';
		int arr3[]=new int[ch];
		System.out.println(arr3.length);
		
		int a=99;
		int arr4[]=new int[a];
		System.out.println(arr4.length);
	}
}

class Lab202
{
	public static void main(String as[])
	{
		double d=9.9;
		int arr1[]=new int[d];
		System.out.println(arr1.length);
		
		float f=5.5F;
		int arr2[]=new int[f];
		System.out.println(arr2.length);
		
		long l=99L;
		int arr3[]=new int[l];
		System.out.println(arr3.length);
	}
}

class Lab203
{
	public static void main(String as[])
	{
		int arr1[]=new int[9];
		System.out.println(arr1.length);
		
	    int arr2[]=new int[10+20/5];
		System.out.println(arr2.length);
		
		int a=9;
		int arr3[]=new int[a];
		System.out.println(arr3.length);
	}
}

class Lab204
{
	public static void main(String as[])
	{
		int arr1[]=new int[214_74_83_647];
		System.out.println(arr1.length);
		
		int arr2[]=new int[214_74_83_648];
		System.out.println(arr2.length);
		
	}
}
        //Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
		 //error: integer number too large: 2147483648

class Lab205
{
	public static void main(String as[])
	{
		int arr1[]=new int[-1];
		System.out.println(arr1.length);
	}
}

class Lab206
{
	public static void main(String as[])
	{
		int arr[]=new int[0];
		System.out.println(arr.length);
	}
}

class Lab207
{
	public static void main(String as[])
	{
		int arr[]=new int[0];
		System.out.println(arr.length);
		System.out.println(arr[0]);
	}
}

class Lab208
{
	public static void main(String as[])
	{
		int arr[]=null;
		System.out.println(arr.length);
	}
}

class Lab209
{
	public static void main(String as[])
	{
		int arr[]=null;
		System.out.println(arr[0]);
	}
}

class Lab210
{
	public static void main(String as[])
	{
		int arr[]=new int[5];
		System.out.println(arr.length);
		
		arr.length=25;
		System.out.println(arr.length);
		
	}
}


class Lab211
{
	public static void main(String as[])
	{
		int arr[]=new int[5];
		System.out.println(arr.length);
		
		arr=new int[25];
		System.out.println(arr.length);
	}
}

class Lab212A
{
	public static void main(String as[])
	{
		int arr1[]=new int[5];
		System.out.println(arr1.length);
		
		int arr2[]=arr1;
		System.out.println(arr2.length);
	}
}

class Lab212A{
	public static void main(String as[])
	{
		byte b[]=new byte[5];
		System.out.println(b.length);
		
		int a[]=b;
		System.out.println(a.length);
	}
}
	error: incompatible types: byte[] cannot be converted to int[]

class Lab213
{
	public static void main(String as[])
	{
		int arr[]=new int[5];
		System.out.println(arr);
		
		double arr1[]=new double[5];
		System.out.println(arr1);
	}
}

class Lab214
{
	public static void main(String as[])
	{
		int arr[]=new int[5];
		System.out.println(arr+1);
	}
}
	//error: incompatible types: byte[] cannot be converted to int[]

*/
class Lab215
{
	public static void main(String as[])
	{
		int myarr[]=new int[5];
		System.out.println(myarr);
		myarr=null;
		System.out.println(myarr);
	}
}