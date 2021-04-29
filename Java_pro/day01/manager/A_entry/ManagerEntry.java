package cn.itcast.manager.A_entry;

import cn.itcast.manager.B_controller.TeacherController;

import java.util.Scanner;

// 大门
public class ManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    break;
                case "2":
                    // 叫老师接待过来。
                    TeacherController tc = new TeacherController();
                    tc.start();
                    break;
                default:
                    return;
            }
        }
    }
}
