import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int maximum = arr[0];
        int minimum = arr[0];

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if (arr[i] > maximum) {
                maximum = arr[i];
            }

            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);

        sc.close();
    }
}
