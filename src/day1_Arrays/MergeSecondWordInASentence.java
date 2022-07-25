package day1_Arrays;

import java.util.Arrays;

public class MergeSecondWordInASentence {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String[] splited= sentence.split(" ");

        String reversed="";
        for (int i=splited[1].length()-1;i>=0;i--){
            reversed+=splited[1].charAt(i);
        }
        System.out.println(reversed);

        splited[1]=reversed;

        System.out.println(Arrays.toString(splited));

        for (String split : splited) {
            System.out.print(split+" ");
        }
    }
}
