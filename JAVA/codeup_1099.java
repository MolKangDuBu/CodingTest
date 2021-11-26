import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class codeup_1099 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      
        final int MAX_SIZE =10;
        final int START = 1;
        int i=0, j=0;
        String bord[][]= new String[MAX_SIZE][MAX_SIZE];
        String Input;
        String arr_Input[];

       
        for(int x=0; x<MAX_SIZE; x++){
            for(int y=0; y<MAX_SIZE;y++){
              bord[x][y] = "0";
            }
        }

        try{
           
            for(int x=0;x<MAX_SIZE;x++){
                Input = br.readLine();
                arr_Input = Input.split(" ");    
                for(int y=0; y<MAX_SIZE; y++){
                    bord[x][y] =arr_Input[y];
                    
                }
            }
            
            while(true){
                
                if(bord[START+i][START+j].equals("2")){
                    bord[START+i][START+j] ="9";
                    break;
                }else if(bord[START+i][START+j].equals("0")){
                    bord[START+i][START+j] ="9";
                }else if(bord[START+i][START+j].equals("1")){
                    break;    
                }
                if(bord[START+i][START+j+1].equals("1")){
                    if(bord[START+i+1][START+j].equals("1")){
                        break;
                    }
                    i++;
                }else{
                    j++;
                }
            }

            for(int x=0; x<MAX_SIZE; x++){
                for(int y=0; y<MAX_SIZE;y++){
                   bw.write(bord[x][y]+" ");
                }
                bw.write("\n");
            }
            bw.flush();
        
    }catch(IOException e){
        e.printStackTrace();
    }

    }
}
