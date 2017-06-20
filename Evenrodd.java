package number;

import java.util.Scanner;

public class Evenrodd {
public static void main(String[] args){
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=x.nextInt();
	if(num%2==0)
		System.out.println("The given number is even");
	else
		System.out.println("The given number is odd");
}
}
