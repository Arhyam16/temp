import java.util.*;

public class dim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int R = sc.nextInt();
        int[][] arr = new int[R][C];
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        throw new ArithmeticException("" + Arrays.deepToString(arr));

    }
}