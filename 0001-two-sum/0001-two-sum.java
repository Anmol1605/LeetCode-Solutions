class Solution {
    public int[] twoSum(int nums[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int co = target - nums[i];

            if (map.containsKey(co)) {
                return new int[]{map.get(co), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}