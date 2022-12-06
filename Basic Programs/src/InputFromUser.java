/*Program to get input from the user

1. Using Buffered Reader Class
2. Using Scanner Class
3. Using Command line argument
4. Using Console Class
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) throws IOException {

//        1. Buffered Reader Class

//            Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name (Buffered Reader): ");
//            Reading data using readLine
        String name = reader.readLine();
//            print the readLine
        System.out.println("Buffered Input Name: " + name);



//        2. Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String string = sc.nextLine();
        System.out.println("String Value: " + string);

        System.out.print("Enter Integer: ");
        int integer = sc.nextInt();
        System.out.println("Integer Value: " + integer);

        System.out.print("Enter Float: ");
        float floatValue = sc.nextFloat();
        System.out.println("Float Value: " + floatValue);



//        3. Command Line Arguments
        if (args.length > 0) {
            System.out.println("The command line argument are: ");

//            iterating the args and printing the command line arguments
            for (String val: args) {
                System.out.println(val);
            }
        } else {
            System.out.println("No commandline arguments found. ");
        }


//        4. Console Class
//        need console (doesn't work in ide)
        System.out.print("Enter String from Console: ");
        String consoleInput = System.console().readLine();
        System.out.println("String from Console: " + consoleInput);







    }
}
