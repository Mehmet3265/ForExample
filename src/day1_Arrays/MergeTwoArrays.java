package day1_Arrays;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        char ch1[]={'A','B','C'};
        char ch2[]={'D','E','F','G','H'};

        char ch3[]=new char[ch1.length+ch2.length];

        int i=0;
        for (char c : ch1) {
            ch3[i++]=c;
        }
        for (char c : ch2) {
            ch3[i++]=c;
        }
        System.out.println(Arrays.toString(ch3));

        String arry1[]={"Ali","Ahmet","Mehmet","Fatih","Furkan"};
        String arry2[]={"Tony","Natasha","Rody"};

        String arry3[]= new String[arry1.length+arry2.length];

        int num=0;
        for (String af : arry1) {
            arry3[num++]=af;
        }
        for (String fa : arry2) {
            arry3[num++]=fa;
        }
        System.out.println(Arrays.toString(arry3));

        /*
        String arry1[]={"Ali","Ahmet","Mehmet","Fatih","Furkan"};
        String arry2[]={"Tony","Natasha","Rody"};
        String friends[]=new String[arry1.length+arry2.length];


        int n=0;
        for (String each:arry1) {
            friends[n++]=each;
        }

        for (String each : arry2) {
            friends[n++]=each;
        }
        System.out.println(Arrays.toString(friends));

        System.out.println("------------------------------------------");

        char ch1[]={'A','B','C'};
        char ch2[]={'D','E','F','G','H'};

        char ch3[]=new char[ch1.length+ch2.length];

        int i=0;
        for (char each : ch1) {
            ch3[i++]=each;
        }

        for (char beach : ch2) {
            ch3[i++]=beach;
        }
        System.out.println(Arrays.toString(ch3));

         */


    }
}
