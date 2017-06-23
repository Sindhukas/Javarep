package number;

import java.util.Scanner;

public class Great {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x=s.nextInt();
		System.out.println("Enter the second number:");
		int y=s.nextInt();
		System.out.println("Enter the third number:");
		int z=s.nextInt();
		if((x>y)&&(x>z))
			System.out.println( x + " is greater");
		else if((y>x)&&(y>z))
			System.out.println( y + " is greater");
		else
			System.out.println( z + " is greater");
	}
}
