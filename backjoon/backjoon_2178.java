import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int x;
    int y;
    Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}


public class backjoon_2178 {


    static int row, col;
    static int [][]maze;
    static int [][] check;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        row = sc.nextInt();
        col = sc.nextInt();
        maze = new int[row][col];
        check= new int[row][col];
       

        for(int i =0; i<row;i++){
            String input = sc.next();
            for(int j =0; j<input.length();j++){
                maze[i][j] = Integer.valueOf(input.charAt(j))-'0';
            }
        }

        bfs(0,0);
        System.out.println(check[row-1][col-1]);

        


    }


    public static void bfs(int x, int y) {
            Queue<Node> queue = new LinkedList<>();
            check[x][y] =1;
            queue.add(new Node(x,y));
            while(!queue.isEmpty()){
                Node node = queue.poll();
                for(int i =0;i<4;i++){
                    int a = node.x+dx[i];
                    int b = node.y+dy[i];
                    if(a >= 0 &&b>=0 && a<row &&b<col){
                        if(check[a][b]==0 &&maze[a][b] ==1){
                            queue.add(new Node(a,b));
                            check[a][b] = check[node.x][node.y]+1;
                        }
                    }
                }
            }
    }
}
