import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class backjoon_7489 {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total;
        BigInteger lim = new BigInteger("10000000000");
        int num;
        try{
            int MAX =Integer.parseInt(br.readLine());
            for(int i=0; i<MAX; i++){
                num = Integer.parseInt(br.readLine());
                total =BigInteger.ONE;
                for(int j=1;j<=num;j++){
                    total = total.multiply(BigInteger.valueOf(j));
                    while(total.remainder(BigInteger.TEN).compareTo(BigInteger.ZERO)==0){
                        total = total.divide(BigInteger.TEN);
                        total = total.remainder(lim);
                    }
                }
                System.out.println(total.remainder(BigInteger.TEN));
            }
          


        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
