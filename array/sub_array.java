package array;

import java.util.*;

public class sub_array {

    public static void subArray(int numbers[]){
        int total=0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    total++;
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.print(total);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numbers[] = new int[5];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        
        subArray(numbers);
        sc.close();
    }
}
