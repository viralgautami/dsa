package pattern;

import java.util.*;

public class diamond_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            for(int i=1; i<=n; i++){
                //spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }

                //upper shape
                for(int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }

                System.out.println();
            }

                for(int i=n; i>=1; i--){
                //spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }

                //upper shape
                for(int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }

                System.out.println();

            }
        sc.close();
    
}

}