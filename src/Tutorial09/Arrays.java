package Tutorial09;

import java.util.Scanner;

public class Arrays {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int[] integers = getIntegers(5);
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + integers[i]);
        }
        System.out.println("The average is " + getAverage(integers));
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }
    //Calculate the average 
    public static double getAverage(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            //By adding each element of the array
            sum += array[i];
        }
        //And dividing with the length
        return (double) sum / (double)array.length;
    }
}
