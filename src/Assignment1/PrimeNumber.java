package Assignment1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 1)
            System.out.println("not prime");
        else if (number == 2)
            System.out.println("prime");
        else if (number % 2 == 0)
            System.out.println("not prime");
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                System.out.println("not prime");
            else
                System.out.println("prime");
            break;
        }
    }
}