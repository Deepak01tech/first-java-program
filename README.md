# first-java-program
package Deepprogm;

public class Arryswap {
    /*public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter the size of array");

        a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            System.out.println("enter the value"+i);

        }
        System.out.println("you have entered this array");
        for(int i=0;i<a;i++)
        {
            System.out.println(a[i]);
        }
}
    */

    public static void main(String[] args) {

        int[] a = {10, 20, 30};

        for(int j=0;j<3;j++)
        {
            System.out.print(a[j] + " ");
        }

        System.out.println();

        int x = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = x;



        for(int i=0;i<3;i++)
        {
            System.out.print(a[i] + " ");
        }

    }

}
