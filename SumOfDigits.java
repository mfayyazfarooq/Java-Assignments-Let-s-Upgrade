import java.util.Scanner;
public class SumOfDigits{
	public static void main(String[] args){
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int SumOfDigits = 0;
		while(num!=0){
			int digit= num%10;
			SumOfDigits = SumOfDigits + digit;
			num = num/10;
		}
		System.out.println(SumOfDigits);
	}
	}