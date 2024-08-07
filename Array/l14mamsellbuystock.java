public class l14mamsellbuystock {
    public static void profit(int prices[]){
        int buy=Integer.MAX_VALUE;
        int sell=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            if(prices[i]>sell){
                sell=prices[i];
            }
        }
        System.out.println("profit = "+(sell-buy));
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        profit(prices);
    }
    
}
