import java.util.*;

public class Acid {
    private static boolean isSorted(Integer[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int acid(int n, Integer[] bottles) {
        if (isSorted(bottles)) {
            List<Integer> bottlesList = Arrays.asList(bottles);
            return Collections.max(bottlesList) - Collections.min(bottlesList);
        } else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Integer[] bottles = new Integer[n];
        for (int i = 0; i < n; ++i) {
            bottles[i] = scanner.nextInt();
        }
        System.out.println(acid(n, bottles));
    }
}