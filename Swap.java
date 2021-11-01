import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int number_1,number_2;
		System.out.println("Enter 1st number ");
		Scanner sc = new Scanner(System.in);
		number_1 = sc.nextInt();
		System.out.println("Enter the 2nd number ");
		number_2 = sc.nextInt();
	    
	    System.out.println("Before swap");
	    System.out.println("First number: "+number_1);
	    System.out.println("Second number: "+number_2);
	    
	    number_1 = number_1 - number_2;
	    number_2 = number_1 + number_2;
	    number_1 = number_2 - number_1;
	    
	    
	    System.out.println("After swap");
	    System.out.println("First number: "+number_1);
	    System.out.println("Second number: "+number_2);
		
	}
}
