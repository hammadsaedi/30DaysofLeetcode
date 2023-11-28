class Solution {
    public int findMin(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (array[mid] > array[mid + 1])
                return array[mid + 1];
            else if (array[mid] < array[start])
                end = mid;
            else
                start = mid + 1;
        }
        return array[0];
    }
}