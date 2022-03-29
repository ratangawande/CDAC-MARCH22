class Stackoverflow
{
	void m1()
	{
		System.out.println("Welcome");
		m2();
	}
	void m2()
	{
		System.out.println("How are you");
		m1();
	}
	
	public static void main(String args[])
	{
		Stackoverflow s = new Stackoverflow();
		s.m1();
		s.m2();
	}
}
	