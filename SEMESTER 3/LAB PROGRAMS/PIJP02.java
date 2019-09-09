package com.bca;

import java.util.Scanner;
import java.lang.*;

class PIJP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.String functions\n2.StringBuffer functions");
        int ch = sc.nextInt();
        switch (ch) {
        case 1:
            String s1 = "Jain";
            System.out.println("Concat using String:");
            String str1 = s1.concat(" University");
            System.out.println("Concatenated String is: " + str1);
            System.out.println("length of String str1 is:" + str1.length());
            System.out.println("Character at position 5: " + str1.charAt(5));
            System.out.println("Index of character 'a': " + str1.indexOf('a'));
            System.out.println("uppercase:" + str1.toUpperCase());
            System.out.println("lowercase:" + str1.toLowerCase());
            String s = "  hello  ";
            System.out.println(s);
            System.out.println(s.trim());
            String s2 = "hello";
            String s3 = "hemlo";
            System.out.println(s2.compareTo(s3));
            String replaceString = str1.replace('i', 'z');
            System.out.println(replaceString);
            break;
        case 2:
            StringBuffer sb1 = new StringBuffer("Jain");
            System.out.println("Concat using StringBuffer:");
            sb1.append("University");
            System.out.println("StringBuffer: " + sb1);
            sb1.insert(1, "Java");
            System.out.println("String after inserting:" + sb1);
            sb1.delete(1, 5);
            System.out.println("string after deleting:" + sb1);
            sb1.replace(1, 3, "Java");
            System.out.println(sb1);
            sb1.reverse();
            System.out.println(sb1);
            StringBuffer sb = new StringBuffer();
            System.out.println(sb.capacity());// default 16
            sb.append("Hello");
            System.out.println(sb.capacity());// now 16
            sb.append("java is my favourite language");
            System.out.println(sb.capacity());
            break;
        }
    }
}