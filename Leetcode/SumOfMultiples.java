package Leetcode;

public class SumOfMultiples {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i=0; i<=n; i++){
            if(i%3 == 0 || i%5 == 0 || i%7 == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        SumOfMultiples sumOfMultiples = new SumOfMultiples();
        int res = sumOfMultiples.sumOfMultiples(8);
        System.out.println("Sum of multiples: " + res);
    }
}
