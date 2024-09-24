import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int [] arr= {1,2,3,4,4,6};
        HashSet<Integer> h =new HashSet<>();


        for(int i=0;i<6;i++)
        {
            for(int j=i+1;j<6;j++)
            {
                h.add(arr[i]);
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }



            }
        }
        for(int i=0;i<6;i++)
        {

            if(arr[i]!=i)
            {
                System.out.println(i);
            }
        }


    }
}