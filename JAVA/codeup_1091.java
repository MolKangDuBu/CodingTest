import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * codeup_1089
 */
public class codeup_1091 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String Input = br.readLine();
            String series[] = Input.split(" ");
            int i=0;
            long sum=0;
            for(sum=Integer.valueOf(series[0]);i<Integer.valueOf(series[3])-1;i++){
                
                sum=(sum*Integer.valueOf(series[1]))+Integer.valueOf(series[2]);
                
            }
            bw.write(String.valueOf(sum));
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}