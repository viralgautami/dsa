import java.util.*;

public class three {

    public static boolean check_sorted(int arr[], int n){
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = check_sorted(arr, n);
        if (isSorted) {
            System.out.println("sorted.");
        } else {
            System.out.println("not sorted.");
        }
        sc.close();
    }
}
