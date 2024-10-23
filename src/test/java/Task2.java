import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("შეიყვანეთ პირველი რიცხვი:");
            int ricxvi1 = scanner.nextInt();
            System.out.println("შეიყვანეთ მეორე რიცხვი:");
            int ricxvi2 = scanner.nextInt();
            System.out.println("შეიყვანეთ მესამე რიცხვი:");
            int ricxvi3 = scanner.nextInt();

            int yvelazeDidiRicxvi = findLargest(ricxvi1, ricxvi2, ricxvi3);
            System.out.println("თქვენ მიერ შეყვანილი რიცხვებიდან ყველაზე დიდია " + yvelazeDidiRicxvi);
        } catch (Exception e) {
            System.out.println("შეიყვანეთ მხოლოდ რიცხვები!");
        } finally {
            scanner.close();
        }
    }
    static int findLargest (int ricxvi1, int ricxvi2, int ricxvi3) {
        int yvelazeDidiRicxvi = ricxvi1;
        if (ricxvi2 > yvelazeDidiRicxvi) {
            yvelazeDidiRicxvi = ricxvi2;
        }
        if (ricxvi3 > yvelazeDidiRicxvi) {
            yvelazeDidiRicxvi = ricxvi3;
        }
        return yvelazeDidiRicxvi;

    }
}
