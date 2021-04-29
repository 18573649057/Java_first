package cn.itcast.demo1;
/*

（book001，三国演义，80）


（book002，水浒传，80）


（book003，故事会，5）
 */
public class Demo1 {
    public static void main(String[] args) {
        Book b = new Book("book001","三国演义",80);
        Book b2 = new Book("book002","水浒传",80);
        Book b3 = new Book("book003","故事会",5);

        b.show();
        b2.show();
        b3.show();

    }

}
