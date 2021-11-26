import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * codeup_1087
 */
public class codeup_1087 {

    public static void main(String[] args) {
        int sum = 0;
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        try{
        String number = br.readLine();
        for(int i =0; i<=Integer.valueOf(number);i++){
            sum+=i;
            if(sum>=Integer.valueOf(number)){
                break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}