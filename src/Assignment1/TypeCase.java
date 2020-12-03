package Assignment1;

import java.util.Scanner;

public class TypeCase {
    public static void main(String[] args) {
        System.out.println("Enter an Alphabet");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();
        if (Character.isAlphabetic(ch)) {
            if (Character.isLowerCase(ch))
                System.out.println(ch + "->" + Character.toUpperCase(ch));
            else
                System.out.println(ch + "->" + Character.toLowerCase(ch));
        }
        else
            System.out.println("Invalid Alphabet Entered");


    }
}
