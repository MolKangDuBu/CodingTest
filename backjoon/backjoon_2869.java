import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.IntSummaryStatistics;

public class backjoon_2869 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            String Input = br.readLine();
            String []arr_Input = Input.split(" ");
            int A = Integer.valueOf(arr_Input[0]);
            int B = Integer.valueOf(arr_Input[1]);
            int V = Integer.valueOf(arr_Input[2]);
            int cnt;
            cnt =(V-B-1)/(A-B)+1;
            bw.write(String.valueOf(cnt));
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
