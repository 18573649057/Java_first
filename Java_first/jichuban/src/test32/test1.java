package test32;

import java.util.Random;
import java.util.Scanner;

/*定义一个5的int数组arr，输入5个1-60的数字作为元素；
生成包含2-10随机数；
遍历数组中不是随机数的元素输出
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int []arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入1-60的整数：");
            arr[i] = sc.nextInt();
        }
        System.out.println("请输入2-10的整数：");
        int nun = r.nextInt(9)+2;
        System.out.println(nun);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % nun != 0){
                System.out.println("不是随机数的倍数的有：" + arr[i]);
            }
        }
    }
}
