class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums1) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        int[] temp = new int[nums1.length];
        int k = 0;
        for (int n : nums2) {
            int c = count.getOrDefault(n, 0);
            if (c > 0) {
                temp[k++] = n;
                count.put(n, c - 1);
            }
        }
        return java.util.Arrays.copyOf(temp, k);
    }
}