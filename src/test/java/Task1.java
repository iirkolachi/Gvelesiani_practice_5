import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("შეიყვანეთ რიცხვი:");
            int ricxvi1 = scanner.nextInt();
            System.out.println(isEven(ricxvi1));
        } catch (Exception e) {
            System.out.println("შეიყვანეთ მხოლოდ რიცხვი!");
        } finally {
            scanner.close();
        }
    }
    static boolean isEven (int ricxvi1) {
        return ricxvi1 % 2 == 0;
    }
}

