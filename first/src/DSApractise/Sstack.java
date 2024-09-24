package DSApractise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Sstack {
/*
    static boolean isBalanced(String str)
    {
        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            char x=str.charAt(i);
            if(x=='('|| x=='{'||x=='[')
                s.push(x);
            else {
                if(s.isEmpty()==true)
                    return false;
                else if (matching ) {
                    
                }
            }
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);

    } */

    public static void main(String [] args)
    {
        stck s = new stck();
        s.push(6);
        s.push(3);
        s.push(7);

        System.out.println(s.pop());

    }
    static class stck

    {
        int size=1000;
        int arr[]=new int[size];
        int top = -1;
        void push(int x)
        {
            top++;
            arr[top]=x;

        }
        int pop()
        {
            int x = arr[top];
            top--;
            return x;

        }
        int top()
        {
            return arr[top];
        }
        int size()
        {
            return top +1;
        }
    }
}


