package dsastring;

import java.util.Scanner;

public class palindrome {

    public class Palindromecheck{
        public static boolean isPalindrome(String str)
        {
            int left=0,right=str.length() -1;
            while(left<right)
            {
              //  if(str.charAt(left)!=Str.charAt(right))
                {
                    return false;

                }
                //left ++;
                //right --;

            }
            return true;

        }
    }

    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
       // if(isPalindrome(str))
        {
            
        }

    }
}
