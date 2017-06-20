package number;

import java.util.Scanner;

public class LargeNum {
public static void main(String[] args){
	int a,b,c;
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the first number:");
	a=x.nextInt();
	System.out.println("Enter the second number:");
	b=x.nextInt();
	System.out.println("Enter the third number:");
	c=x.nextInt();
	if((a>b)&&(a>c))
		System.out.println("First number is greater");
	else if((b>a)&&(b>c))
		System.out.println("Second number is greater");
	else
		System.out.println("Third number is greater");
}
}
