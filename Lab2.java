			// delcaring and initializing variables (instance,static,local)

/*class Lab3{
	public static void main(String[] as)
	{
		int a;
		System.out.println(a);
	}
}   */
//ERROR- variable a might not have been initialized
/* int a declared inside main method so it is a local variable ...
   local variable will not be initialized by JVM 
   we have to initialize it before use*/
   
/*

	//Instance and Static variables are initialized by JVM with default value
class Lab4{
	static int a;
	public static void main (String[] as)
	{
		System.out.println(a);
	}
}   
  */
  
class Lab5{
	int a;
	public static void main(String[] args)
	{
		System.out.println(a);
	}
}  

//ERROR--non-static variable a cannot be referenced from a static context
