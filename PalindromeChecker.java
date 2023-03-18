import java.util.Scanner;
public class PalindromeChecker{
	public static void main(String[] args){
	System.out.println("Enter a number");
	//take input of a num
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	int OriginalNum = num;
	//check whether it's palindrome
	int ReverseNum=0;
	while(num!=0){
			int newNum=num%10;
			ReverseNum=ReverseNum*10 + newNum;
			num=num/10;
	}
	//System.out.println(ReverseNum);
	//System.out.println(num);
	if(ReverseNum == OriginalNum){
		System.out.println("The entered number is a Palindrome");
	}
	else{
		System.out.println("The entered number is not a Palindrome");
	}
	}
}