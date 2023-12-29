package pattern;

import java.util.*;

public class floyd_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=1;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
        sc.close();
    }
}
