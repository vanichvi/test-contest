import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Distance {
    public static int f(int i, int[] numbers) {
        return 0;
    }
    public static ArrayList<int[]> subset(int[] numbers, int size){
        Arrays.sort(numbers);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(new ArrayList<>(size));
        for(int i:numbers){
//            for(int j)
        }

        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i =0; i<n; i++){
            System.out.print(f(i, numbers));
        }
    }
}
