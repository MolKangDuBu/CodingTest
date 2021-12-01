import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CacheRequest;

/**
 * backjoon_2954
 */
public class backjoon_2954 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String Input = br.readLine();
            int temp =0;
            String base= "null";
            char c[] = {'a','e','i' ,'o','u'};
          
          
            for(int i=0;i<Input.length();i++){
                
                for(int j =0;j<c.length;j++){
            
                    if(Input.charAt(i)==c[j]){
                        Input = Input.substring(0, i+1)+Input.substring(i+3);
                        
                    }
                }
                
            }
            System.out.println(Input);
      
        }catch(IOException e){
            e.printStackTrace();;
        }
        
    }
}