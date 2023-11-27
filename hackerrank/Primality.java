public class Solution { 
    public static void main(String[] args) throws IOException { 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 
 
        String n = bufferedReader.readLine(); 
         
        BigInteger num = new BigInteger(n); 
        if(num.isProbablePrime(1)){ 
            System.out.println("prime"); 
        } else { 
            System.out.println("not prime");  
        } 
         
        bufferedReader.close(); 
    } 
}
