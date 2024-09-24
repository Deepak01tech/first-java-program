package hassing;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

class Countdistinct{

    public static void main(String args[])
    {  int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of  element : ");
        n=sc.nextInt();
        Integer []arr= new Integer[n];
        for(int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("entered elements are : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);


        }
        System.out.println("no of unique  elements are : ");
        //Integer[] arrBoxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        // Initialize HashSet with Integer[]
        HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));
        System.out.println(s.size());



    }

}





















//public class Countdistinct {
//
//   int countDistinct(int arr[])
//   {
//       HashSet<Integer>s =new HashSet<>();
//       for(int i=0;i<arr.length;i++)
//           s.add(arr[i]);
//       System.out.println(s);
//       System.out.println("the size is :");
//       return s.size();
//
//
//   }
//
//
//    public static void main(String args[])
//    {
//        int n;
//
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//
//        int [] arr = new int[10];
//        System.out.println("enter the of element in array :");
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//
//        for(int i=0;i<n;i++)
//        {
//           System.out.println(arr[i]);
//        }
//
//        Countdistinct obj= new Countdistinct();
//        obj.countDistinct(arr);
//
//
//    }
//
//}


