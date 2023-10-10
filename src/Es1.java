import java.util.HashSet;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Es1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = -1, i = 0;
        String str = "";
        while (num < 0) {
            System.out.println("insert a number");
            try {
                num = abs(Integer.parseInt(scanner.nextLine()));
            } catch (NumberFormatException ex) {
                System.err.println("please insert a number");
            }
        }
        HashSet<String> wordSet = new HashSet<String>();
        HashSet<String> duplicatedSet = new HashSet<String>();
        while (i < num) {
            System.out.println("insert string number " + (i + 1));
            str = scanner.nextLine();
            if (wordSet.contains(str)) {
                System.out.println(str + " already inserted");
                duplicatedSet.add(str);
                i++;
            } else {
                wordSet.add(str);
                i++;
            }
        }
        System.out.println("duplicated words: " + duplicatedSet);
        System.out.println("we have " + wordSet.size() + " unique words: " + wordSet);
    }
}
