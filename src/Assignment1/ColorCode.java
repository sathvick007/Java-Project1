package Assignment1;

import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args) {
        System.out.println("Enter a Color Code");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'R':
                System.out.println("R->Red");
                break;
            case 'G':
                System.out.println("G->Green");
                break;
            case 'B':
                System.out.println("B->Blue");
                break;
            case 'O':
                System.out.println("O->Orange");
                break;
            case 'Y':
                System.out.println("Y->Yellow");
                break;
            case 'W':
                System.out.println("W->White");
                break;
            default:
                System.out.println("Invalid Code");
        }

    }
}
