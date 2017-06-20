package number;

import java.util.Scanner;

public class Count {
	public static void main(String[] args){
		int count=0;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number to count:");
		int num=x.nextInt();
		if(num==0)
			System.out.println("Count is 1");
		while(num>0){
			num=num/10;
			count++;
		}
		System.out.println("The count of the given number is:" + count);
	}
}
