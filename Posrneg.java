package number;

import java.util.Scanner;

public class Posrneg {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		if(a==0)
			System.out.println("The given number is zero");
		else if(a>0)
			System.out.println("The number is positive");
		else
			System.out.println("The number is negative");
	}

}
