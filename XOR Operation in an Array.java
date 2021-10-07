class Solution {
    public int xorOperation(int n, int start) {
        int[] nums= new int[n];
            for(int i=0; i<n; i++){
                    nums[i]= start;
                    start+=2;
            }
            int ans=0;
            for(int i=0; i<n; i++)
            ans=ans^ nums[i];
            return ans;
    }
}
