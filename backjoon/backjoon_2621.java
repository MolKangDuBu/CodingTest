import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class backjoon_2621 {
    
    static String []card;
    static String []number;
    static int count;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        card = new String[5];
        number = new String[5];
        List<Integer>score = new ArrayList<Integer>();
        try{
            for(int i =0; i<5;i++){
                String []line = br.readLine().split(" ");
                card[i]= line[0];
                number[i]= line[1];
            }
          
            score.add(case_1());
            score.add(case_2());
            score.add(case_3());
            score.add(case_4());
            score.add(case_5());
            score.add(case_6());
            score.add(case_7());
            score.add(case_8());
            score.add(case_9());
            
            int max=0;
           
            for(int i=0;i<score.size();i++){
                if(max <score.get(i)){
                    max = score.get(i);
                }
            }
            System.out.println(max);
        }catch(Exception e){
            e.printStackTrace();
        }   
    }



    public static int case_1(){
        String []num = number.clone();
        int count=0;
        Arrays.sort(num);

        for(int i=1;i<card.length;i++){
            if(card[0].equals(card[i])==true){
                count++;
            }else{
                break;
            }
        }
      
        if(count==4){
            count =0;
            for(int i =0; i<num.length-1;i++){
                if(Integer.valueOf(num[i+1])==(Integer.valueOf(num[i])+1)){
                    count++;
                }else return 0;       
            }
        }
        if(count==4){
           return Integer.valueOf(num[4])+900;
        }
        return 0;
    }

    public static int case_2(){
        int count=0;
        int temp=0;
        String []num = number.clone();
        Arrays.sort(num);
        if(Integer.valueOf(num[0])==Integer.valueOf(num[1])&&
        Integer.valueOf(num[1])==Integer.valueOf(num[2])&&
        Integer.valueOf(num[2])==Integer.valueOf(num[3])){
            return 800+Integer.valueOf(num[0]);
        }else  if(Integer.valueOf(num[1])==Integer.valueOf(num[2])&&
        Integer.valueOf(num[2])==Integer.valueOf(num[3])&&
        Integer.valueOf(num[3])==Integer.valueOf(num[4])){
            return 800+Integer.valueOf(num[4]);
        }

        return 0;
    }

    public static int case_3(){
        String []num = number.clone();
        Arrays.sort(num);
        int mul, sum;
        if(Integer.valueOf(num[0])==Integer.valueOf(num[1])&&
            Integer.valueOf(num[1])==Integer.valueOf(num[2])){
                if(Integer.valueOf(num[3])==Integer.valueOf(num[4])){
                    mul =  Integer.valueOf(num[0])*10;
                    sum = Integer.valueOf(num[3]);
                    return 700+mul+sum;
            
        }else if(Integer.valueOf(num[2])==Integer.valueOf(num[3])&&
            Integer.valueOf(num[3])==Integer.valueOf(num[4])){
                if(Integer.valueOf(num[0])==Integer.valueOf(num[1])){
                    mul =  Integer.valueOf(num[2])*10;
                    sum = Integer.valueOf(num[0]);
                    return 700+mul+sum;
                }
            }
        }       
        return 0;
    }

    public static int case_4(){
        if(card[0].compareTo(card[1])==0&&card[0].compareTo(card[2])==0&&
        card[0].compareTo(card[3])==0&&card[0].compareTo(card[4])==0){
            String []num = number.clone();
            Arrays.sort(num);
            return 600+Integer.valueOf(num[4]);
        }
        return 0;
    }

    public static int case_5(){
        String []num = number.clone();
        Arrays.sort(num);
        int cnt=0;

        for(int i=0;i<num.length-1;i++){
            if((Integer.valueOf(num[i])+1)==Integer.valueOf(num[i+1])){
                cnt++;
            }else{
                return 0;
            }
        }

        if(cnt==4){
            return 500+Integer.valueOf(num[4]);
        }
        return 0;
    }

    public static int case_6(){
        String []num = number.clone();
        Arrays.sort(num);

        if(Integer.valueOf(num[0])==Integer.valueOf(num[1])&&
        Integer.valueOf(num[1])==Integer.valueOf(num[2])){
            return 400+Integer.valueOf(num[0]);
        }else if(Integer.valueOf(num[2])==Integer.valueOf(num[3])&&
        Integer.valueOf(num[3])==Integer.valueOf(num[4])){
            return 400+Integer.valueOf(num[2]);
        }else if(Integer.valueOf(num[1])==Integer.valueOf(num[2])&&
        Integer.valueOf(num[2])==Integer.valueOf(num[3])){
            return 400+Integer.valueOf(num[1]);
        }
        return 0;
    }

    public static int case_7(){
        String []num = number.clone();
        Arrays.sort(num);

        if(Integer.valueOf(num[0])==Integer.valueOf(num[1])
            &&Integer.valueOf(num[2])==Integer.valueOf(num[3])){
            if(Integer.valueOf(num[0])>Integer.valueOf(num[2])){
                return 300+Integer.valueOf(num[2])+(Integer.valueOf(num[0])*10);
            }else return 300+Integer.valueOf(num[0])+(Integer.valueOf(num[2])*10);
                
        }else if(Integer.valueOf(num[0])==Integer.valueOf(num[1])
        &&Integer.valueOf(num[3])==Integer.valueOf(num[4])){
            if(Integer.valueOf(num[0])>Integer.valueOf(num[3])){
                return 300+Integer.valueOf(num[3])+(Integer.valueOf(num[0])*10);
            }else return 300+Integer.valueOf(num[0])+(Integer.valueOf(num[3])*10);

        }else if(Integer.valueOf(num[1])==Integer.valueOf(num[2])
        &&Integer.valueOf(num[3])==Integer.valueOf(num[4])){
            if(Integer.valueOf(num[1])>Integer.valueOf(num[3])){
                return 300+Integer.valueOf(num[3])+(Integer.valueOf(num[1])*10);
            }else return 300+Integer.valueOf(num[1])+(Integer.valueOf(num[3])*10);
        }

        return 0;

    }

    public static int case_8(){
        String []num = number.clone();
        Arrays.sort(num);
        if(Integer.valueOf(num[0])==Integer.valueOf(num[1])){
            return Integer.valueOf(num[0])+200;
        }else if(Integer.valueOf(num[1])==Integer.valueOf(num[2])){
            return Integer.valueOf(num[1])+200;
        }else if(Integer.valueOf(num[2])==Integer.valueOf(num[3])){
            return Integer.valueOf(num[2])+200;
        }else if(Integer.valueOf(num[3])==Integer.valueOf(num[4])){
            return Integer.valueOf(num[3])+200;
        }
        return 0;
    }
    
    public static int case_9(){
        String []num = number.clone();
        Arrays.sort(num);

        return 100+Integer.valueOf(num[4]);
    }
}


