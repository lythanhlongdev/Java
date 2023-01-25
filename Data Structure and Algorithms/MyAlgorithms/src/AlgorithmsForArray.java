public class AlgorithmsForArray {

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

    public static void main(String[] args) {

//        int array[] = {10,7,6,5,1};
        int array[] = {1,2};
        System.out.println(array.length);
        array = bubleSort(array);
        printArray(array);
    }
}
