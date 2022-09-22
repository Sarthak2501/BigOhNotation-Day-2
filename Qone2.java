import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Qone2 {
    public static List<Integer> removeDuplicates(ArrayList values) {
        Collections.sort(values);

        for (int i = 0 ; i < values.size() - 1; i++) {
//            System.out.println(i);
            if (values.get (i) == values.get(i + 1)) {
                values.remove(i);
            }
        }
        return values;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(6);
        arr.add(7);
        arr.add(4);
        arr.add(8);
        arr.add(6);
        List<Integer> nondup = removeDuplicates(arr);
        System.out.println(nondup);
    }
}