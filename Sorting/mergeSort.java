package Sorting;

class mergeSort {
    public static void main(String[] args) {

        int arr[] = { 3, 6, 4, 1, 3, 9, 7, 5 };
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int arr[], int left, int mid, int right) {
        int temp[] = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in
        // temp
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        // add elements left in the first interval
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        // add elements left in the second interval
        while (j <= right) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        // copy temp to original interval
        for (i = left; i <= right; i += 1) {
            arr[i] = temp[i - left];
        }

    }

}