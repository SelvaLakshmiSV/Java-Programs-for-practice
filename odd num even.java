/*ODD OR EVEN*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int num;
	    System.out.println("Enter an Integer number :");
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    if(num % 2 == 0)
	         System.out.println("Even number");
	    else
	         System.out.println("Odd number");
   }
}
