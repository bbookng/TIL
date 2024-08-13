package sortingAlgorithm;

public class QuickSort {

    static int[] arr = new int[10];

    public static void main(String[] args) {
        arr = new int[]{4, 3, 6, 5, 7, 8, 12, 2, 1, 10};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        // partitioning 을 통해 서브 리스트를 만들고, 기준이 된 pivot 값을 반환 받아 다시 해당 pivot을 기준으로 partitioning.
        int pivot = partition(arr, left, right);

        // pivot 보다 작은 서브리스트 재귀적으로 정렬
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right;

        while (i < j) {
            // pivot 보다 큰 값을 찾을 때 까지
            while (arr[j] >= pivot && i < j) {
                j --;
            }

            // pivot 보다 작은 값을 찾을 때 까지
            while (arr[i] <= pivot && i < j) {
                i ++;
            }

            swap(arr, i, j);
        }

        swap(arr, left, i);

        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}