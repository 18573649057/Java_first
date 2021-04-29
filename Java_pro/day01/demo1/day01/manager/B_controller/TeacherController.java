package demo1.day01.manager.B_controller;

import demo1.day01.manager.C_service.TeacherService;
import demo1.day01.manager.E_domain.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

/*
    1. 将添加的功能，重新带着代码写一遍
    2. 将其他全能，写完。
 */
// 前台  负责【接收】和【响应】用户
public class TeacherController {
    Scanner sc = new Scanner(System.in);
    TeacherService ts = new TeacherService();

    public void start() {
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addTeacher();
                    break;
                case "2":
                    deleteTeacher();
                    break;
                case "3":
                    updateTeacher();
                    break;
                case "4":
                    findAllTeacher();
                    break;
                case "5":
                default:
                    System.out.println("您的输入有误, 请重新输入");
                    return;
            }
        }
    }

    private void updateTeacher() {
        // 判断用户录入id是否存在。
        System.out.println("请录入老师id");
        String id = sc.next();
        boolean flag = ts.isExists(id);
        if(flag == false){
            // 则证明id不存在。  也就是没有这个人。
            System.out.println("查无此人！");
            return;  // 结束方法
        }
        // 如果没有结束方法，那么继续录入其他数据
        System.out.println("请录入老师新姓名");
        String name = sc.next();
        System.out.println("请录入老师新年龄");
        int age = sc.nextInt();
        System.out.println("请录入老师新生日");
        String birthday = sc.next();
        // 将录入的数据，封装成一个对象
        Teacher t = new Teacher(id, name, age, birthday);
        // 继续将数据较给业务员
        ts.updateTeacher(t);
        System.out.println("修改成功！");
    }

    private void deleteTeacher() {
        // 接收用户输入id
        System.out.println("请录入老师id");
        String id = sc.next();
        // 将id较给业务员。
        boolean flag = ts.deleteTeacher(id);
        if (flag == true) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败！");
        }
    }

    private void findAllTeacher() {
        // 将数据给用户展示。
        // 数据得问后面的人要。
        ArrayList<Teacher> list = ts.findAllTeacher();
        System.out.println("学号\t\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < list.size(); i++) {
            Teacher tea = list.get(i);
            System.out.println(tea.getId() + "\t" + tea.getName() + "\t" + tea.getAge() + "\t" + tea.getBirthday());
        }
    }

    private void addTeacher() {
        // 接收键盘录入的数据
        String id = null;
        while (true) {
            System.out.println("请录入老师id");
            id = sc.next();
            // 判断，id是否已经存在。    这个判断的业务，不能是前台完成，应该找业务员处理
            // 如果不存在，才能继续录入   false
            // 如果存在，让他重新录入     true
            boolean flag = ts.isExists(id); // 判断id是否存在的方法
            if (flag == false) {
                // flag 为 false，则证明id不存在，可以结束循环，继续录入数据
                break;
            }
            System.out.println("id存在，请重新录入。");
        }

        System.out.println("请录入老师姓名");
        String name = sc.next();
        System.out.println("请录入老师年龄");
        int age = sc.nextInt();
        System.out.println("请录入老师生日");
        String birthday = sc.next();
        // 将录入的数据，封装成一个对象
        Teacher t = new Teacher(id, name, age, birthday);
        // 将数据传递给业务员
        // 叫人过来。  创建对象

        ts.addTeacher(t);
        System.out.println("添加成功");
    }

}
