package twod_array;

import java.util.*;

/**
 * one
 */
public class one {
    public static void main(String[] args) {

        int numbers[][] = {{2,7,7},{3,5,7}};

        int count7 = 0;

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[0].length; j++){
                if(numbers[i][j]==7){
                    count7++;
                }
            }
        }
    System.out.println(count7);
}
    
}