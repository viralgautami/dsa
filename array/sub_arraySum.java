//brute solution

package array;

import java.util.*;

public class sub_arraySum {

    public static void subArraysum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
                    System.out.println("max sum = "+maxSum); 

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numbers[] = new int[5];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        
        subArraysum(numbers);
        sc.close();
    }
}
