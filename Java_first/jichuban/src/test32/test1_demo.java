package test32;

import java.util.ArrayList;

public class test1_demo {
    public static void main(String[] args) {
        ArrayList<Singer> p = new ArrayList<>();
        Singer s1 = new Singer("刘德华", 25, "打篮球");
        Singer s2 = new Singer("张学友", 35, "游泳");
        Singer s3 = new Singer("郭富城", 19, "踢足球");
        Singer s4 = new Singer("黎明", 18, "击剑");
        p.add(s1);
        p.add(s2);
        p.add(s3);
        p.add(s4);
        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i).getName() + "    " + p.get(i).getAge() + "    " + p.get(i).getLike());
            if (p.get(i).getAge() > 30) {
                p.get(i).setLike("打保龄球");

            }
            if (p.get(i).getAge() < 20) {
                p.remove(i);
                i--;
            }
        }
        System.out.println("--------");
        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i).getName() + "    " + p.get(i).getAge() + "    " + p.get(i).getLike());
        }
    }
}
