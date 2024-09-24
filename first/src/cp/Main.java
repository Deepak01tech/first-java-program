package cp;

import java.util.Scanner;

public class Main {
    static void duplicate(int[] array) {

        //declared the variables
        int i, j, frequency;


        for (i = 0; i < array.length; i++) {
            frequency = 1;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    frequency++;
                } else {
                    break;
                }
            }
            i = j - 1;
            if (frequency >= 3) {
                //printing the output
                System.out.println(frequency);
            }
            else{
                System.out.println(0);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int [] arr=new int[x];
            for(int j=0;j<x;j++)
            {
                arr[j]= sc.nextInt();
            }
            duplicate(arr);
        }
    }

}
