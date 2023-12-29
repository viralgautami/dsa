import java.util.*;

public class three_one_five {
    public static void Brute(int arr[], int n){
        int temp[]=new int[n];
        for(int i=1; i<n; i++){
            temp[i-1]=arr[i];
        }
        temp[n-1]=arr[0];
        for(int i=0; i<n; i++){
            System.out.print(temp[i]+" ");
        }
    }
    
    public static void Optimal(int arr[], int n){
        int temp= arr[0];
        for(int i=0; i<n-1; i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i=0;i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
        }
        Brute(arr, n);
        // Optimal(arr, n);
        sc.close();
    
    }
}