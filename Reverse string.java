import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        String str = "Dinky is going to update codes ";
        String rev_str = reverseString(str);
        System.out.println("The reversed string is : "+rev_str);
        
    }
    public static String reverseString(String str){
        if(str.isEmpty())
            return str;
      
        return reverseString(str.substring(1)) + str.charAt(0);
        
    }
    
}