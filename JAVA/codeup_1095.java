import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup_1095 {
    public static void main(String[] args) {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
     try{
        String len = br.readLine();
        String order = br.readLine();
        String organize[] = order.split(" ");
        String temp;
        
        for(int i=0;i<organize.length-1;i++){
            for(int j =i+1; j<organize.length;j++){
                if(Integer.valueOf(organize[i])>Integer.valueOf(organize[j])){
                    temp=organize[i];
                    organize[i]= organize[j];
                    organize[j]=temp;
                }
            }    
        }

    
        bw.write(String.valueOf(organize[0]));
      
        bw.flush();

     }catch(IOException e){
         e.printStackTrace();
     }
    }
}
