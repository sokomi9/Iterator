import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class index{
    public static void main(String[] args) {
        Collection<Integer> values = new TreeSet<Integer>();
        values.add(30);
        values.add(90);
        values.add(120);
        values.add(100);

        Iterator nums = values.iterator();

        while (nums.hasNext()) {
            System.out.println(nums.next());
        }


    }
}