import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int num = sc.nextInt();

        int[][] list = new int[t][num];

        for(int i =0; i < t; i++) {
            for(int j = 0; j < num; j++) {
                int num2 = sc.nextInt();
                list[i][j] = num2;
            }
        }
        for(int i =0; i < t; i++) {
            for(int j = 0; j < num; j++) {
                int num2 = sc.nextInt();
                list[i][j] = list[i][j]+num2;
            }
        }
        for(int i =0; i < t; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}