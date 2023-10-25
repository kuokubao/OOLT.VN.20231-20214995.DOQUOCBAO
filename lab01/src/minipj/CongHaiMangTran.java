package minipj;

import java.util.Scanner;

public class CongHaiMangTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng và số cột của ma trận từ người dùng
        System.out.print("Nhập số hàng: ");
        int soHang = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int soCot = scanner.nextInt();

        // Khởi tạo hai ma trận
        int[][] maTran1 = new int[soHang][soCot];
        int[][] maTran2 = new int[soHang][soCot];

        // Nhập giá trị cho hai ma trận từ người dùng hoặc sử dụng giá trị mặc định
        System.out.println("Nhập các phần tử của ma trận 1:");
        nhapMaTran(maTran1, scanner);

        System.out.println("Nhập các phần tử của ma trận 2:");
        nhapMaTran(maTran2, scanner);

        // Cộng hai ma trận
        int[][] ketQuaMaTran = congHaiMaTran(maTran1, maTran2);

        // Hiển thị kết quả
        System.out.println("Ma trận kết quả:");
        hienThiMaTran(ketQuaMaTran);

        scanner.close();
    }

    // Hàm để nhập giá trị cho ma trận
    private static void nhapMaTran(int[][] maTran, Scanner scanner) {
        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[0].length; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + (i + 1) + "][" + (j + 1) + "]: ");
                maTran[i][j] = scanner.nextInt();
            }
        }
    }

    // Hàm để cộng hai ma trận
    private static int[][] congHaiMaTran(int[][] maTran1, int[][] maTran2) {
        int soHang = maTran1.length;
        int soCot = maTran1[0].length;
        int[][] ketQuaMaTran = new int[soHang][soCot];

        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                ketQuaMaTran[i][j] = maTran1[i][j] + maTran2[i][j];
            }
        }

        return ketQuaMaTran;
    }

    // Hàm để hiển thị ma trận
    private static void hienThiMaTran(int[][] maTran) {
        for (int[] hang : maTran) {
            for (int giaTri : hang) {
                System.out.print(giaTri + " ");
            }
            System.out.println();
        }
    }
}

