/*import java.util.*;

public class Infinity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            int lastdigit = n%10;
            n=n/10;
            count++;

        }System.out.println(count);
    }    
}
*/
/*
import java.util.*;

public class Infinity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int a=n%10;
            rev=rev*10+a;
            n=n/10;

        }System.out.println(rev);
    }    
}
 */
/* import java.util.*;

 public class Infinity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n!=0){
            int a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }        
    }
 }
  */
/*
import java.util.*;

public class Infinity{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
    }
}
*/
import java.util.*;


public class Infinity{

    static void armstrong(int n){
    
        int dup=n;
        int lastdigit;
        int sum=0;
        while(n!=0){    
            lastdigit = n%10;
            sum = sum+(lastdigit*lastdigit*lastdigit);
            n = n/10;
        }
        if(sum==dup){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
            }
}

    static void divisors(int n){
        for(int i=1;i<=n;i++){
           if(n%i==0){
            System.out.println(i);
           }
        }
    }

    static void primeornon(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            
        }
        if(count<=2){
                System.out.println("prime");
            }
            else{
                System.out.println("nonprime");
            }
    }

    static void reverse(int n){
        int lastdigit;
        int rev=0;
        while(n!=0){
            lastdigit=n%10;
            n=n/10;
            rev=(rev*10)+lastdigit;
        }
        System.out.println(rev);
    }

static void gcd(int n1, int n2){
        int gcd=1;

    for(int i=1; i <= Math.min(n1,n2); i++)
    {
        if(n1%i==0 && n2%i==0){
                    gcd=i;

        }

    }
            System.out.println(gcd);


            
    
}

static void hcf(int n1, int n2){
        int hcf=1;

    for(int i=Math.min(n1,n2); i>=1; i++)
    {
        if(n1%i==0 && n2%i==0){
            System.out.println(i);
        }

    }

}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();

    //armstrong(n);
    //divisors(n);
    //primeornon(n);
    //reverse(n);
    //gcd(n1, n2);
    hcf(n1, n2);
    

}
}