import java.util.*;

public class quicksort {

public static int partition(int arr[],int low,int high){
    int pivot = arr[high];
    int i=low-1;
    for(int j=low; j<high; j++){
        if(arr[i]<pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
        }
    }

}

public static int quicksort(int arr[], int low, int high){
    if(low<high){
        int pi=partition(arr,low,high);
        quicksort(arr,low,pi-1);
        quicksort(arr,pi+1,high);

    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

    }
}
