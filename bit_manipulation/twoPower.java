package bit_manipulation;

class twoPower {

    public static boolean twoTothepower(int n){
        return (n&(n-1)) == 0;
    }

    public static void main(String args[]){
        System.out.println(twoTothepower(8));
    }
}
