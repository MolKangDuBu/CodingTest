import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;



public class backjoon_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int temp =0;
        Queue<Integer>card = new LinkedList<>(); 
       
        
        for(int i =0; i<N;i++){
            card.offer(i+1);
        }

        while(card.size()!=1){
         card.remove();
         temp =card.poll();
         card.offer(temp);
        }
        System.out.println(card.poll());
    }   
}
