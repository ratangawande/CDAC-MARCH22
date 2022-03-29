// Multiplication of two matrix 
import java.util.Scanner;
class MatrixMul
{
	public static void main(String args[])
	{
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Matrix Data");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix Data");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("First Matrix");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("First Matrix");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Multiplication of two Matrix");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
				System.out.print(a[i][j]*b[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
		
		
		