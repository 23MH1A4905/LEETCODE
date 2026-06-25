class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean negative = num < 0;
        num = Math.abs(num);
        String base="";
        while(num!=0){
            
            base+=num%7;
            num=num/7;
        }
        String ans = new StringBuilder(base).reverse().toString();

        return negative ? "-" + ans : ans;
    }
}