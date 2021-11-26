import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup_1097 {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       try{

        String Input[] = new String[19];
        String bord[][] = new String[19][19];
        String len;
        String coordinate;
        String spot[];

        for(int i =0;i<19;i++){
            Input[i] = br.readLine();
            spot = Input[i].split(" ");
            for(int j = 0; j<19; j++){
                bord[i][j]=spot[j];
            }
        }
        len = br.readLine();
        
        for(int i =0;i<Integer.valueOf(len);i++){
            coordinate = br.readLine();
            spot = coordinate.split(" ");
            
            for(int x=0;x<19;x++){
                 
                if(bord[Integer.valueOf(spot[0])-1][x].equals("1")){
                    bord[Integer.valueOf(spot[0])-1][x] = "0";
                }else{
                    bord[Integer.valueOf(spot[0])-1][x] = "1";
                }
                    
            }

            for(int y=0;y<19;y++){
                
                if(bord[y][Integer.valueOf(spot[1])-1].equals("1")){
                    bord[y][Integer.valueOf(spot[1])-1] = "0";
                }else{
                    bord[y][Integer.valueOf(spot[1])-1] = "1";
                }
                    
            }


        }

        for(int i=0; i<bord.length; i++){
            for(int j = 0; j<bord[i].length;j++){
                    bw.write(bord[i][j]+" ");
            }
            bw.write("\n");
        }

        bw.flush();




       }catch(IOException e){
           e.printStackTrace();
       }
       
       
        
    }
}
