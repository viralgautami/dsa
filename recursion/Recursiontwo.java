package recursion;

public class Recursiontwo {
    public static void desrcOrder(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        
            System.out.println(n);
            desrcOrder(n-1);
    }

    public static void incrscOrder(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        else{
            incrscOrder(n-1);
            System.out.println(n);
        }
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm=fact(n-1);
        int fn=n*fact(n-1);
        return fn;

    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int nms=sum(n-1);
        int s=n+sum(n-1);
        return s;
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
return n;        }
        int fn1 = fibonacci(n-1);
        int fn2 = fibonacci(n-1);
        int fn = fn1+fn2;
        return fn;
    }

    public static boolean sorteD(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        } 
        return sorteD(arr, i+1);
    }

    public static int occurencE(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return occurencE(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && key != -1){
            return i;
        }
        return lastOccurence(arr, key, isFound);
    }

    public static void main(String[] args) {
        // int n=10;
        // desrcOrder(n);
        // incrscOrder(n);
        // System.out.println(fact(n));
        // System.out.println(sum(n));
        // System.out.println(fibonacci(n));

        int arr[]  = {1, 2, 3, 9, 5, 7, 5};
        // System.out.println(sorteD(arr, 0));
        System.out.println(lastOccurence(arr, 5, 0));
    }
}
