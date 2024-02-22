package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> items = new ArrayList<>();
        Collections.addAll(items, "a", "b", "c");
    }

}
