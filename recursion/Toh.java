package recursion;

public class Toh {
    
    public static void towerOfhanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transerdisk"+ n +"from" + src +"to"+dest);
            return;
        }

        towerOfhanoi(n-1, src, dest, helper);

        System.out.println("tansferdisk"+n+"from"+src+"to"+"helper");
        
        towerOfhanoi(n-1, helper, src, dest);
    }

    public static void main(String args[]){
        int n=3;
        towerOfhanoi(n, "A", "B", "C");
    }

}
