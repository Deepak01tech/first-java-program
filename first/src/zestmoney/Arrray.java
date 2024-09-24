package zestmoney;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Arrray {
    public static void main(String [] args)
    {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(25);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }



        ArrayList<String> car= new ArrayList<String>();
         car.add("bmw");
        LinkedList<String> carss =new LinkedList<String>();
        carss.add("volvo");



    }
}
