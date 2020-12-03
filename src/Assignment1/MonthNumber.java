package Assignment1;

import java.time.Month;

public class MonthNumber {
    public static void main(String[] args) {
        if(args.length==0) {
            System.out.println("Please enter the month in numbers");
        }
        try{
            int month = Integer.parseInt(args[0]);
            if(month<1 || month>12) {
                System.out.println("Invalid month");
                System.exit(0);
            }
            String m = Month.of(month).name();
            System.out.println(m.substring(0,1).toUpperCase() + m.substring(1).toLowerCase());
        }catch(NumberFormatException e){
            System.out.println("Invalid Value");
        }

    }
}
