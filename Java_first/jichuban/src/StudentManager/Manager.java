package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<>();
        while (true){
                Scanner sc = new Scanner(System.in);
                System.out.println("------欢迎使用学生管理系统------");
                System.out.println("1，学生添加");
                System.out.println("2，学生修改");
                System.out.println("3，学生删除");
                System.out.println("4，学生查询");
                System.out.println("5，退出系统");
                System.out.println("---请选择：---");
                int choice = sc.nextInt();
            switch (choice){
                case 1://学生增加
                    System.out.println("已进入添加学生界面：");
                    System.out.println("请输入学生ID：");
                    String ID = sc.next();
                    System.out.println("请输入学生姓名：");
                    String name = sc.next();
                    System.out.println("请输入学生年龄：");
                    int age = sc.nextInt();
                    System.out.println("请输入学生生日：");
                    String birthday = sc.next();
                    Student stu = new Student(ID,name,age,birthday);
                    arr.add(stu);
                    System.out.println("添加成功！");
                    break;
                case 2://学生修改
                    System.out.println("请输入你要修改的学号：");
                    String a = sc.next();
                    int c = 1;
                    for (int i = 0; i < arr.size(); i++) {
                        Student n = arr.get(i);
                        if (a.equals(n.getID())){
                            c = 2;
                            break;
                        }
                        }
                    if (c != 1){
                        System.out.println("请输入新学生姓名：");
                        String name1 = sc.next();
                        System.out.println("请输入新学生年龄：");
                        int age1 = sc.nextInt();
                        System.out.println("请输入新学生生日：");
                        String birthday1 = sc.next();
                        Student stu1 = new Student(a,name1,age1,birthday1);
                        arr.set(c,stu1);
                        System.out.println("修改成功！");
                    }else {
                        System.out.println("你要修改的账号不存在！");
                    }

                    break;
                case 3://学生删除
                    System.out.println("请输入你要删除的学号：");
                    String d = sc.next();
                    boolean flag = false;
                    for (int i = 0; i < arr.size(); i++) {
                        Student b = arr.get(i);
                        if (d.equals(b.getID())){
                            flag = true;
                            arr.remove(i);
                            System.out.println("删除成功！");
                        }
                    }
                        if (flag = false){
                            System.out.println("你输入的学号不存在！");
                        }
                    break;
                case 4://学生查询
                    System.out.println("学号    姓名    年龄    生日");
                    for (int i = 0; i < arr.size(); i++) {
                        Student x = arr.get(i);
                        System.out.println(x.getID() + "    " + x.getName() + "    " +x.getAge() + "    " +x.getBirthday());
                    }
                    break;
                case 5://退出系统
                    return;

            }
        }
    }
}
