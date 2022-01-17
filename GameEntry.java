import java.util.Arrays;
import java.util.Scanner;

public class GameEntry {
    private int score;
    private String name;
    public GameEntry(int score, String name) {
            this.score = score;
            this.name = name;
        }
    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
    public String toString()
    {
        return"("+score+","+name+")";
    }

    public static void main(String[] args) {
        int pos = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GameEntry[] arr = new GameEntry[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new GameEntry(sc.nextInt(), sc.next());
        }
         // Arrays.sort(arr);
       // int max = arr[0].score;
        for (int i = 0; i < n; i++) {
            int max=0;
            for (int j = 0; j < n; j++) {
                //int b = Math.max(max, arr[i].getScore());
                if (arr[j].getScore() > max) {
                    max = arr[j].getScore();
                    pos = j;
                }
            }
            System.out.println(arr[pos].toString());
            arr[pos].score=0;
        }
    }
}
