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

    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);

        //n is odd
        if(n%2!=0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tillingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = tillingProblem(n-1);
        int fnm2 = tillingProblem(n-2);

        int fn=fnm1 + fnm2;
        return fn;
    }

    // public static int removeDuplicates(String str,int idx, StringBuilder newStr, boolean[] map){
    //     if(idx == str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
                                                                                    
    //     char currChar = str.charAt(idx);
    //     if(map[currChar-'a']==true){
    //         removeDuplicates(str, idx+1, newStr, map);
    //     }else{
    //         map[currChar-'a']=true;
    //         removeDuplicates(str, idx+1, newStr.append(currChar), map[26]);
    //     }
    // }

    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }

        int fnm = friendsPairing(n-1);

        int fnm2 = friendsPairing(n-2);

        int fn = fnm * (n-2);

        int toWays = fnm2 + fn;

        return toWays;
    }

    public static void binaryString(int n, int lastidx, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        
        if(lastidx == 0){
            binaryString(n-1, 0, str+"0");
            binaryString(n-1, 1, str+"1");
        }else{
        binaryString(n-1, 0, str+"0");
        }
    }

    public static void Occurences(int arr[],int key,int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.println(i+" ");
        }
        Occurences(arr, key, i+1);
    }

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int numbers){
        if(numbers == 0){
            return;
        }

        int lastDigit = numbers%10;
        printDigits(numbers/10);
        System.out.println(digits[lastDigit]+" ");
    }

    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str="viral";
        System.out.println(length(str));
        // int n=10;
        // int a=2;
        // desrcOrder(n);
        // incrscOrder(n);
        // System.out.println(fact(n));
        // System.out.println(sum(n));
        // System.out.println(fibonacci(n));

        // int arr[]  = {1, 2, 3, 9, 5, 7, 5};
        // int key = 2;
        // System.out.println(sorteD(arr, 0));
        // System.out.println(optimizedPower(a, n));
        // System.out.println(tillingProblem(2));
        // String str = "viralgautami";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friendsPairing(3));

        // binaryString(3, 0, new String(""));
        // Occurences(arr, key, 0);
        // System.out.println();

        // printDigits(4567);

    }

    
}