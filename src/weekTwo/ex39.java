package weekTwo;

public class ex39 {
    private static void printStars(int amount) {
        int i = 0;
        while(i < amount){
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }
    private static void printSquare(int sideLength){
        int i = 0;

        while(i < sideLength){
            int j = 0;
            while(j < sideLength){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }

    private static void printRectangle(int width, int length){
        int i = 0;

        while(i < length){
            int j = 0;
            while(j < width){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }

    private static void printTriangle(int size){
        int row = 1;
        while(row <= size){
            for(int j = 0; j<row; j++){
                System.out.print("*");
            }
            System.out.print("\n");
            row++;
        }
    }

    public static void main(String[] args) {
        printTriangle(5);

        System.out.print("\n");

        printRectangle(3,2);

        System.out.print("\n");

        printSquare(5);

        System.out.print("\n");

        printStars(3);
    }
}
