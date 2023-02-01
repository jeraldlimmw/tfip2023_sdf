package myapp;

// imports
import java.io.Console;

public class Hello {
    
    // entry point
    public static void main(String args[]) {
        // Get the console
        // declare variable <type> and <name> on the left
        Console cons = System.console();

        // Prompt the user for input
        String input = cons.readLine("What is your name?");
        String phone = cons.readLine("Your contact number?");
        String strAge = cons.readLine("How old are you?");
        
        input = input.trim();
        int age = Integer.parseInt(strAge);

        // Print the input
        // if age is greater than 30, address as Mr
        if (age > 30) {
            // then is mandatory
            System.out.printf("Hello, Mr %s.", input);
        } else {
            System.out.printf("Hello, %s.", input);
        }
        System.out.printf(" Your phone is %s.\n", phone);
        System.out.printf("You are %s years old!\n", strAge);
        System.out.printf("Greater than 50? %b\n", age > 50);

        
        switch (input.trim().toLowerCase()) {
            case "fred":
                System.out.printf("Yabadabadoo!\n");
                break;
            case "barney":
                System.out.printf("hello fred\n");
                break;
            default:
                System.out.printf("You are not fred or barney\n");
                break;
        }

        while (age > 0) {
            System.out.printf("---- %d\n", age);
            age--;
        }

    }

}
