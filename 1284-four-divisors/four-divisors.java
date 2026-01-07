class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i:nums){
            int count=0;
            int su=0;
           for(int j=1;j*j<=i;j++){
            if(i%j==0){
                int s1 = j;
                int s2 = i/j;

                    count++;
                    su += s1;

                    if (s1 != s2) {
                        count++;
                        su += s2;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                sum += su;
            }
        }
        return sum;
    }
}