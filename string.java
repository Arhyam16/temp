import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // char[][] arr = new char[r][c];
        
        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         arr[i][j] = sc.next().charAt(0);
        //     }
        // }

        // throw new ArithmeticException("" + Arrays.deepToString(arr) + "" + r + " " + c);
        ArrayList<String> list = new ArrayList<>();
        
        while (sc.hasNextLine()) {
            list.add(sc.nextLine());
        }
         throw new ArithmeticException("" + list);
    }
}
        
        