package array;
import java.util.*;

public class Prac {

    public static int isBinary(int numbers[], int key){

        int start=0;
        int end=numbers.length-1;
        System.out.println(end);
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int key=sc.nextInt();
        // int numbers[]={};
        // for(int i=0;i<=numbers.length;i++){
        //     numbers[]=nextInt();
        // }
        int numbers[]={1,2,3,5,6,8,65};
        int key=5;
        isBinary(numbers, key);

    }
    
}
