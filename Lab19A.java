/*
class Lab229{
	static int arr[][];
	public static void main(String as[])
	{
		System.out.println(arr);
	}
}

class Lab230
{
	public static void main(String as[])
	{
		int arr[][];
		System.out.println(arr);
	}
}

class Lab231
{
	public static void main(String as[])
	{
		int arr[][]=new int[5][];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

	}
}

class Lab232
{
	public static void main(String as[])
	{
		int arr[][]=new int[5][2];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}

class Lab233
{
	public static void main(String as[])
	{
		int arr[][]=new int[3][3];
		
		arr[0][0]=11;	arr[0][1]=12;	arr[0][2]=13;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[0][i]);
		}
		
		arr[1][0]=21;	arr[1][1]=22;	arr[1][2]=23;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[1][i]);
		}
		
		arr[2][0]=31;	arr[2][1]=32;	arr[2][2]=33;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[2][i]);
		}
	
	}
}

class Lab234
{
	public static void main(String as[])
	{
		int arr[][]=new int[3][3];
		
		arr[0][0]=11;	arr[0][1]=12;	arr[0][2]=14;
		arr[1][0]=21;	arr[1][1]=22;	arr[1][2]=23;
		arr[2][0]=31;	arr[2][1]=32;	arr[2][2]=33;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}

class Lab235
{
	public static void main(String as[])
	{
		int arr[][]=new int[2][2];
		
		arr[0][0]=11;	arr[0][1]=22;
		arr[1][0]=33;	arr[1][1]=44;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}

class Lab236
{
	public static void main(String as[])
	{
		int arr[][]=new int[][3];
		System.out.println(arr.length);
	}
}


class Lab237
{
	public static void main(String as[])
	{
		int arr[][]=new int[3][3];
		
		arr[0][0]=11;	arr[0][1]=22;	arr[0][2]=33;
		arr[1][0]=44;	arr[1][1]=55;	arr[1][2]=66;
		arr[2][0]=77;	arr[2][1]=88;	arr[2][2]=99;
		
		for(int myarr[]:arr)
		{
			for(int x:myarr)
			{
			System.out.println(x);			
			}
		}
	}
}
*/
class Lab238
{
	public static void main(String as[])
	{
		int arr[][]=new int[3][3];
		
		arr[0][0]=11;	arr[0][1]=22;	arr[0][2]=33;
		arr[1][0]=44;	arr[1][1]=55;	arr[1][2]=66;
		arr[2][0]=77;	arr[2][1]=88;	arr[2][2]=99;
		
		for(int myarr[]:arr)
		{
			for(int x:myarr)
			{
				System.out.print(x+"\t");
			}
			System.out.println("");
		}
	}
}