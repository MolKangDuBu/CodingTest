import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class codeup_1096 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try{
            String len = br.readLine();
            String []Input  = new String[Integer.valueOf(len)];
            int [][]spot = new int[19][19];
            String []xy;

            for(int i=0; i<Integer.valueOf(len);i++){
                Input[i]= br.readLine();
            }
            
            for(int i =0; i<spot.length;i++){
                for(int j =0; j<spot[i].length;j++){
                    spot[i][j] =0;
                }
            }
 
            for(int i=0;i<Integer.valueOf(len);i++){
                xy = Input[i].split(" ");
                spot[Integer.valueOf(xy[0])-1][Integer.valueOf(xy[1])-1]=1;
            }
            
            
            for(int i =0; i<spot.length;i++){
                for(int j =0; j<spot[i].length;j++){
                    bw.write(String.valueOf(spot[i][j]));
                    if(j!=spot[i].length-1){
                        bw.write(" ");
                    }
                }
               bw.write("\n");
            }
            bw.flush();

        }catch(IOException e ){
            e.printStackTrace();
        }

    }
}
