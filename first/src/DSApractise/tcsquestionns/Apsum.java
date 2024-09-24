package DSApractise.tcsquestionns;

import java.util.Scanner;

public class Apsum {
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no of element in ap");
        int n=sc.nextInt();
        System.out.println("enter the difference of element in ap");
          int d=sc.nextInt();
        System.out.println("enter the first element in ap");
        int a=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a;
            a=a+d;


        }
        System.out.println(sum);

    }
}
