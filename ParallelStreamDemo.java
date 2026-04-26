
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        int size = 10000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();
        for (int i = 0; i < size; i++)
            nums.add(ran.nextInt(100));

        // int sum1 = nums.stream()
        // .map(i -> i * 2)
        // .reduce(0, (c, e) -> c + e);

        long startSeq = System.currentTimeMillis();
        int sum1 = nums.stream()
                .map(i -> {

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    return i * 2;
                })
                .mapToInt(i -> i)// we use mapToInt bcz its not necessary that we have integer data type in map
                .sum();
        long endSeq = System.currentTimeMillis();

        long startPar = System.currentTimeMillis();
        int sum2 = nums.parallelStream()// use it when no dependent tasks are there like sorting
                .map(i -> {

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    return i * 2;
                })
                .mapToInt(i -> i)// we use mapToInt bcz its not necessary that we have integer data type in map
                .sum();
        long endPar = System.currentTimeMillis();

        System.out.println(sum1 == sum2);
        System.out.println("Time :" + (endSeq - startSeq));
        System.out.println("Time :" + (endPar - startPar));
    }
}
