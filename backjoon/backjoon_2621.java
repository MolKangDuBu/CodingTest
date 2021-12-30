import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Card implements Comparable<Card>{
    String color;
    int number;

    public Card(String color, int number){
        this.color = color;
        this.number =number;
    }

    @Override
    public int compareTo(Card c){
        return (this.number-c.number);
    }

}



public class backjoon_2621 {

    static ArrayList<Card>list;
    static ArrayList<String>COLOR;
    static ArrayList<Integer>NUMBER;
    static int check[];
    static int MAX, ANSWER;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        list= new ArrayList<Card>();
        COLOR = new ArrayList<String>();
        NUMBER = new ArrayList<Integer>();
        check = new int[10];
        MAX =0;
        ANSWER =0;

        for(int i=0; i<5; i++){
            String c = sc.next();
            int n = sc.nextInt();
            list.add(new Card(c,n));
        }
        Collections.sort(list);

        for(int i=0; i<5;i++){
            Card chk = list.get(i);
            check[chk.number] +=1;
            MAX = Math.max(MAX, chk.number);

            if(!NUMBER.contains(chk.number))
                NUMBER.add(chk.number);

            if(!COLOR.contains(chk.color))
                COLOR.add(chk.color);

        }
        // 조건 4
        if(COLOR.size()==1){
            ANSWER = Math.max(ANSWER, (MAX+600));
        }

        if(NUMBER.size()==5){
            int n = Math.abs(NUMBER.get(0)-NUMBER.get(4));
            //조건1: 모두 같은 색이면서 숫자가 연속적
            if(n==4&&COLOR.size()==1){
                ANSWER = Math.max(ANSWER, (MAX+900));
            }
            //조건5 숫자5장 연속적
            if(n==4){
                ANSWER = Math.max(ANSWER, (MAX+500));
            }

        }

        if(NUMBER.size()==2){
            //조건2 숫자카드 4장동일
            if(check[NUMBER.get(0)]==4){
                ANSWER = Math.max(ANSWER, (NUMBER.get(0)+800));
            }else if(check[NUMBER.get(1)]==4){
                ANSWER = Math.max(ANSWER, (NUMBER.get(1)+800));
            }
    
            if(check[NUMBER.get(0)]==3 &&check[NUMBER.get(1)]==2){
                ANSWER = Math.max(ANSWER, ((NUMBER.get(0)*10)+NUMBER.get(1)+700));
            }else if(check[NUMBER.get(0)]==2 &&check[NUMBER.get(1)]==3){
                ANSWER = Math.max(ANSWER, ((NUMBER.get(1)*10)+NUMBER.get(0)+700));
            }
        }else if(NUMBER.size()==3){//3장 동일
            if(check[NUMBER.get(0)]==3){
                ANSWER = Math.max(ANSWER, (NUMBER.get(0)+400));
            }else if(check[NUMBER.get(1)]==3){
                ANSWER = Math.max(ANSWER, (NUMBER.get(1)+400));
            }else if(check[NUMBER.get(2)]==3){
                ANSWER = Math.max(ANSWER, (NUMBER.get(2)+400));
            }

            if(check[NUMBER.get(0)]==2 &&check[NUMBER.get(1)]==2){
                ANSWER = Math.max(ANSWER, ((NUMBER.get(1)*10)+NUMBER.get(0)+300));
            }else if(check[NUMBER.get(0)]==2&&check[NUMBER.get(2)]==2){
                ANSWER = Math.max(ANSWER, ((NUMBER.get(2)*10)+NUMBER.get(0)+300));
            }else if(check[NUMBER.get(1)]==2 && check[NUMBER.get(2)]==2){
                ANSWER = Math.max(ANSWER, ((NUMBER.get(2)*10)+NUMBER.get(1)+300));
            }
        }else if(NUMBER.size()==4){
            for(int i=0; i<NUMBER.size();i++){
                if(check[NUMBER.get(i)]==2){
                    ANSWER = Math.max(ANSWER, (NUMBER.get(i)+200));
                    break;
                }
            }
        }

        if(ANSWER==0){
            ANSWER = MAX+100;
        }

        System.out.println(ANSWER);

    }    

}


