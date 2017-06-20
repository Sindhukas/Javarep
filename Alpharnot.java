package number;

import java.util.Scanner;

public class Alpharnot {
	public static void main(String[] args){
		char ch;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the character to check:");
		ch=x.next().charAt(0);
		if((ch>='a')&&(ch<='z')||(ch>='A')&&(ch<='Z'))
			System.out.println("The given character is an Alphabet");
		else
			System.out.println("The given character is not an Alphabet");
	}
}
