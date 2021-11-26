import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class codeup_1098 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String bord[][];
        String size;
        String arr_size[];
        String count;
        String Input;
        String arr_Input[];

       try{
            size = br.readLine();
            arr_size =  size.split(" ");
            count = br.readLine();
            
            
            bord = new String[Integer.valueOf(arr_size[0])][Integer.valueOf(arr_size[1])];

            for(int i=0; i<Integer.valueOf(arr_size[0]);i++){
                for(int j =0; j<Integer.valueOf(arr_size[1]); j++){
                    bord[i][j] ="0";
                }
            }


            for(int i =0; i<Integer.valueOf(count); i++){
                Input = br.readLine();
                arr_Input = Input.split(" ");
 

                if(arr_Input[1].equals("0")){
                        
                    for(int x=0; x<Integer.valueOf(arr_Input[0]);x++){
                            bord[Integer.valueOf(arr_Input[2])-1][Integer.valueOf(arr_Input[3])-1+x] ="1";
                    }
                        
                }else if(arr_Input[1].equals("1")){
                        
                    for(int x=0; x<Integer.valueOf(arr_Input[0]);x++){
                            bord[Integer.valueOf(arr_Input[2])-1+x][Integer.valueOf(arr_Input[3])-1] ="1";
                    }
                }
                
            }

            for(int i =0; i<bord.length;i++){
                for(int j=0; j<bord[i].length; j++){
                    bw.write(bord[i][j]+" ");
                }
                bw.write("\n");
            }
            bw.flush();
       

       }catch(IOException e){

       }



    }
}
