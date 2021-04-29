package test4_12;

import javax.naming.Name;

public class Book {
    /*现有三本图书的信息，信息分别是【编号】【书名】【价格】，具体内容为
（book001，三国演义，80）
（book002，水浒传，80）
（book003，故事会，5）*/
    private String Num;
    private String Name;
    private int Price;

    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        Num = num;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public Book(String num, String name, int price) {
        Num = num;
        Name = name;
        Price = price;
    }
    public Book(){

    }
    //该类提供 show 方法，
    //该方法能够打印出所有的图书信息
    public void show(){
        //图书编号:book001,书名:三国演义,价格80
        System.out.println("图书编号：" + getNum() + ",书名：" + getName() + ",价格：" + getPrice());
    }
}
