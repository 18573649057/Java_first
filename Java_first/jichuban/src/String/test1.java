package String;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "曾彦士";
        String password = "3838438";
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入账户名：");
            String username1 = sc.nextLine();
            System.out.println("请输入密码：");
            String password1 = sc.nextLine();
            if (username.equals(username1) && password.equals(password1)){
                System.out.println("登陆成功");
                break;
            }else {
                if (i < 3) {
                    System.out.println("密码错误，还剩" + (3 - i) + "次机会");
                }else {
                    System.out.println("今日次数已用完，请明日再试");
                }
            }
        }

    }
}
