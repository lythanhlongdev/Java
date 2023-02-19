import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class SortOfArray {

    /*
        Độ phức tạp O(n^2)

    */
    public static int[] bubleSort(int[] array) {
        int size = array.length;
        int temp;
        boolean break_ = false;
        if (size > 2) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = size - 1; j > i; j--) {
                    if (array[j] < array[j - 1]) {
                        temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                        break_ = true;
                    }
                    if (break_ == false) break;
                }
            }
        } else if (size == 2) {
            if (array[0] > array[1]) {
                swap(array, 0, 1);
            }
        }
        return array;
    }

    public static int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static void printArray(int[] array) {
        if (array.length > 0){
            String s = "";
            for (int item : array) {
                s += item + " ";
            }
            System.out.println(s);
        }
    }


    static void usingRandomClass() {
        //Vòng lặp in ra 5 số ngẫu nhiên
        for (int i=0; i<5; i++) {
            Random rand = new Random();
            int ranNum = rand.nextInt(100)+1;
            System.out.println("Random number is " + ranNum);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {


    }
}