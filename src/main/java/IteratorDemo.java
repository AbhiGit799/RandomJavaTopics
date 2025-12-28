import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        List<String> langs = Arrays.asList("Java","Python","Go");

        Iterator<String> it = langs.iterator();

        while (it.hasNext())
        {
            String lang = it.next();
            System.out.println(lang);
        }

        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6));
        Iterator<Integer> it1 = nums.iterator();

        while (it.hasNext())
        {
            Integer n = it1.next();
            if(n%2==0)
            {
                it.remove(); //SAFE removal during iteration
            }
        }

        System.out.println(nums);
    }
}
