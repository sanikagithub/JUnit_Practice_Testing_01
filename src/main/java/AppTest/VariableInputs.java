package AppTest;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter an integer:");
        int IntegerResponse = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a double:");
        double DoubleResponse = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value:");
        boolean BooleanResponse = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your integer is " + IntegerResponse);
        System.out.println("Your double is " + DoubleResponse);
        System.out.println("Your boolean is " + BooleanResponse);

        scanner.close();
        yourInteger(IntegerResponse);
        yourDouble(DoubleResponse);
        yourBoolean(BooleanResponse);

    }
        public static String yourInteger(int IntegerResponse){
            return "Your integer response is " + IntegerResponse;
        }

        public static String yourDouble(double DoubleResponse){
            return "Your double response is " + DoubleResponse;
        }

        public static String yourBoolean(boolean BooleanResponse){
            return "Your boolean response is " + BooleanResponse;
        }
}
