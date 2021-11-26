import java.util.Scanner;

/**
 * codeup_1082
 */
public class codeup_1082 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String Input = sc.nextLine();

        int dec;
        String hex;

        dec = Integer.parseInt(Input,16);
               
        
        for(int i =1; i<16;i++){
            hex = Integer.toHexString(i).toUpperCase();    
            System.out.println(Input+"*"+hex+"="+Integer.toHexString((dec*i)).toUpperCase());
        }

    }
}