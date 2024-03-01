import java.util.*;

public class sumfromarray {

    public static boolean sumOfarray(ArrayList<Integer> list, int target){
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.get(j);j++){
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(4);
        int target=9;
        System.out.println(sumOfarray(list, target));
    }    
}
