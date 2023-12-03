import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.Timer;
import java.time.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.*;

public class Main {

//    public void find(char farr[], int a) {
//        char arr[] = new char[farr.length];
//        for (int i = farr.length; i > a; i--) {
//
//        }
//    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("НОМЕР БУКВЫ:");
        int n = console.nextInt();

        System.out.println("\nСИМВОЛ:");
        String b = console.next();
        console.nextLine();
        char a = b.charAt(b.length()-1);

        System.out.println("ТЕКСТ:");
        String arr= new String();
        arr = console.nextLine();

        StringBuilder sb = new StringBuilder(arr);

        for (int i = 0, j = 1; i < arr.length(); i++, j++){
            if (arr.charAt(i) == ' ') {
                    j = 0;
            } else if (j == n) {
                    sb.setCharAt(i, a);
            }
        }

        arr = sb.toString();

        System.out.println(arr);

    }
}


//VARIANT-1
//        Scanner console = new Scanner(System.in);
//
//        System.out.println("Введите количество строк:");
//        int n = console.nextInt();
//
//        String[] arr = new String[n];
//
//        int le = Integer.MAX_VALUE, lep;
//        String mem = "";
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("Введите строку номер " + (i + 1) + ": ");
//            arr[i] = console.next();
//
//            if (arr[i].length() <= le) {
//                le = arr[i].length();
//                mem = arr[i];
//            }
//        }
//
//        System.out.println("camaia korotkaya " + mem + "\n" + "dlinna = " + le);


//VARIANT-2
//        Scanner console = new Scanner(System.in);
//
//        System.out.println("Введите количество строк:");
//
//        int n = console.nextInt();
//        String[] arr = new String[n];
//        int numarr[];
//        int le = Integer.MAX_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("Введите строку номер " + (i + 1) + ": ");
//            arr[i] = console.next();
//
//
//        }
//
//        String buff;
//
//        boolean needIteration = true;
//        while (needIteration) {
//            needIteration = false;
//            for (int i = 1; i < n; i++) {
//                if (arr[i - 1].length() > arr[i].length()) {
//                    buff = arr[i - 1];
//                    arr[i - 1] = arr[i];
//                    arr[i] = buff;
//                    needIteration = true;
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("textext " + arr[i] + " " + arr[i].length());
//        }
//    }

//VARIANT-3
//        Scanner console = new Scanner(System.in);
//
//        System.out.println("Введите количество строк:");
//
//        int n = console.nextInt();
//        String[] arr = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("Введите строку номер " + (i + 1) + ": ");
//            arr[i] = console.next();
//        }
//
//        int sum = 0;
//
//        for (int i = 0; i < n; i++){
//            sum += arr[i].length();
//        }
//        sum /= n;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i].length() < sum)
//                System.out.println("textext " + arr[i] + " " + arr[i].length());
//        }
//    }

//VARIANT-5
//        Scanner console = new Scanner(System.in);
//
//        System.out.println("ТЕКСТ:");
//        //String arr = new String();
//        String arr = console.nextLine();
//
//        StringBuilder sb = new StringBuilder(arr);
//        for (int i = 0; i <= sb.length(); i++)  {
//
//        }
//
//        char[] letters = arr.toCharArray();
//        int[] num = new int[arr.length()*2];
//
//        for (int i = 0; i < arr.length(); i++){
//            if (letters[i] >= 1072){
//                if (letters[i] == 'ё')
//                    num[i] = 7;
//                else if (letters[i] > 1077) //inache ne robit
//                    num[i] = letters[i] - 1070;
//                else
//                    num[i] = letters[i] - 1071;
//            } else {
//                if (letters[i] > 1045)
//                    num[i] = letters[i] - 1038;
//                else if (letters[i] == 1025)
//                    num[i] = 7;
//                else
//                    num[i] = letters[i] - 1039;
//            }
//        }
//
//        for (int i = 0; i < letters.length;i++){
//            if (letters[i] != ' ')
//                System.out.print(letters[i] + "  ");
//        }
//        System.out.print('\n');
//
//        for (int i = 0; i < letters.length;i++){
//            if (letters[i] != ' ') {
//                if (num[i] <= 9)
//                    System.out.print(num[i] + "  ");
//                else
//                    System.out.print(num[i] + " ");
//            }
//        }


//VARIANT-6
//        Scanner console = new Scanner(System.in);
//
//        System.out.println("ТЕКСТ:");
//        //String arr = new String();
//        String arr = console.nextLine();
//
//        char[] letters = arr.toCharArray();
//        char[] num = new char[arr.length()];
//
//        for (int i=0; i < letters.length;i++){
//            if (!(letters[i] == ' ' || (letters[i] < 91 && letters[i] > 64) || (letters[i] < 123 && letters[i] > 96)))
//                letters[i] = ' ';
//
//        }
//
//        for (int i=0; i < letters.length; i++)
//            System.out.print(num[i]);

//VARIANT-7
        /*Scanner console = new Scanner(System.in);

        System.out.println("ТЕКСТ:");
        String arr = console.nextLine();

        char[] letters = arr.toCharArray();
        char[] num = new char[arr.length()];
        boolean wordIscomplete = false;

        for (int i = 0; i < letters.length;i++){
            if (letters[i] != ' ') {
                num[i] = letters[i];
            }else
                for (int j = letters.length, t = 1; j > i; j--)
                    if (num[t-1] == letters[j]);

        }

        for (int i=0; i < letters.length; i++)
            System.out.print(num[i]); */