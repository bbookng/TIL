package sortingAlgorithm;

public class MergeSort {
    static int[] arr = new int[10];
    static int[] sorted;

    public static void main(String[] args) {
        arr = new int[]{4, 3, 6, 5, 7, 8, 12, 2, 1, 10};
        sorted = new int[arr.length];

        mergeSort(arr, 0, arr.length - 1);
        sorted = null;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        // 더이상 쪼갤 수 없으므로 return
        if (left == right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid); // left ~ mid
        mergeSort(arr, mid + 1, right); // mid + 1 ~ right

        // 병합
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int l = left; // 왼쪽 부분리스트 시작점
        int r = mid + 1; // 오른쪽 부분리스트 시작점
        int idx = left; // sorted 배열을 채워넣기 위한 인덱스

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                sorted[idx] = arr[l];
                idx ++;
                l ++;
            } else {
                sorted[idx] = arr[r];
                idx ++;
                r ++;
            }
        }

        if (l > mid) {
            while (r <= right) {
                sorted[idx] = arr[r];
                idx ++;
                r ++;
            }
        } else {
            while (l <= mid) {
                sorted[idx] = arr[l];
                idx ++;
                l ++;
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = sorted[i];
        }
    }
}
