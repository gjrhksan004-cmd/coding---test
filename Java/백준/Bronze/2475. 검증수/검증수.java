import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] n = new int[5];
        int sum = 0;
        for (int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++){
            sum += (n[i] * n[i]);
        }
        int result = sum % 10;
        System.out.println(result);
        }

    }
