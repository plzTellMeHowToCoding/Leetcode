public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.7.9*/
		
		BestTimetoBuyandSellStock btbs = new BestTimetoBuyandSellStock();
		//new int[]{7,1,5,3,6,4})
		//new int[]{7,6,4,3,1}
		System.out.println(btbs.maxProfit(new int[]{7,1,5,3,6,4}));
	}
    public int maxProfit(int[] prices) {
    	//宣告兩個變數，profit用來存放得到的最大利益，minStock用來存放買到的最便宜股票
        int profit = 0 , minStock = Integer.MAX_VALUE;
        
        //走訪陣列所有元素
        for(int price : prices){
        	//若當前股票的金額小於最便宜股票，將最便宜股票的值設為當前金額
        	if(price < minStock)
        		minStock = price;
        	//若沒有小於當前股票金額，代表今日股票的價格是較購買時多的，再判斷當前股票金額-最便宜股票金額是否有超過能得到的最大利益，若能則將最大利益設為(當前股票金額-已購買的最便宜股票)
        	else if(price - minStock > profit)
        		profit = price - minStock;
        }
        
        return profit;
        
        /*使用雙層迴圈，外層 = 購買的股票，內層 = 賣出的價錢
        for(int i=0 ; i<prices.length-1 ; i++){
        	for(int j=i+1 ; j<prices.length ; j++){
        		//若賣出的價錢比買入高，就設定profit等於價差
        		if(prices[j]-prices[i] > profit)
        			profit = prices[j] - prices[i];
        	}
        }
        
        return profit;
        */
    }
}
