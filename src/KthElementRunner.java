import java.util.Scanner;

public class KthElementRunner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        while (n > 0) {
            handleSet(scan);
            n--;
        }
    }

    private static void handleSet(Scanner scan) {
        int arraySize = scan.nextInt();

        int[] array = readArray(arraySize, scan);
        int kSize = scan.nextInt();
        int k;

        while (kSize > 0) {
            k = scan.nextInt();
            System.out.println(handleK(array, k));
            kSize--;
        }
    }

    private static String handleK(int[] array, int k) {
        int result = KthElement.findKthElement(array, 0, array.length - 1, k);
        if (result == Integer.MAX_VALUE) {
            return String.format("%d brak", k);
        } else {
            return String.format("%d %d", k, result);
        }
    }

    private static int[] readArray(int arraySize, Scanner scan) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

}
