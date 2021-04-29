package day9;

import java.util.ArrayList;

public class test2_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bbb");
        list.add("cccc");
        list.add("ddd");
        list.add("eeeee");
        list.add("ffff");
        ArrayList<String> s = getlist(list);
        System.out.println(s.size());
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }

    public static ArrayList<String> getlist(ArrayList<String> list) {
        ArrayList<String> newlist = new ArrayList<>(list);
        for (int i = 0; i < newlist.size(); i++) {
            //System.out.println(newlist.get(i));
            if (newlist.get(i).length() != 3){
                newlist.remove(i);
                i--;
            }
        }
        return newlist;
    }
}
