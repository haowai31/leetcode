/**
 * Created by qinsky31 on 2015/1/28.
 */
public class Solution {
    public static int maxProfit(int[] prices) {
        if (prices.length==0) {
            return 0;
        }
        int result = 0;
        int low = prices[0];

        for (int i=1;i<prices.length;i++) {
            if (low>prices[i]) {
                low = prices[i];
            }else if  (prices[i] - low>result) {
                result = prices[i] - low;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {1,8,5,7,2};
        System.out.println(maxProfit(prices));
    }
}
