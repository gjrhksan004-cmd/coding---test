import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstNum = Integer.parseInt(st.nextToken());
        int min = firstNum;
        int max = firstNum;
        for (int i = 1; i < N; i++) {
            int current = Integer.parseInt(st.nextToken());
            if (current < min) min = current;
            if (current > max) max = current;
        }
        System.out.println(min + " " + max);
    }
}