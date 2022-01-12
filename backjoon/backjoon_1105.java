import java.util.Scanner;

public class backjoon_1105 {

    static int L;
    static int R;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        R = sc.nextInt();

        System.out.println(Count());

    }

    public static int Count() {
        int cnt = 0;
        
        String L_str = String.valueOf(L);
        String R_str = String.valueOf(R);
      
        if(L_str.length()==R_str.length()){
            for(int i=0;i<L_str.length();i++){
                if(L_str.charAt(i)!= R_str.charAt(i)){
                    break;
                }else{
                    if(L_str.charAt(i)=='8'){
                        cnt++;
                    }
                }
            }
        }
        

        return cnt;
    }
}
