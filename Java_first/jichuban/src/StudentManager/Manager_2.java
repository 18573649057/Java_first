package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        lo:while (true) {
            System.out.println("------欢迎使用学生管理系统------");
            System.out.println("1，添加学生");
            System.out.println("2，修改学生");
            System.out.println("3，删除学生");
            System.out.println("4，查询学生");
            System.out.println("5，退出系统");
            System.out.println("请选择：");
            String choice = sc.next();
            int index = -1;
            switch (choice) {
                case "1":
                    //添加学生
                    addStudent(list);
                    break;
                case "2":
                    //修改学生
                    break;
                case "3":
                    //删除学生
                    deleteStudent(list);
                    break;
                case "4":
                    //查询学生
                    lookStudent(list);
                    break;
                case "5":
                    //退出系统
                    break lo;
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> list) {

    }

    public static void lookStudent(ArrayList<Student> list) {
        if (list.size()>0){
            System.out.println("学号" + "    " + "姓名" + "    " + "年龄" + "    " + "生日");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getID() + "    " + list.get(i).getName() + "    " + list.get(i).getAge()
                + "    " + list.get(i).getBirthday());
            }
        }else {
            System.out.println("暂无信息，请先输入");
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String ID = sc.next();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入生日：");
        String birthday = sc.next();
        Student stu = new Student(ID,name,age,birthday);
        list.add(stu);
    }
}
