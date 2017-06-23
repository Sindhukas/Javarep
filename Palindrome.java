package number;

public class Palindrome {
	public static void main(String[] args){
		int n=235;
		int a,temp;
		int sum=0;
		temp=n;
		while(n>0){
			a=n%10;
			n=n/10;
			sum=(sum*10)+a;
		}
		if(temp==sum)
			System.out.println("It is Palindrome");
		else
			System.out.println("It is  not Palindrome");
	}
}
