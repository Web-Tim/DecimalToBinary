import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    private static ArrayList<Integer> binaryNum = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("Gib eine Dezimalzahl zum Konvertieren an!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int newNum = Integer.valueOf(reader.readLine());

        while (true) {
            if (newNum == 0) break;

            binaryNum.add(newNum % 2);
            newNum /= 2;
        }
        Collections.reverse(binaryNum);
        binaryNum.forEach(System.out::print);
    }
}
