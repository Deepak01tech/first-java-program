package DSApractise;
import java.lang.*;

import java.util.*;

public class Highandlow {
    static  void reverse(int arr[], int n)
    {
        int low =0, high=n-1;
        while (low < high)
        {
            int temp= arr[low];
            arr[low] =arr[high];
            arr[high] = temp;
            low++;
            high--;

        }
    }



    public static void main(System [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr =new int[n];
        System.out.println("enter the no of elements in array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" elements in array are : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("after reversing:= ");
        reverse(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


    }
}
