import java.util.Scanner;

public class _7_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            sum += a;
        }

        System.out.println(sum);
    }
}
