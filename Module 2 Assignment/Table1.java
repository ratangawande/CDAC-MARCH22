
class Table2
	{
	
		static int x = 10;
		static int y = 20;
	    static void add(){
			System.out.println("ADD....");
			
	    }
	}
class Table1
{
	  static int z = 40;
      static int v = 50;	  
	  static void mul()
	  {
		  System.out.println("Multiplication....");
	  }
	  
	     public static void main(String args[]){
			
		 int a = 10;
		 int b = 20;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("X is value of Table2:"+Table2.x);
		System.out.println("Y is value of Table2:"+Table2.y);
		System.out.println("Z:"+z);
		
		Table2.add();
		mul();
		  }
}

	


