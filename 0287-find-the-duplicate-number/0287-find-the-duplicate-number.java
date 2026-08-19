class Solution {
    public int findDuplicate(int[] a) {
     int  slow=a[0];
     int fast=a[0];

     slow=a[slow];
     fast=a[fast];
     fast=a[fast];

     while(slow!=fast){
      slow=a[slow];
      fast=a[fast];
      fast=a[fast];
    }
     slow=a[0];
     while(slow!=fast){
      slow=a[slow];
      fast=a[fast];
      }
       return slow;
    }
}
  