/* Display first n prme numbers*/
import java.util.Scanner;
public class Main
{
  public static void main (String args[])
  {
    int n;
    int s = 1;
    int num = 3;
    //Capturing the value of n
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the value of n ");
      n = sc.nextInt ();
    if (n >= 1)
      {
	System.out.println ("First " + n + " prime numbers are:");
	System.out.println (2);
      }
    for (int i = 2; i <= n;)
      {
	for (int j = 2; j <= Math.sqrt (num); j++)
	 {
	    if (num % j == 0)
	      {
		     s = 0;
		break;

	      }
    }
	if (s!=0)
	  {
	    System.out.println (num);
	    i++;

	  }
	s = 1;
	num++;
      }
  }



}
