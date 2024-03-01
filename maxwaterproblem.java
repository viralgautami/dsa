import java.util.*;

public class maxwaterproblem {
    public static int storeWater(ArrayList<Integer> height){
            int lp=0;
            int rp=height.size()-1;
            int maxWater=0;
            
            while (lp<rp) {
                int ht=Math.min(height.get(lp), height.get(rp));
                int width=rp-lp;
                int currWater=ht*width;
                maxWater = Math.max(maxWater, currWater);
                
                if(height.get(lp)<height.get(rp)){
                    lp++;
                }
                else{
                    rp--;
                }
            }
            return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(5);
        height.add(7);
        height.add(0);
        height.add(9);
        System.out.println(storeWater(height));
    }
}
