class Solution {
    public String convertToBase7(int num) {
        String base="";
        boolean neg=num<0;
        int abs=Math.abs(num);
        if(num==0){ 
            return "0";
        }
        while(abs>0){
            base+=abs%7;
            abs=abs/7;
        }
        String ans=new StringBuilder(base).reverse().toString();
        return neg ? "-"+ans : ans;
    }
}