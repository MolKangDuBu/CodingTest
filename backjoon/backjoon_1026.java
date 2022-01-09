import java.util.Arrays;
import java.util.Scanner;

public class backjoon_1026 {

    static int N;
    static int[] A;
    static int[] B;

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        A = new int[N];
        B = new int[N];


        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int sum=0;
        for(int i=0; i<N;i++){
            sum+=A[i]*B[(N-1)-i];
        }
        System.out.println(sum);
    }


}
