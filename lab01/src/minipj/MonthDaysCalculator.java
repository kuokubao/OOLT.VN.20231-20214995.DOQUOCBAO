package minipj;

import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthNumber;
        int year;

        // Nhập và kiểm tra tháng
        String monthInput;
        do {
            System.out.print("Nhập tháng (tên đầy đủ, viết tắt, 3 chữ cái, hoặc số): ");
            monthInput = scanner.nextLine().toLowerCase();
            monthNumber = getMonthNumber(monthInput);
            if (monthNumber == -1) {
                System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
            }
        } while (monthNumber == -1);

        // Nhập và kiểm tra năm
        do {
            System.out.print("Nhập năm: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Năm không hợp lệ. Vui lòng nhập năm hợp lệ.");
                scanner.next(); // Tiêu thụ đầu vào không hợp lệ
            }
            year = scanner.nextInt();
            if (year < 0) {
                System.out.println("Năm không hợp lệ. Vui lòng nhập năm hợp lệ.");
            }
        } while (year < 0);

        // Hiển thị số ngày trong tháng và năm đã nhập
        int daysInMonth = getDaysInMonth(monthNumber, isLeapYear(year));
        if (daysInMonth == -1) {
            System.out.println("Tháng không hợp lệ. Vui lòng nhập tháng hợp lệ.");
        } else {
            System.out.println("Số ngày trong " + getMonthName(monthNumber) + " " + year + ": " + daysInMonth);
        }

        // Đóng scanner
        scanner.close();
    }

    // Phương thức để kiểm tra xem một năm có phải là năm nhuận không
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Phương thức để lấy số ngày trong một tháng
    private static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return isLeapYear ? 29 : 28;
            default:
                return -1;
        }
    }

    // Phương thức để lấy tên của một tháng
    private static String getMonthName(int month) {
        String[] monthNames = {
                "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6",
                "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"
        };

        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "";
        }
    }

    // Phương thức để chuyển đổi đầu vào tháng thành số
    private static int getMonthNumber(String monthInput) {
        switch (monthInput) {
            case "tháng 1", "tháng 01", "tháng một", "1":
                return 1;
            case "tháng 2", "tháng 02", "tháng hai", "2":
                return 2;
            case "tháng 3", "tháng 03", "tháng ba", "3":
                return 3;
            case "tháng 4", "tháng 04", "tháng bốn", "4":
                return 4;
            case "tháng 5", "tháng 05", "tháng năm", "5":
                return 5;
            case "tháng 6", "tháng 06", "tháng sáu", "6":
                return 6;
            case "tháng 7", "tháng 07", "tháng bảy", "7":
                return 7;
            case "tháng 8", "tháng 08", "tháng tám", "8":
                return 8;
            case "tháng 9", "tháng 09", "tháng chín", "9":
                return 9;
            case "tháng 10", "tháng mười", "10":
                return 10;
            case "tháng 11", "tháng mười một", "11":
                return 11;
            case "tháng 12", "tháng mười hai", "12":
                return 12;
            default:
                return -1;
        }
    }
}
