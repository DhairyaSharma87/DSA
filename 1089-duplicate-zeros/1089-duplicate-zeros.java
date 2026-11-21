class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] copy = new int[n];
        int j = 0;

        for (int i = 0; i < n && j < n; i++) {
            copy[j++] = arr[i];
            if (arr[i] == 0 && j < n) {
                copy[j++] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = copy[i];
        }
    }
}
