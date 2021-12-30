import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class nojam {
    String word;
    int score;

    public nojam() {
    }

    public nojam(String word, int score) {
        this.word = word;
        this.score = score;
    }

    public double wordLength() {
        return word.length();
    }

    public double cost(int wordlength) {
        double result = (double)score / (wordLength() - wordlength);
        return result;
    }

    public String getWord() {
        return word;
    }

    public int getScore() {
        return score;
    }

}

public class backjoon_16677 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nojam> list = new ArrayList<nojam>();
        int cnt = 0;
        String Base = sc.next();
        int MAX = sc.nextInt();
        double SCORE = 0;
        int index = 0;
        boolean isempty = true;

        for (int i = 0; i < MAX; i++) {
            String str = sc.next();
            int score = sc.nextInt();
            if (Base.length() >= str.length()) {

            } else {
                list.add(new nojam(str, score));
            }

        }

        for (int i = 0; i < list.size(); i++) {
            cnt = 0;
            int k = 0;
            nojam word = list.get(i);
            for (int j = 0; j < Base.length(); j++) {

                if (Base.length() == cnt)
                    break;
                for (; k < word.wordLength();) {
                    if (Base.charAt(j) == word.getWord().charAt(k)) {
                        cnt++;
                      
                        break;
                    } else {
                        k++;
                    }
                }
            }

            if (cnt == Base.length()) {
                if (SCORE < list.get(i).cost(Base.length())) {
                    SCORE = list.get(i).cost(Base.length());
                    index = i;
                    isempty = false;
                }
            }
        }
        if (!isempty) {
            System.out.println(list.get(index).getWord());
        } else {
            System.out.println("No Jam");
        }

    }
}
