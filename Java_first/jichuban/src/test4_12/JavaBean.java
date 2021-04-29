package test4_12;

public class JavaBean {
    /*需求：现有三本图书的信息，信息分别是【编号】【书名】【价格】，具体内容为
（book001，三国演义，80）
（book002，水浒传，80）
（book003，故事会，5）
请使用所学习的封装思想，编写出标准的 JavaBean类，将数据封装到一个 Book 类中，该类提供 show 方法，
该方法能够打印出所有的图书信息，并在测试类中通过有参构造方法创建3个图书对象，调用show方法
运行结果：
```java
图书编号:book001,书名:三国演义,价格80
图书编号:book002,书名:水浒传,价格80
图书编号:book003,书名:故事会,价格5*/
    public static void main(String[] args) {
        Book b1 = new Book("book1","三国演义",80);
        Book b2 = new Book("book2","水浒传",80);
        Book b3 = new Book("book3","故事会",5);
        b1.show();
        b2.show();
        b3.show();
    }
}
