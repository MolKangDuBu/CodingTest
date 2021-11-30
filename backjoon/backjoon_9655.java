import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

/**
 * backjoon_9655
 */
public class backjoon_9655 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String Input = br.readLine();
            int MAX = Integer.valueOf(Input);
            boolean player=true;
            String winner= "";
            while(MAX>0){
                if(MAX >3){
                    MAX-=3;
                    
                }else{
                    MAX-=1;
                }
                if(MAX!=0)player = !player;
            }
            if(player){
                winner ="SK";
            }else{
                winner = "CY";
            }

            bw.write(winner);
            bw.flush();

        
        }catch(IOException e){
            e.printStackTrace();
        }



        

    }
}