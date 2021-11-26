import java.util.Scanner;

public class codeup_1078{
    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
        int sum=0;
        int number;

        number = scan.nextInt();

        for(int i=1; i<=number; i++){
        
            if(i%2==0){
                sum+=i;
            }
        
        }
        System.out.println(sum);

        
    }
}