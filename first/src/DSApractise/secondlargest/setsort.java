package DSApractise.secondlargest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



    public class setsort  {
        public static void main(String[] args){
            Set<Integer> set = new HashSet<>();
            set.add(14);
            set.add(20);
            set.add(50);
            set.add(10);
            System.out.println(set);
            // Sorting
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            System.out.println(list);
        }
    }

/*    Set<T> set = new HashSet<>();

        // Iterate through the array
        for (T t : array) {
            // Add each element into the set
            set.add(t);
        }

        // Return the converted Set
        return set; */