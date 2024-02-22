package generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T item1, T item2) {
        return (item1.compareTo(item2) < 0) ? item2 : item1;

    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    public static void printUsers(GenericList<? super User> users) {
        GenericList<Object> temp = new GenericList<>();
        Object x = users.get(0);
        users.add(new User(0));

    }

}
