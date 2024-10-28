import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }

    public static boolean isFibonacci(int number) {
        int a = 0, b = 1;
        while (a < number) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == number;
    }
}