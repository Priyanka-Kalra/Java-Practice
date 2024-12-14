
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

    public static void main(String[] args) {

        // Collection is built for objects so we need to specify type as classes,
        // therefore we used Integer and not int
        Collection<Integer> num = new ArrayList<Integer>();// Collections dont have index, but List does
        num.add(5);
        num.add(9);
        num.add(0);
        num.add(1);

        Iterator<Integer> val = num.iterator();
        while (val.hasNext())
            System.out.println(val.next());

    }
}
