package pattern;
import java.util.*;

public class own {

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
        
    //     char currentChar='A';
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(currentChar + " ");
    //             currentChar++;
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char charCurr='a';

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(charCurr + " ");
                charCurr++;
            }
            System.out.println();
        }
        sc.close();
    }
}