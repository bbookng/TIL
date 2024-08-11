package sortingAlgorithm;

public class InsertionSort {
    static int[] arr = new int[10];
    public static void main(String[] args) {
        arr = new int[]{4, 3, 6, 5, 7, 8, 12, 2, 1, 10};
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int targetNumber = arr[i];
            int j = i-1;

//            // 위치를 찾을 때 까지 subList 원소들이랑 뒤에서부터 (targetNumber 바로 전부터) 비교하며 swap 시켜줌
//            while (arr[j] > targetNumber && j >= 0) {
//                // swap
//                arr[j+1] = arr[j];
//                // 그 다음 요소로 index 바꿔줌
//                j --;
//            }

            // 위치를 찾을 때 까지 subList 원소들이랑 뒤에서부터 (targetNumber 바로 전부터) 비교하며 swap 시켜줌
            while (j >= 0 && targetNumber < arr[j]) {
                // 한 칸씩 뒤로 미룸
                arr[j+1] = arr[j];
                // 그 다음 요소로 index 바꿔줌
                j --;
            }

            // while 문을 빠져나오고 나면 마지막 비교한 원소가 targetNumber 보다 작아서 탈출했기 때문에
            // 작은 원소 + 1의 index 에 targetNumber를 넣어 정렬해줌
            arr[j+1] = targetNumber;
        }
    }
}
