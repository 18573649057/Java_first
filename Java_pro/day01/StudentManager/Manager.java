package cn.itcast.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

/*
dao
controller
service
 */

//2. 再建一个有主方法的类，用来运行程序。
public class Manager {
    public static void main(String[] args) {
        // 因为要涉及到多个学生，所以要将学生存入一个容器。(集合)
        ArrayList<Student> list = new ArrayList<>();  // 仓库
        // 4. 让用户录入自己的选择。
        Scanner sc = new Scanner(System.in);
        // 3. 主方法运行时，将菜单进行展示。
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            // 用户选择
            String choose = sc.next();
            switch (choose) {
                case "1":
                    //添加学生
                    addStudent(list);
                    break;
                case "2":
                    //删除学生
                    deleteStudent(list);
                    break;
                case "3":
                    //修改学生
                    updateStudent(list);
                    break;
                case "4":
                    //查看所有学生
                    printStudentInfo(list);
                    break;
                default:
                    // 退出
                    return;// main方法结束，就等于退出程序
            }
        }
    }

    /*
          功能：   帮我将集合中的学生修改。
          参数：   装有学生的集合、
          返回值： 没有
     */
    public static void updateStudent(ArrayList<Student> list){
        // 4. 让用户录入自己的选择。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要修改的学生id:");
        String id = sc.next();
        int index = -1;
        // 也得从集合中找，有没有这个学生。
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getId().equals(id)){
                index = i; // 记录这个学生所在的索引位置 证明这个id存在
                break;
            }
        }
        // 存在，则可以修改
        if(index != -1){
            System.out.println("请录入学生新姓名：");
            String name = sc.next();
            System.out.println("请录入学生新年龄：");
            int age = sc.nextInt();
            System.out.println("请录入学生新生日：");
            String brithday = sc.next();
            // 创建学生对象
            Student s = new Student(id,name,age,brithday);
            list.set(index,s);
            System.out.println("修改成功");
        }else{
            System.out.println("您想要修改的学生不存在。");
        }
    }

    /*
          功能：   帮我将集合中的学生删除。
          参数：   装有学生的集合、
          返回值： 没有
     */
    public static void deleteStudent(ArrayList<Student> list){
        // 4. 让用户录入自己的选择。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要删除的学生id:");
        String id = sc.next();  // hm007
        boolean flag = false;
        // 到集合中找，有没有这个id的学生
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getId().equals(id)){
                flag = true; // 证明这个id存在
                list.remove(i);
                System.out.println("删除成功");
                break;
            }
        }
        if(flag == false){
            System.out.println("您想要删除的id不存在。");
        }
    }
    /*
          功能：   帮你打印学生信息。
          参数：   装有学生的集合、
          返回值： 没有
     */
    public static void printStudentInfo(ArrayList<Student> list){
        System.out.println("学号     姓名     年龄      生日");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId()+"    "+stu.getName()+"    "+stu.getAge()+"    "+stu.getBrithday());
        }
    }

    /*
        功能：   添加学生到集合中。
        参数：   装学生的集合
        返回值：
    */
    public static void addStudent(ArrayList<Student> list){
        // 4. 让用户录入自己的选择。
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入学生学号：");
        String id = sc.next();
        System.out.println("请录入学生姓名：");
        String name = sc.next();
        System.out.println("请录入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请录入学生生日：");
        String brithday = sc.next();
        // 创建学生对象
        Student s = new Student(id,name,age,brithday);
        list.add(s);
        System.out.println("添加成功！");
    }
}
