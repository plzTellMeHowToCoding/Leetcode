public class DistributeCandiestoPeople {
    public static void main(String[] args) {
        /*19.8.16*/
        DistributeCandiestoPeople dcp = new DistributeCandiestoPeople();
        for(int n :dcp.distributeCandies(60,4))
            System.out.println(n);
    }
    public int[] distributeCandies(int candies, int num_people) {
        //宣告回傳的陣列
        int[] result = new int[num_people];
        //宣告剩餘的糖果數，要給下一個人的糖果數，下一個人的編號
        int remain_candies = candies , give_to_next = 1 , ppl = 0;

        //若還有剩餘的糖果就一直給
        while(remain_candies > 0) {
            //判斷剩餘的糖果是否多過或等於要給下一個人的數量
            if(remain_candies >= give_to_next) {
                //將每一個人的糖果數量填入，使用餘數的用意為因為不知道每個人會分到幾次糖果
                //而填入的值為當前已得到的糖果數+這次會得到的糖果數
                result[ppl % num_people] += give_to_next;
                //扣掉這次發出去的糖果數 = 剩餘的糖果數
                remain_candies -= give_to_next;
                //給下一個人的糖果數要遞增
                give_to_next++;
                //指向下一個人的編號
                ppl++;
                //若剩餘的糖果數不夠給下一個人，則將剩餘的糖果全部給輪到該索引值的人
            } else  {
                result[ppl % num_people] += remain_candies;
                return result;
            }
        }
        return result;
    }
}
