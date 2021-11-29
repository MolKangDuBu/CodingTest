import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class backjoon_1652 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            
            String len = br.readLine();   
            int MAX = Integer.valueOf(len);
          
            String []arr_Input = new String[MAX];
           
            for(int i =0; i<Integer.valueOf(len);i++){
                arr_Input[i] = br.readLine();
           }
           
            int x=0,y=0;
            int xcheck=0, ycheck=0;
          
            for(int i=0; i<MAX; i++){
                for(int j =0; j<MAX; j++){
                    if(arr_Input[i].charAt(j)=='.'){
                        xcheck++;
                        if(j==MAX-1&&xcheck >=2){
                            x++;
                        }
                    }else{
                        if(xcheck>=2){
                            x++;
                        }
                        xcheck =0;
                    }
                }

                xcheck =0;
            }

            for(int i=0; i<MAX; i++){
                for(int j =0; j<MAX; j++){
                    if(arr_Input[j].charAt(i)=='.'){
                        ycheck++;
                        if(j==MAX-1&&ycheck >=2){
                            y++;
                        }
                    }else{
                        if(ycheck>=2){
                            y++;
                        }
                        ycheck =0;
                    }
                }
                
                ycheck =0;
            }


            bw.write(String.valueOf(x)+" "+String.valueOf(y));
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
     

    }
}
