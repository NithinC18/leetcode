class Solution {
    public int countCommas(int n) {
        long count=0;
        long start=1000;

        while(n>=start){
            count += (n-start+1);
            start *= 1000;
        }
        return (int) count;
    }
}