package Loops;

public class CharAtHighestFrequency {
    public static void main(String[] args) {
        String str="aaaaaaabbbcccd";
        String result="";
        int highestFrequency=0;

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char each=str.charAt(j);
                if (ch==each){
                    count++;
                }
            }

            if (count>highestFrequency){
                highestFrequency=count;
            }
        }

        //the upper one is for detecting the highest frequency
        //and the one that is below for the char which is the highes frequency  (en yüksek tekrar edeni
        // frekansı en yüksek olanla eşitleyerek karakterini çıkarttık.)

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (ch==str.charAt(j)){
                    count++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            if (count==highestFrequency){
                result+=ch;
            }
        }
        System.out.println(result);
        //6.  Write a program that can find the character that has the highest frequency from a string

    }
}
