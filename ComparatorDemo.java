import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        // Comparator<Integer> com=new Comparator<Integer>() {

        // public int compare(Integer i,Integer j){//comparator based on last digit of
        // number
        // if(i%10 > j%10)return 1;
        // else return -1;
        // }

        // };

        Comparator<Integer> com = (Integer i, Integer j) -> i % 10 > j % 10 ? 1 : -1;

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(100);
        nums.add(81);
        nums.add(29);
        nums.add(85);

        Collections.sort(nums, com);// Collections is a class
        System.out.println(nums);
    }
}
