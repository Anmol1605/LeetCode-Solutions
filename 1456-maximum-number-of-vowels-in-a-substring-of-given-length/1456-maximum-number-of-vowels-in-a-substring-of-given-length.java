class Solution {
    public int maxVowels(String s, int k) {

        String vowels = "aeiou";
        int left = 0;
        int count = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            if (vowels.indexOf(s.charAt(right)) != -1) {
                count++;
            }

            if (right - left + 1 == k) {

                ans = Math.max(ans, count);

                if (vowels.indexOf(s.charAt(left)) != -1) {
                    count--;
                }

                left++;
            }
        }

        return ans;
    }
}