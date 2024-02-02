package twod_array;

public class two {
    public static void main(String[] args) {

        int numbers[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;

            for(int j=0; j<numbers[0].length; j++){
                sum += numbers[1][j];
                }
         
    System.out.println(sum);
}
}