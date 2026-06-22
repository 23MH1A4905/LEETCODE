class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(char c:text.toCharArray()){
            if(c=='b'){
                b+=1;
            }
            else if(c=='a'){
                a+=1;
            }
            else if(c=='l'){
                l+=1;
            }
            else if(c=='o'){
                o+=1;
            }
            else if(c=='n'){
                n+=1;
            }
        }
        l/=2;
        o/=2;
        return Math.min(Math.min(b,a),Math.min(Math.min(l,o),n));
    }
}