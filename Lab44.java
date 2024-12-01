/*
class Lab627{
	public static void main(String as[])
	{
		System.out.println("Main Begin");
		String str=as[0];
		int a=Integer.parseInt(str);
		int x=10/a;
		System.out.println("x="+x);
		System.out.println("Main end");
	}
}

class Lab628{
	public static void main(String as[])
	{
		System.out.println("Main begin");
		try{
			String str=as[0];
			int a=Integer.parseInt(str);
			int x=10/a;
			System.out.println("x="+x);
			System.out.println("Main end");

		}catch(Exception ex){
			System.out.println("Hey, Provide correct values");
		}
	}
}
*/
class Lab629{
	public static void main(String as[])
	{
		System.out.println("Main begin");
		try{
			String str=as[0];
			int a=Integer.parseInt(str);
			int x=10/a;
			System.out.println("x="+x);
			System.out.println("Main end");
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Hey provide input");
		}
		
	}
}