package number;

import java.util.Scanner;

public class Sumfor {
	public static void main(String[] args){
		int sum=0;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number of natural number:");
		int num=x.nextInt();
		for(int i=1;i<=num;i++){
			sum=sum+i;
		}
		System.out.println("The sum of Natural Numbers are: " + sum);
	}

}
