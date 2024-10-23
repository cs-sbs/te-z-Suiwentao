package org.example;

import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;

        while (true) {
            int num = scanner.nextInt(); // 读取整数输入
            if (num == -1) { // 输入 -1 时结束输入
                break;
            }
            if (num % 2 == 0) { // 偶数判断
                evenCount++;
            } else { // 奇数判断
                oddCount++;
            }
        }

        System.out.println(oddCount + " " + evenCount); // 输出奇数个数和偶数个数
    }
}