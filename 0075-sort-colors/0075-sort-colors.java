class Solution {
    public void sortColors(int[] n) {
      for (int i = 0; i < n.length - 1; i++) {
          for (int j = n.length - 1; j > i; j--) {
              if (n[j] < n[i]) {
               int temp = n[i];
                n[i] = n[j];
                n[j] = temp;
                }
            }
      }
    }
}

   