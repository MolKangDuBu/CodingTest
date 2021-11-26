import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup_1093 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        try{
            String len = br.readLine();
            String Input = br.readLine();
            String count[] = Input.split(" ");
            int call[] = new int[23];
            for(int i =0; i<call.length;i++){
                call[i]=0;
            }
            for(int i =0;i<count.length;i++){
                call[Integer.valueOf(count[i])-1]++;
            }

            for(int i=0;i<call.length;i++){
                bw.write(call[i]+" ");
            }
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
