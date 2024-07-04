import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupElements {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5,6,7,8,9,9,7,6,3,4,6};
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet();
        for(int i: num){
            if(set.contains(i)){
                set1.add(i);
            }
            set.add(i);

        }
        Integer [] arr=set.toArray(new Integer[0]);
        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Dup Elements: "+set1);
    }
}

