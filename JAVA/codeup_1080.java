import java.util.Scanner;

public class codeup_1080 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        int i=1;
        number =sc.nextInt();

        for(;;i++){
            sum+=i;
            if(sum>=number){
                break;
            }
            
        }
        System.out.println(i);
    }
}
