public class RotatedDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6};
        int target = 3;

        System.out.println("Pivot with duplicates: " + findPivotWithDuplicates(arr));
        System.out.println("Target found at index: " + searchRange(arr, target, 0, arr.length - 1));
    }

    static int searchRange(int[] arr, int target, int start, int end) {
        int pivot = findPivotWithDuplicates(arr);

        if (pivot == -1) {
            // Array is not rotated, do a binary search
            return BinarySearch(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }

        // Search in the left half or the right half
        if (target >= arr[start]) {
            return BinarySearch(arr, target, 0, pivot - 1);
        }
        return BinarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Skip duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // Left side is sorted, pivot must be on the right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
