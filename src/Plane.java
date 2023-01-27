import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plane {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rowLength = 8;
        int n = Integer.parseInt(reader.readLine());
        System.out.println(n);
//        char[][] seats = new char[n][rowLength];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < rowLength; j++) {
//                seats[i][j] = (char) reader.read();
////                System.out.print(seats[i][j]);
//            }
//        }
        int k = Integer.parseInt(reader.readLine());
        for (int i = 0; i < k; i++) {
            int number = (char) reader.read();
            System.out.println(number);
        }

    }
}
