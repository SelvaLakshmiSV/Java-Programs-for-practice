import java.util.*;
public class Main{
    public static void main(String args[]){
         int num,reverse = 0;
         System.out.println("Enter the number ");
         Scanner sc = new Scanner(System.in);
         num = sc.nextInt();
         while(num   != 0){
             int rem = num % 10;
             reverse = reverse * 10 + rem;
             num /= 10;
             
         }
         System.out.println("REverse Number is "+ reverse);
         
    }
    
}
