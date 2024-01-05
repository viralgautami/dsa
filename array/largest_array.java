package array;

public class largest_array {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {2,3,5,3,1,4};
        System.out.println(getLargest(numbers));
    }    
}
