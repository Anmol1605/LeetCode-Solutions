class Solution {
    public int singleNumber(int num[]) {
        int ans=0;
        for(int i=0;i<num.length;i++){
            ans=ans^num[i];
        }
        return ans;
    }
}
