package Assignment1;

import java.util.StringJoiner;

public class CommandLine {
    public static void main(String[] args) {
        StringJoiner values = new StringJoiner(", ");
        if(args.length > 0) {
            for (String value : args) {
                values.add(value);
            }
            System.out.println(values.toString());
        }
        else
            System.out.println("No Values");
    }
}
