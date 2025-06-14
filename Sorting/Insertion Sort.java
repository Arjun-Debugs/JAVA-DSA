import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int key = times[i];
            int j = i - 1;
            while (j >= 0 && times[j] < key) {
                times[j + 1] = times[j];
                j--;
            }
            times[j + 1] = key;
        }
        for (int time : times) {
            System.out.print(time + " ");
        }
    }
}
