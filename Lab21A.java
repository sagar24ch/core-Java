/*
class Hello{
	int a;
	int b=20;
	void show()
	{
		System.out.println("a:"+a);
		System.out.println("b:="+b);
	}
}

class Lab248{
	public static void main(String as[])
	{
		Hello h1=new Hello();
		h1.show();
		h1.a=10;
		h1.show();
		
		Hello h2=new Hello();
		h2.show();
		
		//h2.a=100;
		//h2.b=200;
		//h2.show();
	}
}
*/
class Customer{
	int cid;
	String cname;
	String email;
	long phone;
	
	void show()
	{
		System.out.println(cid+"\t"+cname+"\t"+email+"\t"+phone);
	}
}
class Lab249
{
	public static void main(String as[])
	{
		Customer cust1=new Customer();
		cust1.show();
		
		cust1.cid=101;
		cust1.cname="sagar";
		cust1.email="Sa@gmail.com";
		cust1.phone=12345;
		cust1.show();
		
		Customer cust2=new Customer();
		cust2.show();
		cust2.cid=102;
		cust2.cname="sanam";
		cust2.email="san@gmail.com";
		cust2.phone=543321;
		
		cust2.show();
	}
}