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
        
        // checking wheather one's complement of number is even or odd by dividing number by 2 and determining whether its completely divisible or not.
        while (num1 != 0) {
            num1 = num1 / 2;
        }
        
        // Check if the one's complement is in even or odd form to determine given number is odd or odd number
        if (num1 == 0) { // if num1 is 0, its odd number
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number"); //if num1 is not 0, then its even number
        }

    
    }
}
