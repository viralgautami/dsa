package pattern;

import java.util.*;

public class palindromic_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //first portion
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //second portion
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            
            System.out.println();

        }

        sc.close();        
    }
    
}