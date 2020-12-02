package Assignment1;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if(number>0) {
            System.out.println("Positive Number Entered");
        }
        else if(number<0) {
            System.out.println("Negative Number  Entered");
        }
        else{
            System.out.println("Zero Entered");
        }

    }
}
