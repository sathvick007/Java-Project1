package Assignment1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a  number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if(number%2==0) {
            System.out.println("Even Number Entered");
        }
        else
            System.out.println("Odd Number Entered");

    }
}
