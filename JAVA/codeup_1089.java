import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * codeup_1089
 */
public class codeup_1089 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String Input = br.readLine();
            String series[] = Input.split(" ");
            int sum, i=0;

            for(sum=Integer.valueOf(series[0]);i<Integer.valueOf(series[2])-1;i++){
            
                sum+=Integer.valueOf(series[1]);
         
            }
            bw.write(String.valueOf(sum));
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}