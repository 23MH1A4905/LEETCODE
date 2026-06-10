class Solution {
    public int arrangeCoins(int n) {
        int rows=0;
        int need=1;
        while(n>=need){
            n-=need;
            rows++;
            need++;
        }
        return rows;
    }
}