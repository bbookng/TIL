package sortingAlgorithm;

public class BubbleSort {
    static int[] arr = new int[10];
    
    public static void main(String[] args) {
        arr = new int[]{4, 3, 6, 5, 7, 8, 12, 2, 1,10};
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    private static void bubbleSort(int[] arr) {
        int size = arr.length;

        // 배열 size - 1 만큼 진행
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
