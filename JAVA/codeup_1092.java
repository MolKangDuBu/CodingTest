import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup_1092 {
    public static void main(String[] args) {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        try{
        
            String Input = br.readLine();
            String day[] = Input.split(" ");
            int count = 1;
            while(count%Integer.valueOf(day[0])!=0 || count%Integer.valueOf(day[1])!=0 || count%Integer.valueOf(day[2])!=0) {
                count++; 
            }
            bw.write(String.valueOf(count));
            bw.flush();
            



        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
