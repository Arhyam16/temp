import java.util.*;
public class removestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            
        }

        int n = list.size();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        throw new ArithmeticException( "" + Arrays.toString(arr));
    }
}
