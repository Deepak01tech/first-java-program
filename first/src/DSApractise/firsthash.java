package DSApractise;

import java.util.HashSet;

public class firsthash {
    public static void main(String[] args)
    {
        HashSet<String> set= new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        System.out.println("contain"+ set);

        //System.out.println(set.contains());

        String arr[]=new String[set.size()];
        set.toArray(arr);
        for(String n:arr)
            System.out.println(n);

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);



    }
}
