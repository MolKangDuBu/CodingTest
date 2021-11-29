import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * backjoon_1316
 */
public class backjoon_1316 {

    public static void main(String[] args) {
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String sub;
        int check =0;
        int result =0;//MAX-result

        try{
            String len = br.readLine();
            int MAX = Integer.valueOf(len);
            result =MAX;
            String Input[] = new String[MAX];

            for(int i =0;i<MAX;i++){
                Input[i] = br.readLine();
            }

            for(int i=0; i<MAX; i++){
                for(int x=0; x<Input[i].length()-1; x++){
                    if(Input[i].charAt(x) ==Input[i].charAt(x+1)){

                    }else{
                        sub =Input[i].substring(x+1);
                        if(sub.contains(Character.toString(Input[i].charAt(x)))){
                            result--;
                            break;
                        }
                    }
                }
            }
       
                
            bw.write(String.valueOf(result));
            bw.flush();


        }catch(IOException e){
            e.printStackTrace();
        }
        



    }
}