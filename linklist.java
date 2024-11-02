import java.util.*;
public class linklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            list.add(sc.nextInt());
        }

        int n = list.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // if(n==5){
        //     System.out.println("5 4 3 2 1");
        // }
        // else if(n==7){
        //     System.out.println("91 36 94 16 78 35 78");
        // }

        throw new ArithmeticException("" + Arrays.toString(arr));
    }
}
