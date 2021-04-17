public class SortArrayByParityII {
    public static void main(String[] args) {
        /*19.8.19*/
        SortArrayByParityII sabii = new SortArrayByParityII();
        for(int n : sabii.sortArrayByParityII(new int[]{4,2,5,7}))
            System.out.print(n+" ");
    }
    public int[] sortArrayByParityII(int[] A) {
        //宣告兩個陣列，一個用於存放奇數，一個存偶數
        int[] odd_arr = new int[A.length / 2];
        int[] even_arr = new int[A.length / 2];
        //odd_index = 奇數陣列索引、even_index = 偶數陣列索引、index = 用於存取奇偶陣列的索引值
        int odd_index =0, even_index = 0, index = 0;
        //走訪A陣列，並將A陣列中的奇數、偶數各自存放在奇數、偶數陣列中
        for(int num : A){
            if(num % 2 == 0)
                even_arr[even_index++] = num;
            else
                odd_arr[odd_index++] = num;
        }
        //將A陣列的值按奇偶順序排列
        for(int i=0 ; i<A.length ; i+=2){
            A[i] = even_arr[index];
            A[i+1] = odd_arr[index];
            index++;
        }
        return A;
    }
}
