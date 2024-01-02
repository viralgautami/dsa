package array;

public class binary_search {
    public static int binarySearch(int numbers[], int key){
        int start=0, end=numbers.length-1;
        System.out.println(end);
        while(start <= end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,6,7,9};
        int key=9;
        binarySearch(numbers, key);
    }    
}
