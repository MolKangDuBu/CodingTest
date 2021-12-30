import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class backjoon_1913 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.valueOf(br.readLine());
            int Find =Integer.valueOf(br.readLine());
            StringBuilder sb = new StringBuilder();
            int MAX = N * N;
            int[][] Arr = new int[N][N];
            int len = N;
            int x = -1;
            int y = 0;

            while (true) {
                if (MAX == 0)
                    break;
                // 아래
                for (int i = 0; i < len; i++) {
                    Arr[++x][y] = MAX--;
                }
                len--;
                // 오른쪽
                for (int i = 0; i < len; i++) {
                    Arr[x][++y] = MAX--;
                }
                // 위
                for (int i = 0; i < len; i++) {
                    Arr[--x][y] = MAX--;
                }
                len--;
                // 왼쪽
                for (int i = 0; i < len; i++) {
                    Arr[x][--y] = MAX--;
                }
            }
    
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(Arr[i][j]+" ");
                    if (Find == Arr[i][j]) {
                        x = i + 1;
                        y = j + 1;
                    }
                }
               sb.append("\n");
            }
            System.out.print(sb.toString());
            System.out.println(x + " " + y);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 아래 오른쪽 위 왼쪽 ...반복

     

    }
}
