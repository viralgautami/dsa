package array;

public class binary_search {
    public static int binarySearch(int numbers[], int key){
        int start=0, end=numbers.length-1;

        while(start <= end){
            int mid = (start+end)/1;
            
            if(numbers[mid]==key){
                return mid;
            }

        }
    }

    public static void main(String[] args) {
        
    }    
}
