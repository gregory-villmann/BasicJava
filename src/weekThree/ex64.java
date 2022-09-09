package weekThree;

import java.util.ArrayList;

public class ex64 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(4);
        numbers.add(8);

        System.out.println(avg(numbers));


    }

    public static int sum(ArrayList<Integer> list) {
        int returnSum = 0;
        for(int i=0; i<list.size(); i++){
            returnSum += list.get(i);
        }
        return returnSum;
    }
    public static int avg(ArrayList<Integer> list){
        int sum = sum(list);

        return (sum / list.size());
    }
}
