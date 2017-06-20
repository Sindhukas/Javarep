package number;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args){
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=x.nextInt();
	if(num%4==0)
		System.out.println("The given year is leap year");
	else
		System.out.println("The given year is not a leap year");
}
}
