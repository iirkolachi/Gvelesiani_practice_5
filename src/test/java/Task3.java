import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try {
            System.out.println("შეიყვანეთ სიგრძე:");
            double sigrdze = scanner.nextDouble();
            System.out.println("შეიყვანეთ სიგანე:");
            double sigane = scanner.nextDouble();

            double calculateArea = calculateArea(sigrdze, sigane);
            System.out.println("ფართობი: " + calculateArea);
        } catch (Exception e) {
            System.out.println("შეიყვანეთ მხოლოდ რიცხვები!");
        } finally {
            scanner.close();
        }
    }
    static double calculateArea(double sigrdze, double sigane) {
        return sigrdze * sigane;
    }
}
