package string;

import java.util.*;

public class countLowercase {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=new String("abcd");

        int count=0;

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}