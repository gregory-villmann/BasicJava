package weekSix;

import java.util.Arrays;
import java.util.Scanner;

public class ex98 {
    public static void main(String[] args){
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
        }
    public static int[] copy(int[] array){
        int[] copy = new int[array.length];

        for(int i = 0; i<array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] reverseCopy(int[] array){
        int[] copy = new int[array.length];

        for(int i = 0; i<array.length; i++){
            copy[i] = array[array.length-i-1];
        }
        return copy;
    }

}
