package minipj;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepVaTinhToanMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của mảng
        System.out.print("Nhập kích thước của mảng: ");
        int kichThuoc = scanner.nextInt();

        // Khai báo và nhập các phần tử của mảng
        int[] mang = new int[kichThuoc];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < kichThuoc; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(mang);

        // Hiển thị mảng đã sắp xếp
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(mang));

        // Tính tổng và trung bình cộng
        int tong = 0;
        for (int so : mang) {
            tong += so;
        }
        double trungBinhCong = (double) tong / kichThuoc;

        // Hiển thị tổng và trung bình cộng
        System.out.println("Tổng các phần tử của mảng: " + tong);
        System.out.println("Trung bình cộng của mảng: " + trungBinhCong);

        // Đóng scanner
        scanner.close();
    }
}
