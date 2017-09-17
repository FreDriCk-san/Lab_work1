package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random random = new Random();
        int a = random.nextInt(300);
        Start();
        SimpleNumber(a);
        Level3();
    }
    private static void Level3() {
        String exmpl = "FF()()AAA";
        int len = exmpl.length();
        int l = 0;
        for (int i = 0; i < len; i++)
        {
            if (exmpl.charAt(i) == '(')
            {
                l++;
            }
            else if (exmpl.charAt(i) == ')')
            {
                l--;
            }
            if (l < 0)
            {
                break;
            }
        }
        if (l < 0)
        {
            System.out.println("Incorrect");
        }
        else
        {
            System.out.println("Correct");
        }
    }

    private static boolean SimpleNumber(int a) {
        for (int i = 2; i < a; i++)
        {
            if (a % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    private static void Start() {
        for (int i = 0; i<100; i++)
        {
            if (i % 15 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }

}



