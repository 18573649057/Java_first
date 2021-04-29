package demo1.day01.demo1;

import java.util.Random;

/*
随机生成六个1-10（包含1和10）之间的数存入数组中,
然后计算出去掉最大值与最小值的平均数（如果有两个最大值或者有两个最小值只去掉一个即可），
输出格式如下：
分析：
    1. Random生成随机数
    2. 创建一个数组。来容纳随机数
    3. 获取最大值，最小值，和
    4. 求平均数    sum - max - min / (arr.length - 2)
 */
public class Demo2 {
    public static void main(String[] args) {
        // 1. Random生成随机数
        Random r = new Random();
        // 2. 创建一个数组。来容纳随机数
        int[] arr = new int[6];  //{0,0,0,0,0,0}
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        // 使用循环，将随机数存入数组
        for (int i = 0; i < arr.length; i++) {
            // i = 0 - 5
            arr[i] = r.nextInt(10) + 1;  // 1-10
            System.out.print(arr[i] + " ");
            min = arr[0];
            if(min > arr[i]) {
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
            sum += arr[i];
        }

       /* int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);*/

        System.out.println();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);

        double avg = 1.0 * (sum - max - min) / (arr.length - 2);
        System.out.println(avg);

    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];  // min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
