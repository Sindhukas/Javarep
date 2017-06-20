package number;

import java.util.Scanner;

public class Vowrcon {
public static void main(String[] args){
	char ch;
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the character to check:");
	ch=x.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||
			ch=='E'||ch=='I'||ch=='O'||ch=='U')
		System.out.println("The given character is vowel");
	else
		System.out.println("The given character is consonant");
}
}
