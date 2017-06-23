package number;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args){
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		for(int i=2;i<num;i++){
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("it is prime");	
		else
			System.out.println("it is not prime");
	}
}	
