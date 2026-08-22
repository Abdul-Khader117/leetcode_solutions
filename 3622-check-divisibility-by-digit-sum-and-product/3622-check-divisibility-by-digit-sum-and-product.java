class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int num=n;
        while(n > 0){
            sum += n % 10;
            product *= n % 10;
            n = n / 10;
        }
        int abdul = (sum + product);
        if(num % abdul == 0){
            return true;
        }
        return false;
    }
}