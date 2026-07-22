class Solution {
    public int numberOfSteps(int num) {
        int even=0;
        int odd=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
                even++;
            }
            else if(num%2!=0){
                num-=1;
                odd++;
            }
        }
        int count = even+odd;
        return count;
        
    }
}