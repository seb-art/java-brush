package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void print(String message) {

    }

    public static void consumer() {

        List<String> list = List.of("a", "b", "c");
        Consumer<String> print = (item -> System.out.println(item));
        Consumer<String> printUpperCase = (item -> System.out.println(item.toUpperCase()));
        list.forEach(print.andThen(printUpperCase));

    }

    public static void supplier() {
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);
    }

    public static void funct() {
        Function<String, Integer> map = str -> str.length();
        var len = map.apply("sky");
        System.out.println(len);
    }

    public static void composingFunctions() {
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        var result = replaceColon.andThen(addBraces).apply("key:value");
        System.out.println(result);

        // var result = addBraces.compose(replaceColon).apply("key:value");

    }

    public static void predicate() {
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var result = isLongerThan5.test("Sebastian");

    }

}
