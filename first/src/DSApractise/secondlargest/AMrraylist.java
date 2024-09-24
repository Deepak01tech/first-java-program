package DSApractise.secondlargest;

import java.util.ArrayList;
import java.util.Scanner;

public class AMrraylist {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList <Integer> firtlist =new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            firtlist.add(sc.nextInt());

        }
        System.out.println("elements are:=");

        for(int i=0;i<n;i++)
        {
            System.out.println(firtlist.get(i));

        }
        System.out.println("printing directly"+ firtlist);

    }
}
