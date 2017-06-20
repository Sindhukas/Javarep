package number;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		int i=1,sum=0;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number of natural number:");
		int num=x.nextInt();
		while(i<=num){
			sum=sum+i;
			i++;
		}
		System.out.println("The sum of Natural Numbers are: " + sum);
	}
}
