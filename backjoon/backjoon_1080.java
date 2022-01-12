import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class backjoon_1080 {

    static int x, y;
    static int A[][];
    static int B[][];
    static int cnt = 0;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = br.readLine();
            String input_arr[] = input.split(" ");
            x = Integer.valueOf(input_arr[0]);
            y = Integer.valueOf(input_arr[1]);
            A = new int[x][y];
            B = new int[x][y];

            for (int i = 0; i < x; i++) {
                input = br.readLine();
                input_arr = input.split("");
                for (int j = 0; j < y; j++) {
                    A[i][j] = Integer.valueOf(input_arr[j]);
                }
            }

            for (int i = 0; i < x; i++) {
                input = br.readLine();
                input_arr = input.split("");
                for (int j = 0; j < y; j++) {
                    B[i][j] = Integer.valueOf(input_arr[j]);
                }
            }
            conversion();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void conversion() {
        for (int i = 0; i <= x - 3; i++) {
            for (int j = 0; j <= y - 3; j++) {
                if (A[i][j] != B[i][j]) {
                    cnt++;
                    for (int p = i; p < i + 3; p++) {
                        for (int q = j; q < j + 3; q++) {
                            A[p][q] = (A[p][q] == 0) ? 1 : 0;
                        }
                    }
                }
            }
        }

        boolean flag = true;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (A[i][j] != B[i][j]) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println((flag) ? cnt : -1);
    }
}
