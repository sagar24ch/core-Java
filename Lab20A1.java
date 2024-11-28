/*
class Lab239
{
	public static void main(String as[])
	{
		int arr[][]={{11,22,33},{12,13,14},{15,16,17}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("----------------");
		
		for(int myarr[]:arr)
		{
			for(int x:myarr)
			{
				System.out.println(x);
			}
		}
	}
}

class Lab240
{
	public static void main(String as[])
	{
		int arr[][]={{11,22,33},{44,55,66},{77,88,99}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("---------------");
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

class Lab241
{
	public static void main(String as[])
	{
		int temp[]={11,22,33,44,55};
		int arr[][]=new int[3][];
		System.out.println("Length="+arr.length);
		
		arr[0]=new int[6];
		arr[1]=new int[]{12,23,34};
		arr[2]=temp;
		
		System.out.println("-------------");
		
		for(int myarr[]:arr)
		{
			for(int x:myarr)
			{
				System.out.println(x+"\t");
			}
			System.out.println("");
		}
	}
}

class Lab242
{
	public static void main(String as[])
	{
		int arr[][]={{10,20,30,40,50},{99,999},{12,23,34,},{21,31,41,51,61,611},{1,2,3,4,5,6,7,8,9,}};
		
		System.out.println("length="+arr.length);
		
		System.out.println("------------------");
		
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

class Lab243
{
	public static void main(String as[])
	{
		int arr[][][]=new int[2][2][2];
		
		arr[0][0][0]=10;
		arr[0][0][1]=20;
		
		arr[0][1][0]=30;
		arr[0][1][1]=40;
		
		arr[1][0][0]=50;
		arr[1][0][1]=60;
		
		arr[1][1][0]=70;
		arr[1][1][1]=80;
		
		System.out.println("length="+arr.length);
		
		for(int myarr[][]:arr)
		{
			for(int myarr2[]:myarr)
			{
				for(int x:myarr2)
				{
					System.out.print(x+"\t");
				}
				System.out.println("");
			}
			System.out.println("--------------------");
		}
	}
}

class Lab244
{
	public static void main(String as[])
	{
		int arr[][][]=new int[2][2][2];
		
		 arr[0][0][0]=1;	arr[0][0][1]=2;
		 arr[0][1][0]=3;	arr[0][1][1]=4;
		 arr[1][0][0]=5;	arr[1][0][1]=6;
		 arr[1][1][0]=7;	arr[1][1][1]=8;
		 
		 System.out.println("Length="+arr.length);
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;j++)
			 {
				 for(int k=0;k<arr[i][j].length;k++)
				 {
					 System.out.print(arr[i][j][k]+"\t");
				 }					 
				 System.out.println("");
			 }
		 }
		 
	}
}

class Lab245
{
	public static void main(String as[])
	{
		int arr[][][]={
						{{10,20},{20,30}},
						{{40,50},{60,70}}
						};
						
		for(int myarr[][]:arr)
		{
			for(int myar[]:myarr)
			{
				for(int mya:myar)
				{
					System.out.print(mya+"\t");
				}
				System.out.println("");
			}
		}
						
	}
}

class Lab246
{
	public static void main(String as[])
	{
		int arr[][][]=new int[][][];
		System.out.println(arr.length);
	}
}
				// CLA(command line arguments)
class Lab247A
{
	public static void main(String args[])
	{
		System.out.println("size="+args.length);
		for(String x:args)
		{
			System.out.println(x);
		}
	}
}
*/
class Lab247{
	public static void main(String args[])
	{
		if(args.length>=2){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int sum=a+b;
		
		System.out.println("Sum="+sum);
		}
		else
		{
			System.out.println("please provide 2 command line arguments");
		}
	}
}