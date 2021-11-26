import java.util.Scanner;

public class codeup_1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        line = sc.nextLine();
        String[] str = line.split(" ");
        
        for(int i=0; i<str.length;i++){
        
            if(str[i].equals("q")){
                System.out.println(str[i]);
                break;
            }
            System.out.println(str[i]);
        }


    }    
}
