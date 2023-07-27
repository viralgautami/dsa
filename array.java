import java.util.*;

public class array {

    public static void first_largest(int arr[]){
    int max = arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.print(max);

}

    public static void second_largest(int arr[], int n){
        if(n<2)
        System.out.print(-1);
        int large=Integer.MIN_VALUE;
        int s_l=Integer.MIN_VALUE;
        for(int i=0;i<n; i++){
            if(arr[i]>large)
            {
                s_l=large;
                large=arr[i];
            }
            else if(arr[i]>s_l && arr[i]!=large)
            {
                s_l=arr[i];
            }
        }
        System.out.print(s_l);
    }

    public static boolean check_sorted(int arr[],int n){
    for(int i=1; i<n; i++){
        if(arr[i]>=arr[i-1]){

        }
        else{
            return false;
            }
            
    }
        return true;

    }

    public static void duplicate(int arr[], int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //boolean print = check_sorted(arr, n);
        //System.out.println(print);
        duplicate(arr, n);
        sc.close();
    }    
}
