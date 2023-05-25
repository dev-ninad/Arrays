package array;
class solution {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotatearray(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] reverse(int[] arr, int si, int ei) {
        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
        return arr;

    }

    public static void rotatearray(int arr[], int k) {
        int n = arr.length;
        if (k > n) {
            k = k % n;
        }
        arr = reverse(arr, 0, n - k - 1);
        arr = reverse(arr, n - k, n - 1);
        arr = reverse(arr, 0, n - 1);

    }
}