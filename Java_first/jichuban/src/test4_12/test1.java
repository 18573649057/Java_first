package test4_12;

import java.util.Random;

/*随机生成六个1-10（包含1和10）之间的数存入数组中,然后计算出去掉最大值与
最小值的平均数（如果有两个最大值或者有两个最小值只去掉一个即可），输出格式如下：*/
public class test1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        System.out.println("数组中的数据为：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
        int a = arr[0];
        int b = arr[0];
        int count = arr[0];
        int pj = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }
            if (b > arr[i]) {
                b = arr[i];
            }
            count += arr[i];
        }
        pj = (count - a - b)/arr.length;
        System.out.println(" ");
        System.out.println("最大值为：" + a);
        System.out.println("最小值为：" + b);
        System.out.println("平均值为：" + pj);
    }
}
