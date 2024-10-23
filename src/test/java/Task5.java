import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ გრადუსი ფარენჰაიტით:");
        double fahrenheit = scanner.nextDouble();
        System.out.println("გრადუსი ცელსიუსით:" + convertToCelsius(fahrenheit));
    }
    static double convertToCelsius (double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
