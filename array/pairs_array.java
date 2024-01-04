package array;

import java.util.*;

public class pairs_array{

    public static void pairsOftwo(int numbers[]){
        for(int i=0; i<numbers.length; i++){
        int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[i] + ")");
            }
            System.out.println();
        
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,7,8,9};

        pairsOftwo(numbers);
    }
}