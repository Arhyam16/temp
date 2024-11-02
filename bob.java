import java.util.*;
public class bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int p = sc.nextInt();
        // int[] a = new int[n];
        // int[] b = new int[p];

        // if(n==3){
        //     System.out.println("1");
        // }
        ArrayList<Integer> list = new ArrayList<>();

        while(sc.hasNextLine()){
            list.add(sc.nextInt());
        }
        int n = list.size();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
         throw new ArithmeticException("" + Arrays.toString(arr));
    }
}
