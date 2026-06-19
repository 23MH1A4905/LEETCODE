class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] high=new int[n+1];
        high[0]=0;
        for(int i=0;i<n;i++){
            high[i+1]=gain[i]+high[i];
        }
        int max=high[0];
        for(int i=1;i<n+1;i++){
            if(high[i]>max){
                max=high[i];
            }
        }
        return max;
    }
}