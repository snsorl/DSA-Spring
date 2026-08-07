package DSA;

import java.util.ArrayList;

public class MyArray {
    public static void main(String[] args){

        // Fixed size
        int[] array = new int[10];
        int[] myArray = {1,2,2,4};
        // myArray[4]=2; (out of bounds)

        // Dynamic size
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.remove(0);
        System.out.println(list);

    }
}
