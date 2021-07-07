class Solution {
    public int[] finalPrices(int[] prices) {
        int[] final_price= new int[prices.length];
            int ans=0;
            boolean changed=false;
            for(int i=0; i<prices.length-1; i++){
                    changed=false;
                    for(int j=i+1; j<prices.length; j++){
                            if(prices[j]<=prices[i]){
                                    ans=prices[i]-prices[j];
                                    changed=true;
                                    break;
                            }
                    }
                    if(changed){
                    final_price[i]=ans;
                }
                else{
                    final_price[i]=prices[i];
                } 
            }
            final_price[prices.length-1]=prices[prices.length-1];
            return final_price;
    }
}
