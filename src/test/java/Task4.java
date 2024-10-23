import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Your name:");
            String saxeli = scanner.next();
            greet();
            greet(saxeli);
    }
    static void greet () {
        System.out.println("Hello!");
    }
    static void greet (String saxeli) {
        System.out.println("Hello " + saxeli + "!");

    }
}
