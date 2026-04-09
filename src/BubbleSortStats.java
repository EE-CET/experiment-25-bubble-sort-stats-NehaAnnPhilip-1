import java.util.Scanner;

public class BubbleSortStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read n
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        // TODO: Read the array elements
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // TODO: Implement Bubble Sort
        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    // TODO: Keep track of the number of swaps
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    totalSwaps++;
                }
            }
        }

        // TODO: Print total swaps
        System.out.println(totalSwaps);

        // TODO: Print the first element of the sorted array
        System.out.println(a[0]);

        // TODO: Print the last element of the sorted array
        System.out.println(a[n - 1]);
        
        sc.close();
    }
}
