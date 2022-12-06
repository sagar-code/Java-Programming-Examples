import java.util.Scanner;

//Read and Print an Integer Value
public class IntegerInput {
    public static void main(String[] args) {
        int integerValue;

        System.out.print("Enter the integer value: ");
        Scanner sc = new Scanner(System.in);
        integerValue = sc.nextInt();

        System.out.println("Integer Value: " + integerValue);
    }
}
