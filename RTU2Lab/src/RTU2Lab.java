import java.util.Random;
import java.util.Scanner;

public class RTU2Lab {

	public static void main(String[] args) {
		//1st
		int a,max=0, odd=0, even=0, randomValue;
		Scanner in = new Scanner(System.in);
		boolean flag = false;
		
		System.out.println("Starting first part");
		while(flag == false) {
			System.out.println("Enter number");
			a = in.nextInt();
			if (max<a) { 
				max=a; 
				}
			System.out.println("Max =" + max + "\n");
			if (a==0) {
				flag = true; 
			}
		}
		System.out.println("GoodBye 1st part");
		//2nd part
		System.out.println("Starting second part");
		flag=false;
		while(flag == false) {
			System.out.println("Enter number");
			a = in.nextInt();
			if (a%2==1) { 
				odd++; 
				} else { 
				even++; 
				}
			
			
			System.out.println("Odd count =" + odd + " Even count = " + even + "\n");
			if (a==0) {
				flag = true; 
				}
		}
		
		System.out.println("GoodBye 2nd part");
		//3rd part
		System.out.println("Starting third part");
		flag=false;
		Random r = new Random();
		int Low = 10;
		int High = 100;
		int Result = r.nextInt(High-Low) + Low;
		
		
		while(flag == false) {
			System.out.println("Enter number");
			a = in.nextInt();
			
				if (a>Result) {
					System.out.println("Value too high");
				} else {
					System.out.println("Value too low");
				}
				
				if (a==Result) {
					flag = true; 
					System.out.println("Congrats, you won");
				}
			}
		
		System.out.println("GoodBye, hope to see you again");
		
	}

}
