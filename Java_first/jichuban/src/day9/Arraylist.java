package day9;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Arraylist<S> extends ArrayList<String> {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("我");
        arr.add("儿");
        arr.add("曾");
        arr.add("彦");
        arr.add("士");
        /*arr.remove("曾");
        String x =arr.get(0);
        System.out.println(arr);
        System.out.println(x);
        arr.set(3,"曾");
        System.out.println(arr);
        arr.size();
        System.out.println(a);*/
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    @Override
    public Stream<String> stream() {
        return null;
    }
}
