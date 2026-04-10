import java.util.*;
class Solution {
    public int maxSubArray(int num[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            ms=Math.max(cs,ms);
        if(cs<0){
            cs=0;
        }
        }
        return ms;
    }
}
