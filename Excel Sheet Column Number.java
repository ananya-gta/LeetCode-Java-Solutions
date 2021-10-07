class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
            int n=columnTitle.length();
             int base=26;
            for(int i=0; i<n; i++)
                    ans+= (columnTitle.charAt(i)-'A'+1) * Math.pow(base, n-i-1 );
            return ans ;
    }
}
