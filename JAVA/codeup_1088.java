import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup_1088 {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            String Input = br.readLine();
            for(int i=0; i<=Integer.valueOf(Input);i++){
                
                if(i%3==0)continue;
                bw.write(String.valueOf(i)+" ");
            }
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
