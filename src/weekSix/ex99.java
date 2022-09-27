package weekSix;

public class ex99 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // code here
        for (int k : array) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
