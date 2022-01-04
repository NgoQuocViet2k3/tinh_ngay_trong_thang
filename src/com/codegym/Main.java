package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tháng nào bạn muốn đếm ngày? ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 hoặc 29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = " 31 ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = " 30 ngày";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth != "") {
            System.out.printf("Tháng %d có %s ", month, daysInMonth);
        } else {
            System.out.printf("Đầu vào không hợp lệ");

        }
    }
}
