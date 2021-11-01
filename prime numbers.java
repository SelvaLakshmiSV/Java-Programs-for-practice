import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int temp;
        boolean is_prime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        sc.close();
        for(int i = 2;i<=num/2;i++){
            temp = num % i;
            if(temp == 0){
                is_prime = false;
                break;
                
            }
        }
        if(is_prime)
           System.out.println(num + " is a prime number");
        else
           System.out.println(num+ " is not a prime number");
        
    }
    
}