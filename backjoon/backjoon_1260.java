import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class backjoon_1260 {

    static int link[][];
    static boolean check[];
    static int N;
    static int M;
    static int V;
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();// 정점 수
        M = sc.nextInt();// 간선 수
        V = sc.nextInt();// 시작 위치
        link = new int[N+1][N+1];
        check = new boolean[N+1];
        int x, y;

        for (int i = 0; i < M; i++) {//각 정점간 간선 연결
            x = sc.nextInt();
            y = sc.nextInt();
            link[x][y] = 1;
            link[y][x] = 1;
        }
        dfs(V);
        System.out.println();
        check = new boolean[N+1];
        bfs(V);

    }

    public static void dfs(int start) {
        System.out.print(start+" ");
        check[start]=true;
        for(int i=1;i<=N;i++){
            if(link[start][i]==1&&check[i]==false){
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        System.out.print(start+" ");
        check[start] = true;
        while(!queue.isEmpty()){
            int temp = queue.poll();

            for(int i=1; i<=N;i++){
                if(link[temp][i]==1 && check[i]== false){
                    queue.offer(i);
                    check[i]=true;
                    System.out.print(i+" ");
                }
            }
        }
    }
}
