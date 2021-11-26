import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup_1085 {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double h,b,c,s;
        double num=1;
        try{
        String Input =br.readLine();
        String hbcs[]=Input.split(" ");
        for(int i=0;i<hbcs.length;i++){
            num*=Integer.valueOf(hbcs[i]);
        }

        num = (num/8)/Math.pow(2, 20); 
        num = (double)Math.round(num*10)/10.0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(num)+" "+"MB");
        bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
