class Printer
{
 
      static int a ;
      static int b ;
 
      int z = 10;
 
  
  static void m1()
  {
	  
	    System.out.println("Default value of static variable A:"+a);
	    System.out.println("Default value of static variable B:"+b);
		
		a= 500;
		b= 600;
		
		System.out.println("Latest value of static variable A:"+a);
	    System.out.println("Latest value of static variable B:"+b);
  }
 /* void m2()
  {
	   // p=700;
		//q=900;
	    System.out.println("Value:"+p);
	    System.out.println("Value:"+q);
  }
  */ 
}
class PrintDemo
{
	static int x ;
	static int y ;
	// instance variable are part of the object
	int p;
	int q;
	static void m3()
	{
		
	} 
	public static void main(String args[])
	{
		//Printer.m1();
		PrintDemo d = new PrintDemo();
		
		
		System.out.println("Default value of instance variable P:"+d.p);// instance variable p value is 0
	    System.out.println("Default value of instance variable Q:"+d.q);// instance variable q value is 0
		
		d.p=100;
		d.q=200;
		System.out.println("Updated value of instance variable P:"+d.p);// instance variable p value is 100
	    System.out.println("Updated value of instance variable Q:"+d.q);// instance variable q value is 200
		
		
		Printer.m1(); // static variable access through ClassName.Static methodName
		Printer.a=300;
		Printer.b=400;
		System.out.println("Updated value of instance variable A:"+Printer.a);
	    System.out.println("Updated value of instance variable B:"+Printer.b);
		
		PrintDemo d1= new PrintDemo();
		
		d1.p=800;
		d1.q=700;
		System.out.println("Latest value of instance variable P:"+d1.p);
	    System.out.println("Latest value of instance variable Q:"+d1.q);
		
		
		
		
		
		
		
	}
}

		
	
  
 