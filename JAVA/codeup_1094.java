import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.IntSummaryStatistics;

public class codeup_1094 {
    public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      

      try{
      String len = br.readLine();
      String call = br.readLine();
      String output[] = call.split(" ");

      for(int i=output.length-1; i>=0;i--){
        bw.write(String.valueOf(output[i])+" ");
      }
      bw.flush();
      }catch(IOException e){

      }

    }
}
