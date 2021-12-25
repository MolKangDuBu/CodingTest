import java.io.BufferedReader;
import java.io.InputStreamReader;

public class backjoon_1072 {
    static long X,Y,Z;

    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        try{
            String Input = br.readLine();
            String []conversion =  Input.split(" ");
            X = Integer.valueOf(conversion[0]);
            Y = Integer.valueOf(conversion[1]);
            Z = Y*100/X;
        
            if(Z>=99){
                System.out.println(-1);
            }else{
                Search(1,X);
            }
           
           
        }catch(Exception e){
            
        }

    }

    public static void Search(long start, long end){
        long bin=0;
        long result=0;
        while(start<=end){
            bin = (start+end)/2;
            result = (Y+bin)*100/(X+bin);

            if(result >Z){
                end = bin-1;
            }else{
                start = bin +1;
            }
            
        }
        System.out.println(start);
    }
}
