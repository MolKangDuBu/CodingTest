import java.util.Scanner;

public class codeup_1083 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int Input = sc.nextInt();
        for(int i=1;i<=Input;i++){
            
            if(i%3==0){
                System.out.print("X");
            }else{
                System.out.print(i);
            }
            System.out.print(" ");
        }

    }
}