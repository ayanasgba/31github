interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        // if(n == 1){
        //     return n;
        // }
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0)
                sum = sum + i;
        }
        return sum;
    }
}
