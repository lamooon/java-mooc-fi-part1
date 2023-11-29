import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {

        int smallest = array[0];
        final int N = array.length;

        for (int i = 0; i < N; i++) {
            if (array[i] < smallest){
                smallest = array[i];   
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {

        int smallest = smallest(array);
        int index = 0;

        for (int i = 0;  i < array.length; i++)
        {
            if (array[i] == smallest) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        final int N = table.length - startIndex;
        int[] array = new int[N];

        for (int i = 0; i < N; i++){
            array[i] = table[i + startIndex];
        }

        int index = indexOfSmallest(array);
        return startIndex + index;
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {

        final int N = array.length;

        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }

        
    }
}
