package sortingAlgorithm;

public class MergeSort_BottomUp {
    static int[] arr = new int[10];
    private static int[] sorted;

    public static void main(String[] args) {
        arr = new int[]{4, 3, 6, 5, 7, 8, 12, 2, 1, 10};
        mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr) {
        sorted = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
        sorted = null;
    }

    private static void mergeSort(int[] arr, int left, int right) {

        // 1, 2, 4, 8 식으로 1부터 서브리스트를 나누는 기준을 두 배씩 늘림.
        for (int size = 1; size <= right; size += size) {
            System.out.println("Size : " + size);
            for (int l = 0; l <= right - size; l += (2 * size)) {
                int low = l;
                int mid = l + size - 1;
                int high = Math.min(l + (2 * size) - 1, right);
                System.out.println(low + " " + mid + " " + high);

                merge(arr, low, mid, high); // 병합

                System.out.print("Sorted : ");
                for (int i = 0; i < sorted.length; i++) {
                    System.out.print(sorted[i] + " ");
                }
                System.out.println();
            }


        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                sorted[idx] = arr[l];
                idx ++;
                l ++ ;
            }

            else {
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
