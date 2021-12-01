import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_1475 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String Input = br.readLine();
            int []num = new int[10];
            int MAX=0;
            int pos=0;

            for(int i=0;i<Input.length();i++){
                if((Input.charAt(i)-'0')==9){
                    num[6]++;      
                }else{
                    num[(Input.charAt(i)-'0')]++;
                }
            }

            int k = num[6]+num[9];
            if(k%2==0){
                num[6]=k/2;
                num[9] = k/2;
            }else{
                num[6] = k/2 +1;
                num[9] = k/2 +1;
            }

            for(int i :num){
                MAX = Math.max(MAX,i);
            }
            
            System.out.println(MAX);


        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
