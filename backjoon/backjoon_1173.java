import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class backjoon_1173 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        

        try{
            String Input =br.readLine();//N m M T R
            String []arr_Input = Input.split(" ");
            
            int N = Integer.valueOf(arr_Input[0]);//운동 시간
            int m = Integer.valueOf(arr_Input[1]);;//초기 맥박
            int M = Integer.valueOf(arr_Input[2]);;//맥박 리미트
            int T = Integer.valueOf(arr_Input[3]);;//맥박 증가량
            int R = Integer.valueOf(arr_Input[4]);;//맥박 감소량
            
            int time =0;
            int ex =0;
            int X = m;
            
            while(ex!=N){
                if((M-m)<T){
                    time =-1;
                    break;
                };

                if(M>=(X+T)){
                    time++;
                    X+=T;
                    ex++;
                }else{
                    time++;
                    X-=R;
                    if(X<m){
                        X=m;
                    }
                }
            }

            bw.write(String.valueOf(time));
            bw.flush();


        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
