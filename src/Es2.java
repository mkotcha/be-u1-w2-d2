import java.util.*;

import static java.lang.Math.abs;

public class Es2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;

        while (num < 0) {
            System.out.println("insert a number");
            try {
                num = abs(Integer.parseInt(scanner.nextLine()));
            } catch (NumberFormatException ex) {
                System.err.println("please insert a number");
            }
        }
        List<Integer> list = orderedList(num);
        System.out.println(list);
        System.out.println(reverseList(list));
        printList(reverseList(list), false);
    }

    public static List<Integer> orderedList(int num) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < num; i++) {
            list.add(rnd.nextInt(101));
        }
        Collections.sort(list);
        return list;
    }

    public static List<Integer> reverseList(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    public static void printList(List<Integer> list, boolean even) {
        ListIterator<Integer> i = list.listIterator();
        int num, index;
        while (i.hasNext()) {
            num = i.next();
            index = i.nextIndex();
            if (index % 2 == 0 && even) {
                System.out.println(index + " - " + num);
            }
            if (index % 2 != 0 && !even) {
                System.out.println(index + " - " + num);
            }
        }
    }

}
