import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class codeup_1084 {
    public static void main(String[] args) {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       try{
           String Input= br.readLine();
           int sum=0;
           String rgb[] = Input.split(" ");

           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int i=0;i<Integer.valueOf(rgb[0]);i++){
                for(int j =0;j<Integer.valueOf(rgb[1]);j++){
                    for(int z=0;z<Integer.valueOf(rgb[2]);z++){
                        bw.write(i+" "+j+" "+z+"\n");
                        sum++;
                    }
                }
            }
            bw.write(String.valueOf(sum));
            bw.flush();
       }catch(IOException e){
            e.printStackTrace();
       }
 }
}