package sortingAlgorithm;

public class SelectionSort {
    static int[] arr = new int[10];

    public static void main(String[] args) {
        arr = new int[]{4, 3, 6, 5, 7, 8, 12, 2, 1,10};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;

            // 최솟값 찾기
            for (int j = i+1; j < arr.length; j++) {
                // min_idx 값보다 현재 값이 더 작으면 min_idx 갱신
                if (arr[min_idx] > arr[j]) {
                    min_idx = j;
                }
            }

            // 위에서 찾은 최솟값이랑 현재 값이랑 위치 swap
            swap(arr, min_idx, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
