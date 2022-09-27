package weekSix;

public class ex97 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        if (array.length == 0) return;
        if(array.length == 1) System.out.println(array[0]);
        for (int i = 0; i<array.length ; i++){
            if(i == array.length-1){
                System.out.println(array[i]);
            } else{
                System.out.print(array[i] + ", ");
            }

        }

    }
}

