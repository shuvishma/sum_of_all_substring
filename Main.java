import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.nio.Buffer;

//import jdk.internal.org.jline.utils.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ;
        String str = read.readLine().trim();
        //System.out.println(str);
        
        long[] dp = new long[str.length()] ;
        long mod = 1000000007 ;
        dp[0] = str.charAt(0) - '0' ;
        long sum = dp[0] ;
        for(int i=1; i<str.length(); i++) {
            long temp = str.charAt(i) - '0' ;
            dp[i] = (10*dp[i-1] + (i+1)*temp)%mod ;
            sum = (sum + dp[i]%mod) % mod ;
        }

        System.out.println(sum);
    }
}