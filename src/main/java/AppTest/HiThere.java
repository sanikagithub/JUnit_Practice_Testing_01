package AppTest;
import java.util.Scanner;

public class HiThere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String response1 = scanner.nextLine();
        System.out.println("Wow - Interesting! Tell me more!");
        String response2 = scanner.nextLine();
        System.out.println("Nice chatting with you! Goodbye!");

        yourResponse1(response1);
        yourResponse2(response2);
        scanner.close();
    }
    public static String yourResponse1(String response1){
        return "Your first response is " + response1;
    }
    public static String yourResponse2(String response2){
        return "Your second response is " + response2;
    }
}