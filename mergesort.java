import java.util.*;

public class mergesort {

    public static void conquer(int arr[], int Low, int mid, int High) {
        int merged[] = new int[High - Low + 1];

        int idx1 = Low;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= High) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }

        while (idx2 <= High) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }

        for (int i = 0, j = Low; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int Low, int High) {
        if (Low < High) {
            int mid = (Low + High) / 2;
            divide(arr, Low, mid);
            divide(arr, mid + 1, High);
            conquer(arr, Low, mid, High);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
