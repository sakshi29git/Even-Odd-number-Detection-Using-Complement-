import java.util.Scanner;
//class Odd_Even_using_complement used to check given number is odd or even based on its complement. 
public class Odd_Even_using_complement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Taking user input
        int num, num1;
        
        // Prompt user to input a number
        System.out.println("Enter number:");
        num = sc.nextInt();
        
        // Calculate one's complement of the input number
        num1 = ~num;
        
        // Loop to check if the one's complement is zero (to determine odd or even)
        while (num1 != 0) {
            num1 = num1 / 2;
        }
        
        // Check if the one's complement is zero to determine odd or even
        if (num1 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
