import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * codeup_1086
 */
public class codeup_1086 {

    public static void main(String[] args) {
        int w,h,b;
        double pic=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            String line = br.readLine();
            String whb[] = line.split(" ");
            for(int i =0; i<whb.length;i++){
                pic*=Integer.valueOf(whb[i]);
            }

            pic=(pic/8)/Math.pow(2, 20);
       
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(String.valueOf(String.format("%.2f", pic))+" "+"MB");
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }
        

    }
}