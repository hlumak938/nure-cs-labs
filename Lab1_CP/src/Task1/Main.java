package Task1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int size;
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter array size: ");
                size = in.nextInt();
                if(size == 0 || size < 0){
                    System.out.println("Enter array size > 0: ");
                    continue;
                }
                break;
            } catch (Exception ex) { System.out.println("Enter an integer!"); }
        }
        int[] arr = new int[size];
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter numbers: ");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }
                break;
            } catch (Exception ex) {
                System.out.println("Enter an integer!");
            }
        }
        int[] ArrOfLengths = new int[size];
        System.out.println();
        double average = FindAverageLength(arr, ArrOfLengths);
        System.out.println("Array of lengths: " + Arrays.toString(ArrOfLengths));
        System.out.println("Average length = " + average);
        System.out.print("Numbers that are > average length: ");
        System.out.println(PrintNumsGreaterAverage(arr, ArrOfLengths, average));
        System.out.print("Numbers that are < average length: ");
        System.out.println(PrintNumsSmallerAverage(arr, ArrOfLengths, average));
    }
    public static double FindAverageLength(int[] array, int[] ArrayOfLengths){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            ArrayOfLengths[i] = (int)(Math.log10(Math.abs(array[i])) + 1);
            sum += ArrayOfLengths[i];
        }
        return (double) sum / ArrayOfLengths.length;
    }
    public static ArrayList<Integer> PrintNumsGreaterAverage(int[] array, int[]
            ArrayOfLengths, double average){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (ArrayOfLengths[i] > average) {
                result.add(array[i]);
            }
        }
        return result;
    }
    public static ArrayList<Integer> PrintNumsSmallerAverage(int[] array, int[]
            ArrayOfLengths, double average) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (ArrayOfLengths[i] < average) {
                result.add(array[i]);
            }
        }
        return result;
    }
}
