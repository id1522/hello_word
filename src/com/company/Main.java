package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello word");
	    byte byteVar = 127;
        long longVar = 100;
        char charVar ='a';
        double doubleVar = 2.9;
        boolean boolVar = true;
        int intVar = byteVar;
        int intVar2 = (int) longVar;

        int a = 18;
        int b = 12;
        System.out.println ("a + b =" + (a +b));
        System.out.println ("a - b =" + (a -b));
        System.out.println ("a * b =" + (a *b));
        System.out.println ("a / b =" + (a /b));
        System.out.println ("a % b =" + (a %b));
        System.out.println ("a++ =" + (a++));
        System.out.println ("a + 1 =" + (a + 1));
        System.out.println ("--a =" + (--a));
        System.out.println ("a - 1 =" + (a - 1));


        System.out.println ("1 == 1" + (true==true));
        System.out.println ("1 ! = 1" + (true != false));
        System.out.println ("1 < 2" + (1 < 2));
        System.out.println ("1 > 2" + (1 > 2));

        System.out.println ("1 & 1 =" + (1 & 1));
        System.out.println ("1 | 1 =" + (1 | 1));
        System.out.println ("1 ^ 1 =" + (1 ^ 1));
        System.out.println ("~1 =" + (~1));


        System.out.println ((1 == 1) && (2 == 2));
        System.out.println ((2 == 1) && (1 == 1));


        System.out.println ((1 == 1) || (2 == 2));
        System.out.println ((2 == 1) || (1 == 1));

        System.out.println (!(1 == 1));
        System.out.println (!(2 == 1));

        int c = 10;
        c += 5;
        System.out.println (c);
        c -= 3;
        System.out.println (c);
        c *= 2;
        System.out.println (c);
        c /=2;
        System.out.println (c);

        int  d = (c < a) ? 1 : 0;
        System.out.println (d);

    }
}
