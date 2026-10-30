class Solution {
    public void rotate(int[] nums, int k) {
        Rotate(nums,k);
    }
        public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		// Starting n-k Reverse
		Reverse(arr, 0, n - k - 1);							

		// Last k Reverse\
		Reverse(arr, n - k, n - 1);							

		// Total element Reverse
		Reverse(arr, 0, n - 1);

	}

	public static void Reverse(int[] arr, int i, int j) {
		while (i < j){ 																						
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}