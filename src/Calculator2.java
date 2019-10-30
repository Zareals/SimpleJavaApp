import java.util.Scanner;

public class Calculator2 {
	public static void main ( String [] args )
	{
		int x,y;
		
		
		System.out.println("Give me a first Number : ");
		Scanner type = new Scanner(System.in);
		x = type.nextInt();
		System.out.println("Give me the second Number : ");
		y = type.nextInt();
		System.out.println("op");
		String op = type.next();
		
		if(op.equals("+"))
		{
			System.out.println(x + y);
		}
		if(op.equals("-"))
		{
			System.out.println(x - y);
		}
		if(op.equals("*"))
		{
			System.out.println(x * y);
		}
		if(op.equals("/"))
		{
			System.out.println(x / y);
		}
		
	}

}
