package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Random random = new Random();
        //int a = random.nextInt(300);
        //Start();
        //SimpleNumber(a);
        Level3();

    }

    private static void Level3() {
        String exmpl = "())";
        int len = exmpl.length();
        int l = 0, r = 0;
        char left = '(' ;
        for (int i = 0; i < len; i++)
        {
            if (exmpl.charAt(i) == left)
            {
                l++;
            }
            else
            {
                r++;
            }
        }
        if (l == r)
        {
            System.out.println("Да");
        }
        else
        {
            System.out.println("Нет");
        }
    }

    private static boolean SimpleNumber(int a) {
        for (int i = 2; i < a/2; i++)
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
            System.out.println(i);
            if (i % 15 == 0)
            {
                System.out.println("ФизБас");
            }
            else if (i % 5 == 0)
            {
            System.out.println("Бас");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Физ");
            }
            else
            {
                System.out.println("None");
            }
            System.out.println("\n");
        }
    }
}
