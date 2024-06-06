package exception2;

import java.util.Scanner;

public class customEx2 
{

    // method to check if the number is odd
    public void check(int number) 
    {
        if (number % 2 == 0) 
        {
            System.out.println("It's an even number, so welcome!!!");
        } else {
            System.out.println("Invalid input: Odd number is not allowed!");
        }
    }

    public static void main(String[] args) 
    {
        customEx2 obj = new customEx2();// creating object for method calling
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int inputNumber = sc.nextInt();

        obj.check(inputNumber);//calling the method with parameter
    }
}
