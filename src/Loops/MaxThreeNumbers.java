package Loops;

public class MaxThreeNumbers {
    public static void main(String[] args) {

        int[] numbers = {10, 4, 3, 50, 23, 90};
        //Find the largest three distinct elements in an array
        //Input: arr[] = {10, 4, 3, 50, 23, 90}
        //Output: 90, 50, 23


        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int each : numbers) {
            if (each > max1){
                max3 = max2;
                max2 = max1;
                max1 = each;
            } else if (each > max2) {
                max3 = max2;
                max2 = each;
            }else if (each > max3){
                max3 = each;
            }
        }
        System.out.println("max1 = " + max1);
        System.out.println("max2 = " + max2);
        System.out.println("max3 = " + max3);

    }
}
