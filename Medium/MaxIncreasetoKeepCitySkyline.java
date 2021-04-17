public class MaxIncreasetoKeepCitySkyline {
    public static void main(String[] args) {
        MaxIncreasetoKeepCitySkyline mikcs = new MaxIncreasetoKeepCitySkyline();
        mikcs.maxIncreaseKeepingSkyline(new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}});
    }
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int r_max = Integer.MIN_VALUE , c_max = Integer.MIN_VALUE , ans=0 , pos=0;
        int[] grid_r_max = new int[grid.length] , grid_c_max = new int[grid[0].length];
        // r = row , c = column
        for(int r=0; r<grid.length; r++){
            //找到該列最大
            for(int r1=0; r1<grid[r].length; r1++){
                if(grid[r][r1] > r_max) {
                    r_max = grid[r][r1];
                }
            }
            System.out.print(r_max+" ");
            //找到該行最大
            for(int c=0; c<grid[r].length; c++){
                if(grid[c][r] > c_max) {
                    c_max = grid[c][r];
                }
            }
            System.out.print(c_max+" ");
            System.out.println();
            r_max = Integer.MIN_VALUE;
            c_max = r_max;
        }
        return 0;
    }
}
